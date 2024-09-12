package org.acme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalTime;

public class HotelesTest {

    private Hoteles hotel;

    @BeforeEach
    public void setUp() {
        hotel = new Hoteles();
    }

    @Test
    public void testSetAndGetIdHotel() {
        Long idHotel = 10L;
        hotel.setId_hotel(idHotel);
        Assertions.assertEquals(idHotel, hotel.getId_hotel());

        Long nuevoIdHotel = 20L;
        hotel.setId_hotel(nuevoIdHotel);
        Assertions.assertEquals(nuevoIdHotel, hotel.getId_hotel());
    }

    @Test
    public void testSetAndGetIdCadena() {
        Long idCadena = 30L;
        hotel.setId_cadena(idCadena);
        Assertions.assertEquals(idCadena, hotel.getId_cadena());

        Long nuevoIdCadena = 40L;
        hotel.setId_cadena(nuevoIdCadena);
        Assertions.assertEquals(nuevoIdCadena, hotel.getId_cadena());
    }

    @Test
    public void testSetAndGetNombre() {
        String nombre = "Hotel Ejemplo";
        hotel.setNombre(nombre);
        Assertions.assertEquals(nombre, hotel.getNombre());

        String nuevoNombre = "Nuevo Hotel Ejemplo";
        hotel.setNombre(nuevoNombre);
        Assertions.assertEquals(nuevoNombre, hotel.getNombre());
    }

    @Test
    public void testSetAndGetPais() {
        String pais = "País Test";
        hotel.setPais(pais);
        Assertions.assertEquals(pais, hotel.getPais());

        String nuevoPais = "Nuevo País Test";
        hotel.setPais(nuevoPais);
        Assertions.assertEquals(nuevoPais, hotel.getPais());
    }

    @Test
    public void testSetAndGetCiudad() {
        String ciudad = "Ciudad Test";
        hotel.setCiudad(ciudad);
        Assertions.assertEquals(ciudad, hotel.getCiudad());

        String nuevaCiudad = "Nueva Ciudad Test";
        hotel.setCiudad(nuevaCiudad);
        Assertions.assertEquals(nuevaCiudad, hotel.getCiudad());
    }

    @Test
    public void testSetAndGetDireccion() {
        String direccion = "Calle Ejemplo 123";
        hotel.setDireccion(direccion);
        Assertions.assertEquals(direccion, hotel.getDireccion());

        String nuevaDireccion = "Calle Nueva Ejemplo 456";
        hotel.setDireccion(nuevaDireccion);
        Assertions.assertEquals(nuevaDireccion, hotel.getDireccion());
    }

    @Test
    public void testSetAndGetCheckin() {
        LocalTime checkin = LocalTime.of(15, 0);
        hotel.setCheckin(checkin);
        Assertions.assertEquals(checkin, hotel.getCheckin());

        LocalTime nuevoCheckin = LocalTime.of(16, 0);
        hotel.setCheckin(nuevoCheckin);
        Assertions.assertEquals(nuevoCheckin, hotel.getCheckin());
    }

    @Test
    public void testSetAndGetCheckout() {
        LocalTime checkout = LocalTime.of(11, 0);
        hotel.setCheckout(checkout);
        Assertions.assertEquals(checkout, hotel.getCheckout());

        LocalTime nuevoCheckout = LocalTime.of(12, 0);
        hotel.setCheckout(nuevoCheckout);
        Assertions.assertEquals(nuevoCheckout, hotel.getCheckout());
    }

    @Test
    public void testSetAndGetImagenUrl() {
        String imagenUrl = "http://example.com/image.jpg";
        hotel.setImagenUrl(imagenUrl);
        Assertions.assertEquals(imagenUrl, hotel.getImagenUrl());

        String nuevaImagenUrl = "http://example.com/newimage.jpg";
        hotel.setImagenUrl(nuevaImagenUrl);
        Assertions.assertEquals(nuevaImagenUrl, hotel.getImagenUrl());
    }
}


