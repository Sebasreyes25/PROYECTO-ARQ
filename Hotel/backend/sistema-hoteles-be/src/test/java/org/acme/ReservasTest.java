package org.acme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class ReservasTest {

    private Reservas reserva;

    @BeforeEach
    public void setUp() {
        reserva = new Reservas();
    }

    @Test
    public void testSetAndGetIdReserva() {
        Long idReserva = 1L;
        reserva.setIdReserva(idReserva);
        Assertions.assertEquals(idReserva, reserva.getIdReserva());

        // Prueba con otro valor
        reserva.setIdReserva(10L);
        Assertions.assertEquals(10L, reserva.getIdReserva());

        // Prueba con valor nulo
        reserva.setIdReserva(null);
        Assertions.assertNull(reserva.getIdReserva());
    }

    @Test
    public void testSetAndGetIdHotel() {
        Long idHotel = 2L;
        reserva.setIdHotel(idHotel);
        Assertions.assertEquals(idHotel, reserva.getIdHotel());

        // Cambiar a otro valor
        reserva.setIdHotel(20L);
        Assertions.assertEquals(20L, reserva.getIdHotel());

        // Validar valor nulo
        reserva.setIdHotel(null);
        Assertions.assertNull(reserva.getIdHotel());
    }

    @Test
    public void testSetAndGetIdHabitacion() {
        Long idHabitacion = 3L;
        reserva.setIdHabitacion(idHabitacion);
        Assertions.assertEquals(idHabitacion, reserva.getIdHabitacion());

        // Cambiar a otro valor
        reserva.setIdHabitacion(30L);
        Assertions.assertEquals(30L, reserva.getIdHabitacion());

        // Validar valor nulo
        reserva.setIdHabitacion(null);
        Assertions.assertNull(reserva.getIdHabitacion());
    }

    @Test
    public void testSetAndGetIdUsuario() {
        Long idUsuario = 4L;
        reserva.setIdUsuario(idUsuario);
        Assertions.assertEquals(idUsuario, reserva.getIdUsuario());

        // Cambiar a otro valor
        reserva.setIdUsuario(40L);
        Assertions.assertEquals(40L, reserva.getIdUsuario());

        // Validar valor nulo
        reserva.setIdUsuario(null);
        Assertions.assertNull(reserva.getIdUsuario());
    }

    @Test
    public void testSetAndGetCodigoReserva() {
        Integer codigoReserva = 12345;
        reserva.setCodigoReserva(codigoReserva);
        Assertions.assertEquals(codigoReserva, reserva.getCodigoReserva());

        // Cambiar a otro valor
        reserva.setCodigoReserva(67890);
        Assertions.assertEquals(67890, reserva.getCodigoReserva());

        // Validar valor nulo
        reserva.setCodigoReserva(null);
        Assertions.assertNull(reserva.getCodigoReserva());
    }

    @Test
    public void testSetAndGetPersonasReserva() {
        Integer personasReserva = 2;
        reserva.setPersonasReserva(personasReserva);
        Assertions.assertEquals(personasReserva, reserva.getPersonasReserva());

        // Cambiar a otro valor
        reserva.setPersonasReserva(4);
        Assertions.assertEquals(4, reserva.getPersonasReserva());

        // Validar valor nulo
        reserva.setPersonasReserva(null);
        Assertions.assertNull(reserva.getPersonasReserva());
    }

    @Test
    public void testSetAndGetFechaIngreso() {
        LocalDate fechaIngreso = LocalDate.of(2023, 10, 1);
        reserva.setFechaIngreso(fechaIngreso);
        Assertions.assertEquals(fechaIngreso, reserva.getFechaIngreso());

        // Cambiar a otro valor
        LocalDate nuevaFechaIngreso = LocalDate.of(2023, 11, 1);
        reserva.setFechaIngreso(nuevaFechaIngreso);
        Assertions.assertEquals(nuevaFechaIngreso, reserva.getFechaIngreso());

        // Validar valor nulo
        reserva.setFechaIngreso(null);
        Assertions.assertNull(reserva.getFechaIngreso());
    }

    @Test
    public void testSetAndGetFechaSalida() {
        LocalDate fechaSalida = LocalDate.of(2023, 10, 5);
        reserva.setFechaSalida(fechaSalida);
        Assertions.assertEquals(fechaSalida, reserva.getFechaSalida());

        // Cambiar a otro valor
        LocalDate nuevaFechaSalida = LocalDate.of(2023, 11, 5);
        reserva.setFechaSalida(nuevaFechaSalida);
        Assertions.assertEquals(nuevaFechaSalida, reserva.getFechaSalida());

        // Validar valor nulo
        reserva.setFechaSalida(null);
        Assertions.assertNull(reserva.getFechaSalida());
    }

    @Test
    public void testSetAndGetTotalReserva() {
        Integer totalReserva = 1000;
        reserva.setTotalReserva(totalReserva);
        Assertions.assertEquals(totalReserva, reserva.getTotalReserva());

        // Cambiar a otro valor
        reserva.setTotalReserva(1500);
        Assertions.assertEquals(1500, reserva.getTotalReserva());

        // Validar valor nulo
        reserva.setTotalReserva(null);
        Assertions.assertNull(reserva.getTotalReserva());
    }

    @Test
    public void testSetAndGetEstadoReserva() {
        String estadoReserva = "Confirmada";
        reserva.setEstadoReserva(estadoReserva);
        Assertions.assertEquals(estadoReserva, reserva.getEstadoReserva());

        // Cambiar a otro valor
        reserva.setEstadoReserva("Cancelada");
        Assertions.assertEquals("Cancelada", reserva.getEstadoReserva());

        // Validar valor nulo
        reserva.setEstadoReserva(null);
        Assertions.assertNull(reserva.getEstadoReserva());
    }

    @Test
    public void testSetAndGetTipoHabitacion() {
        Integer tipoHabitacion = 1;
        reserva.setTipoHabitacion(tipoHabitacion);
        Assertions.assertEquals(tipoHabitacion, reserva.getTipoHabitacion());

        // Cambiar a otro valor
        reserva.setTipoHabitacion(2);
        Assertions.assertEquals(2, reserva.getTipoHabitacion());

        // Validar valor nulo
        reserva.setTipoHabitacion(null);
        Assertions.assertNull(reserva.getTipoHabitacion());
    }
}


