package org.acme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VerificarDisponibilidadDTOTest {

    private VerificarDisponibilidadDTO verificarDisponibilidadDTO;

    @BeforeEach
    public void setUp() {
        verificarDisponibilidadDTO = new VerificarDisponibilidadDTO();
    }

    @Test
    public void testSetAndGetIdHabitacion() {
        Long idHabitacion = 1L;
        verificarDisponibilidadDTO.setIdHabitacion(idHabitacion);
        Assertions.assertEquals(idHabitacion, verificarDisponibilidadDTO.getIdHabitacion());

        // Cambiar el valor y verificar
        verificarDisponibilidadDTO.setIdHabitacion(2L);
        Assertions.assertEquals(2L, verificarDisponibilidadDTO.getIdHabitacion());

        // Probar con valor nulo
        verificarDisponibilidadDTO.setIdHabitacion(null);
        Assertions.assertNull(verificarDisponibilidadDTO.getIdHabitacion());
    }

    @Test
    public void testSetAndGetFechaIngreso() {
        String fechaIngreso = "2023-04-01";
        verificarDisponibilidadDTO.setFechaIngreso(fechaIngreso);
        Assertions.assertEquals(fechaIngreso, verificarDisponibilidadDTO.getFechaIngreso());

        // Cambiar el valor y verificar
        verificarDisponibilidadDTO.setFechaIngreso("2023-05-01");
        Assertions.assertEquals("2023-05-01", verificarDisponibilidadDTO.getFechaIngreso());

        // Probar con valor nulo
        verificarDisponibilidadDTO.setFechaIngreso(null);
        Assertions.assertNull(verificarDisponibilidadDTO.getFechaIngreso());
    }

    @Test
    public void testSetAndGetFechaSalida() {
        String fechaSalida = "2023-04-05";
        verificarDisponibilidadDTO.setFechaSalida(fechaSalida);
        Assertions.assertEquals(fechaSalida, verificarDisponibilidadDTO.getFechaSalida());

        // Cambiar el valor y verificar
        verificarDisponibilidadDTO.setFechaSalida("2023-05-05");
        Assertions.assertEquals("2023-05-05", verificarDisponibilidadDTO.getFechaSalida());

        // Probar con valor nulo
        verificarDisponibilidadDTO.setFechaSalida(null);
        Assertions.assertNull(verificarDisponibilidadDTO.getFechaSalida());
    }


}

