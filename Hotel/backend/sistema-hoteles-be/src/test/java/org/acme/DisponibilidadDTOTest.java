package org.acme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DisponibilidadDTOTest {

    private DisponibilidadDTO disponibilidadDTO;

    @BeforeEach
    public void setUp() {
        // Si solo existe un constructor con parámetros, lo usamos aquí
        disponibilidadDTO = new DisponibilidadDTO(false); // Usamos el constructor con valor inicial
    }

    @Test
    public void testConstructorAndSetter() {
        // Verificar el valor inicial asignado por el constructor
        Assertions.assertFalse(disponibilidadDTO.isEsDisponible(), "El valor inicial debería ser false");

        // Probar setter con true
        disponibilidadDTO.setEsDisponible(true);
        Assertions.assertTrue(disponibilidadDTO.isEsDisponible(), "El valor debería cambiar a true después de la asignación");
    }

    @Test
    public void testParameterizedConstructor() {
        // Usar constructor con parámetro
        DisponibilidadDTO disponibilidadParam = new DisponibilidadDTO(true);
        Assertions.assertTrue(disponibilidadParam.isEsDisponible(), "El valor inicial debería ser true");

        // Probar cambio de estado
        disponibilidadParam.setEsDisponible(false);
        Assertions.assertFalse(disponibilidadParam.isEsDisponible(), "El valor debería cambiar a false");
    }

    @Test
    public void testSetAndGetEsDisponible() {
        // Alternar entre true y false para asegurarse de que funciona correctamente
        disponibilidadDTO.setEsDisponible(true);
        Assertions.assertTrue(disponibilidadDTO.isEsDisponible(), "El valor debería ser true");

        disponibilidadDTO.setEsDisponible(false);
        Assertions.assertFalse(disponibilidadDTO.isEsDisponible(), "El valor debería cambiar a false");
    }

    @Test
    public void testMultipleChanges() {
        // Prueba con múltiples cambios de estado
        disponibilidadDTO.setEsDisponible(true);
        Assertions.assertTrue(disponibilidadDTO.isEsDisponible());

        disponibilidadDTO.setEsDisponible(false);
        Assertions.assertFalse(disponibilidadDTO.isEsDisponible());

        disponibilidadDTO.setEsDisponible(true);
        Assertions.assertTrue(disponibilidadDTO.isEsDisponible());
    }
}


