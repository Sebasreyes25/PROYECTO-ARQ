const express = require('express');
const client = require('prom-client');

const app = express();
const collectDefaultMetrics = client.collectDefaultMetrics;

// Recolecta métricas predeterminadas como uso de memoria, CPU, etc.
collectDefaultMetrics();

// Métrica personalizada: Contador de errores de JavaScript en el frontend
const jsErrorCounter = new client.Counter({
  name: 'frontend_js_errors_total',
  help: 'Total de errores de JavaScript capturados en el frontend',
});

// Exponer las métricas en el endpoint /metrics
app.get('/metrics', async (req, res) => {
  res.set('Content-Type', client.register.contentType);
  res.end(await client.register.metrics());
});

// Endpoint para simular errores de JS desde el frontend
app.post('/report-error', (req, res) => {
  jsErrorCounter.inc();  // Incrementa el contador cuando se reporta un error de JS
  res.status(200).send('Error reportado');
});

// Iniciar el servidor en el puerto 3007
const PORT = 3007;
app.listen(PORT, '0.0.0.0', () => {
  console.log(`Servidor de métricas en el puerto ${PORT}`);
});
