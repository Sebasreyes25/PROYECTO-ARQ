package org.acme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ComentarioDTOTest {

    private ComentarioDTO comentarioDTO;

    @BeforeEach
    public void setUp() {
        comentarioDTO = new ComentarioDTO();
    }

    @Test
    public void testSetAndGetIdComentario() {
        Long idComentario = 10L;
        comentarioDTO.setIdComentario(idComentario);
        Assertions.assertEquals(idComentario, comentarioDTO.getIdComentario());
    }

    @Test
    public void testSetAndGetIdHabitacion() {
        Long idHabitacion = 20L;
        comentarioDTO.setIdHabitacion(idHabitacion);
        Assertions.assertEquals(idHabitacion, comentarioDTO.getIdHabitacion());
    }

    @Test
    public void testSetAndGetIdUsuario() {
        Long idUsuario = 30L;
        comentarioDTO.setIdUsuario(idUsuario);
        Assertions.assertEquals(idUsuario, comentarioDTO.getIdUsuario());
    }

    @Test
    public void testSetAndGetTextoComentario() {
        String textoComentario = "Este es un comentario actualizado con una opinión más detallada.";
        comentarioDTO.setTextoComentario(textoComentario);
        Assertions.assertEquals(textoComentario, comentarioDTO.getTextoComentario());
    }

    @Test
    public void testSetAndGetRating() {
        Integer rating = 3; 
        comentarioDTO.setRating(rating);
        Assertions.assertEquals(rating, comentarioDTO.getRating());
    }

    @Test
    public void testSetAndGetNombreUsuario() {
        String nombreUsuario = "Usuario Demo";
        comentarioDTO.setNombreUsuario(nombreUsuario);
        Assertions.assertEquals(nombreUsuario, comentarioDTO.getNombreUsuario());
    }

    
    

    @Test
    public void testSetAndGetIdComentarioPadre() {
        Long idComentarioPadre = 40L;
        comentarioDTO.setIdComentarioPadre(idComentarioPadre);
        Assertions.assertEquals(idComentarioPadre, comentarioDTO.getIdComentarioPadre());
    }

    @Test
    public void testSetAndGetNuevoTextoComentario() {
        String textoComentario = "Un segundo comentario con otro enfoque.";
        comentarioDTO.setTextoComentario(textoComentario);
        Assertions.assertEquals(textoComentario, comentarioDTO.getTextoComentario());
    }

    @Test
    public void testSetAndGetOtroRating() {
        Integer otroRating = 1;  
        comentarioDTO.setRating(otroRating);
        Assertions.assertEquals(otroRating, comentarioDTO.getRating());
    }


}