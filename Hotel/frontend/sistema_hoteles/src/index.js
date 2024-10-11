import './index.css';
import React from 'react';
import ReactDOM from 'react-dom/client';
import App from './App';
import reportWebVitals from './reportWebVitals';
import 'bootstrap/dist/css/bootstrap.min.css';

window.onerror = function (message, source, lineno, colno, error) {
  fetch('http://localhost:3007/report-error', {
    method: 'POST',
  }).catch((err) => console.error('Error reporting failed:', err));
};


ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <App />
  </React.StrictMode>,
);

reportWebVitals();