package org.acme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HabitacionesTest {

    private Habitaciones habitacion;

    @BeforeEach
    public void setUp() {
        habitacion = new Habitaciones();
    }

    @Test
    public void testSetAndGetIdHabitacion() {
        Long idHabitacion = 100L;
        habitacion.setId_habitacion(idHabitacion);
        Assertions.assertEquals(idHabitacion, habitacion.getId_habitacion());
        
        Long nuevoIdHabitacion = 200L;
        habitacion.setId_habitacion(nuevoIdHabitacion);
        Assertions.assertEquals(nuevoIdHabitacion, habitacion.getId_habitacion());
    }

    @Test
    public void testSetAndGetIdHotel() {
        Long idHotel = 300L;
        habitacion.setId_hotel(idHotel);
        Assertions.assertEquals(idHotel, habitacion.getId_hotel());

        Long nuevoIdHotel = 400L;
        habitacion.setId_hotel(nuevoIdHotel);
        Assertions.assertEquals(nuevoIdHotel, habitacion.getId_hotel());
    }

    @Test
    public void testSetAndGetDisponible() {
        habitacion.setDisponible(true);
        Assertions.assertTrue(habitacion.isDisponible());

        habitacion.setDisponible(false);
        Assertions.assertFalse(habitacion.isDisponible());

        // Cambiar nuevamente a true para asegurar la alternancia
        habitacion.setDisponible(true);
        Assertions.assertTrue(habitacion.isDisponible());
    }

    @Test
    public void testSetAndGetNumeroHabitacion() {
        int numero = 201;
        habitacion.setNumero_habitacion(numero);
        Assertions.assertEquals(numero, habitacion.getNumero_habitacion());

        int nuevoNumero = 305;
        habitacion.setNumero_habitacion(nuevoNumero);
        Assertions.assertEquals(nuevoNumero, habitacion.getNumero_habitacion());
    }

    @Test
    public void testSetAndGetCapacidadPersonas() {
        int capacidad = 4;
        habitacion.setCapacidad_personas(capacidad);
        Assertions.assertEquals(capacidad, habitacion.getCapacidad_personas());

        int nuevaCapacidad = 6;
        habitacion.setCapacidad_personas(nuevaCapacidad);
        Assertions.assertEquals(nuevaCapacidad, habitacion.getCapacidad_personas());
    }

    @Test
    public void testSetAndGetTipoHabitacion() {
        Integer tipo = 2;
        habitacion.setTipo_habitacion(tipo);
        Assertions.assertEquals(tipo, habitacion.getTipo_habitacion());

        Integer nuevoTipo = 3;
        habitacion.setTipo_habitacion(nuevoTipo);
        Assertions.assertEquals(nuevoTipo, habitacion.getTipo_habitacion());
    }

    @Test
    public void testSetAndGetPrecioxpersona() {
        double precio = 180.0;
        habitacion.setPrecioxpersona(precio);
        Assertions.assertEquals(precio, habitacion.getPrecioxpersona());

        double nuevoPrecio = 220.0;
        habitacion.setPrecioxpersona(nuevoPrecio);
        Assertions.assertEquals(nuevoPrecio, habitacion.getPrecioxpersona());
    }

    @Test
    public void testSetAndGetPrecioxnoche() {
        double precio = 350.0;
        habitacion.setPrecioxnoche(precio);
        Assertions.assertEquals(precio, habitacion.getPrecioxnoche());

        double nuevoPrecio = 400.0;
        habitacion.setPrecioxnoche(nuevoPrecio);
        Assertions.assertEquals(nuevoPrecio, habitacion.getPrecioxnoche());
    }

    @Test
    public void testSetAndGetValuacion() {
        int valuacion = 5;
        habitacion.setValuacion(valuacion);
        Assertions.assertEquals(valuacion, habitacion.getValuacion());

        int nuevaValuacion = 4;
        habitacion.setValuacion(nuevaValuacion);
        Assertions.assertEquals(nuevaValuacion, habitacion.getValuacion());
    }
}
