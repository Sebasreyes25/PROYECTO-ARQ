package org.acme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class DetalleReservaDTOTest {

    private DetalleReservaDTO detalleReservaDTO;

    @BeforeEach
    public void setUp() {
        detalleReservaDTO = new DetalleReservaDTO();
    }

    @Test
    public void testSetAndGetIdReserva() {
        Long idReserva = 123L;
        detalleReservaDTO.setIdReserva(idReserva);
        Assertions.assertEquals(idReserva, detalleReservaDTO.getIdReserva());

        detalleReservaDTO.setIdReserva(null);
        Assertions.assertNull(detalleReservaDTO.getIdReserva());
    }

    @Test
    public void testSetAndGetIdHotel() {
        Long idHotel = 456L;
        detalleReservaDTO.setIdHotel(idHotel);
        Assertions.assertEquals(idHotel, detalleReservaDTO.getIdHotel());
    }

    @Test
    public void testSetAndGetIdHabitacion() {
        Long idHabitacion = 789L;
        detalleReservaDTO.setIdHabitacion(idHabitacion);
        Assertions.assertEquals(idHabitacion, detalleReservaDTO.getIdHabitacion());
    }

    @Test
    public void testSetAndGetNumeroHabitacion() {
        int numeroHabitacion = 505;
        detalleReservaDTO.setNumeroHabitacion(numeroHabitacion);
        Assertions.assertEquals(numeroHabitacion, detalleReservaDTO.getNumeroHabitacion());
    }

    @Test
    public void testSetAndGetNombreHotel() {
        String nombreHotel = "Hotel Test";
        detalleReservaDTO.setNombreHotel(nombreHotel);
        Assertions.assertEquals(nombreHotel, detalleReservaDTO.getNombreHotel());
        
        detalleReservaDTO.setNombreHotel(null);
        Assertions.assertNull(detalleReservaDTO.getNombreHotel());
    }

    @Test
    public void testSetAndGetPais() {
        String pais = "Test Country";
        detalleReservaDTO.setPais(pais);
        Assertions.assertEquals(pais, detalleReservaDTO.getPais());
    }

    @Test
    public void testSetAndGetCiudad() {
        String ciudad = "Test City";
        detalleReservaDTO.setCiudad(ciudad);
        Assertions.assertEquals(ciudad, detalleReservaDTO.getCiudad());
    }

    @Test
    public void testSetAndGetDireccion() {
        String direccion = "123 Test St.";
        detalleReservaDTO.setDireccion(direccion);
        Assertions.assertEquals(direccion, detalleReservaDTO.getDireccion());
    }

    @Test
    public void testSetAndGetTipoHabitacion() {
        Integer tipoHabitacion = 2;  
        detalleReservaDTO.setTipoHabitacion(tipoHabitacion);
        Assertions.assertEquals(tipoHabitacion, detalleReservaDTO.getTipoHabitacion());
    }

    @Test
    public void testSetAndGetFechaIngreso() {
        LocalDate fechaIngreso = LocalDate.of(2022, 5, 15);
        detalleReservaDTO.setFechaIngreso(fechaIngreso);
        Assertions.assertEquals(fechaIngreso, detalleReservaDTO.getFechaIngreso());

        detalleReservaDTO.setFechaIngreso(null);
        Assertions.assertNull(detalleReservaDTO.getFechaIngreso());
    }

    @Test
    public void testSetAndGetFechaSalida() {
        LocalDate fechaSalida = LocalDate.of(2022, 5, 20);
        detalleReservaDTO.setFechaSalida(fechaSalida);
        Assertions.assertEquals(fechaSalida, detalleReservaDTO.getFechaSalida());
    }

    @Test
    public void testSetAndGetNumeroNoches() {
        Integer numeroNoches = 7;
        detalleReservaDTO.setNumeroNoches(numeroNoches);
        Assertions.assertEquals(numeroNoches, detalleReservaDTO.getNumeroNoches());
    }

    @Test
    public void testSetAndGetCodigoReserva() {
        Integer codigoReserva = 999999;
        detalleReservaDTO.setCodigoReserva(codigoReserva);
        Assertions.assertEquals(codigoReserva, detalleReservaDTO.getCodigoReserva());
    }

    @Test
    public void testSetAndGetTotalReserva() {
        Integer totalReserva = 3500;
        detalleReservaDTO.setTotalReserva(totalReserva);
        Assertions.assertEquals(totalReserva, detalleReservaDTO.getTotalReserva());
    }

    @Test
    public void testSetAndGetEstadoReserva() {
        String estadoReserva = "Cancelada";  
        detalleReservaDTO.setEstadoReserva(estadoReserva);
        Assertions.assertEquals(estadoReserva, detalleReservaDTO.getEstadoReserva());
    }

    @Test
    public void testSetAndGetCapacidadPersonas() {
        Integer capacidadPersonas = 5;  
        detalleReservaDTO.setCapacidadPersonas(capacidadPersonas);
        Assertions.assertEquals(capacidadPersonas, detalleReservaDTO.getCapacidadPersonas());
    }

    @Test
    public void testSetAndGetIdUsuario() {
        Long idUsuario = 15L;  
        detalleReservaDTO.setIdUsuario(idUsuario);
        Assertions.assertEquals(idUsuario, detalleReservaDTO.getIdUsuario());
    }

    @Test
    public void testSetAndGetCorreoElectronico() {
        String correoElectronico = "testuser@example.com";
        detalleReservaDTO.setCorreoElectronico(correoElectronico);
        Assertions.assertEquals(correoElectronico, detalleReservaDTO.getCorreoElectronico());
    }

}
