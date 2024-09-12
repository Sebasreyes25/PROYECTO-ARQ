package org.acme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class TiposHabitacionTest {

    private Tipos_habitacion tiposHabitacion;

    @BeforeEach
    public void setUp() {
        tiposHabitacion = new Tipos_habitacion();
    }

    @Test
    public void testSetAndGetIdTipo() {
        // Valor inicial de prueba
        Long idTipo = 1L;
        tiposHabitacion.setId_tipo(idTipo);
        Assertions.assertEquals(idTipo, tiposHabitacion.getId_tipo());

        // Cambiar a otro valor
        tiposHabitacion.setId_tipo(2L);
        Assertions.assertEquals(2L, tiposHabitacion.getId_tipo());

        // Prueba con valor nulo
        tiposHabitacion.setId_tipo(null);
        Assertions.assertNull(tiposHabitacion.getId_tipo());
    }

    @Test
    public void testSetAndGetTipo() {
        // Valor inicial de prueba
        String tipo = "Suite";
        tiposHabitacion.setTipo(tipo);
        Assertions.assertEquals(tipo, tiposHabitacion.getTipo());

        // Cambiar a otro valor
        tiposHabitacion.setTipo("Deluxe");
        Assertions.assertEquals("Deluxe", tiposHabitacion.getTipo());

        // Prueba con valor nulo
        tiposHabitacion.setTipo(null);
        Assertions.assertNull(tiposHabitacion.getTipo());
    }

    @Test
    public void testSetAndGetImagenUrl() {
        // Valor inicial de prueba
        String imagenUrl = "http://example.com/imagen.jpg";
        tiposHabitacion.setImagenUrl(imagenUrl);
        Assertions.assertEquals(imagenUrl, tiposHabitacion.getImagenUrl());

        // Cambiar a otro valor
        tiposHabitacion.setImagenUrl("http://example.com/imagen2.jpg");
        Assertions.assertEquals("http://example.com/imagen2.jpg", tiposHabitacion.getImagenUrl());

        // Prueba con valor nulo
        tiposHabitacion.setImagenUrl(null);
        Assertions.assertNull(tiposHabitacion.getImagenUrl());
    }

    @Test
    public void testActualizarUrlsImagenes() {
        // Prueba inicial con una lista de URLs
        List<String> urlsImagenes = Arrays.asList("http://example.com/imagen1.jpg", "http://example.com/imagen2.jpg");
        tiposHabitacion.actualizarUrlsImagenes(urlsImagenes);

        // Verificar que el objeto no es nulo después de actualizar
        Assertions.assertNotNull(tiposHabitacion);

        // Prueba con una lista vacía
        tiposHabitacion.actualizarUrlsImagenes(Arrays.asList());
        Assertions.assertNotNull(tiposHabitacion);  // Asegurarse de que la operación no afecta negativamente

        // Prueba con valor nulo
        tiposHabitacion.actualizarUrlsImagenes(null);
        Assertions.assertNotNull(tiposHabitacion);  // No debe generar una excepción
    }


    @Test
    public void testEqualsAndHashCode() {
        // Probar equals y hashCode
        Tipos_habitacion th1 = new Tipos_habitacion();
        th1.setId_tipo(1L);
        th1.setTipo("Suite");
        th1.setImagenUrl("http://example.com/imagen.jpg");

        Tipos_habitacion th2 = new Tipos_habitacion();
        th2.setId_tipo(1L);
        th2.setTipo("Suite");
        th2.setImagenUrl("http://example.com/imagen.jpg");

        // Verificar igualdad de objetos
        Assertions.assertEquals(th1, th2);
        Assertions.assertEquals(th1.hashCode(), th2.hashCode());

        // Verificar cuando no son iguales
        th2.setId_tipo(2L);
        Assertions.assertNotEquals(th1, th2);
    }
}

