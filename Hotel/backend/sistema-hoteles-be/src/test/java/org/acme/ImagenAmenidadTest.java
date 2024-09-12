package org.acme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ImagenAmenidadTest {

    private ImagenAmenidad imagenAmenidad;
    private Hoteles hotel;

    @BeforeEach
    public void setUp() {
        imagenAmenidad = new ImagenAmenidad();
        hotel = new Hoteles(); 
        hotel.setId_hotel(1L); 
    }

    @Test
    public void testSetAndGetIdImagen() {
        Long idImagen = 100L;
        imagenAmenidad.setIdImagen(idImagen);
        Assertions.assertEquals(idImagen, imagenAmenidad.getIdImagen());

        Long nuevoIdImagen = 200L;
        imagenAmenidad.setIdImagen(nuevoIdImagen);
        Assertions.assertEquals(nuevoIdImagen, imagenAmenidad.getIdImagen());
    }

    @Test
    public void testSetAndGetHotel() {
        imagenAmenidad.setHotel(hotel);
        Assertions.assertEquals(hotel, imagenAmenidad.getHotel());
        Assertions.assertEquals(1L, imagenAmenidad.getHotel().getId_hotel()); 

        Hoteles nuevoHotel = new Hoteles();
        nuevoHotel.setId_hotel(2L);
        imagenAmenidad.setHotel(nuevoHotel);
        Assertions.assertEquals(nuevoHotel, imagenAmenidad.getHotel());
        Assertions.assertEquals(2L, imagenAmenidad.getHotel().getId_hotel());
    }

    @Test
    public void testSetAndGetUrlImagen() {
        String urlImagen = "http://example.com/imagen.jpg";
        imagenAmenidad.setUrlImagen(urlImagen);
        Assertions.assertEquals(urlImagen, imagenAmenidad.getUrlImagen());

        String nuevaUrlImagen = "http://example.com/nueva-imagen.jpg";
        imagenAmenidad.setUrlImagen(nuevaUrlImagen);
        Assertions.assertEquals(nuevaUrlImagen, imagenAmenidad.getUrlImagen());
    }

    @Test
    public void testSetAndGetUrlImagenNull() {
        imagenAmenidad.setUrlImagen(null);
        Assertions.assertNull(imagenAmenidad.getUrlImagen());
    }

    @Test
    public void testHotelWithNull() {
        imagenAmenidad.setHotel(null);
        Assertions.assertNull(imagenAmenidad.getHotel());
    }
}

