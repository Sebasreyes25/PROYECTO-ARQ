package org.acme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

public class ComentarioTest {

    private Comentario comentario;

    @BeforeEach
    public void setUp() {
        // Inicializamos un objeto Comentario antes de cada test
        comentario = new Comentario();
    }

    @Test
    public void testSetAndGetIdComentario() {
        Long idEsperado = 10L;
        comentario.setIdComentario(idEsperado);
        // Verificamos que el ID se estableció correctamente
        Assertions.assertEquals(idEsperado, comentario.getIdComentario());
    }

    @Test
    public void testSetAndGetIdHabitacion() {
        Long idHabitacion = 20L;
        comentario.setIdHabitacion(idHabitacion);
        // Verificamos que el ID de la habitación se estableció correctamente
        Assertions.assertEquals(idHabitacion, comentario.getIdHabitacion());
    }

    @Test
    public void testSetAndGetIdUsuario() {
        Long idUsuario = 30L;
        comentario.setIdUsuario(idUsuario);
        // Verificamos que el ID del usuario se estableció correctamente
        Assertions.assertEquals(idUsuario, comentario.getIdUsuario());
    }

    @Test
    public void testSetAndGetTextoComentario() {
        String texto = "Servicio promedio, no fue tan bueno como esperaba.";
        comentario.setTextoComentario(texto);
        // Verificamos que el texto del comentario se estableció correctamente
        Assertions.assertEquals(texto, comentario.getTextoComentario());
    }

    @Test
    public void testSetAndGetRating() {
        Integer rating = 3;  // Cambiamos el rating a 3
        comentario.setRating(rating);
        // Verificamos que el rating se estableció correctamente
        Assertions.assertEquals(rating, comentario.getRating());
    }

    @Test
    public void testSetAndGetFechaComentario() {
        LocalDateTime fecha = LocalDateTime.of(2023, 5, 14, 16, 45);
        comentario.setFechaComentario(fecha);
        // Verificamos que la fecha del comentario se estableció correctamente
        Assertions.assertEquals(fecha, comentario.getFechaComentario());
    }

    @Test
    public void testSetAndGetIdComentarioPadre() {
        Long idComentarioPadre = 40L;
        comentario.setIdComentarioPadre(idComentarioPadre);
        // Verificamos que el ID del comentario padre se estableció correctamente
        Assertions.assertEquals(idComentarioPadre, comentario.getIdComentarioPadre());
    }

    @Test
    public void testSetAndGetNuevoTextoComentario() {
        String texto = "El ambiente fue agradable, pero el servicio fue lento.";
        comentario.setTextoComentario(texto);
        // Verificamos el nuevo texto del comentario
        Assertions.assertEquals(texto, comentario.getTextoComentario());
    }

    @Test
    public void testSetAndGetOtroRating() {
        Integer otroRating = 1;
        comentario.setRating(otroRating);
        // Verificamos que el rating se estableció correctamente
        Assertions.assertEquals(otroRating, comentario.getRating());
    }
    
    @Test
    public void testSetAndGetNuevaFechaComentario() {
        LocalDateTime nuevaFecha = LocalDateTime.of(2022, 10, 31, 9, 30);
        comentario.setFechaComentario(nuevaFecha);
        // Verificamos que la nueva fecha del comentario se estableció correctamente
        Assertions.assertEquals(nuevaFecha, comentario.getFechaComentario());
    }

}
