package org.acme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RolTest {

    private Rol rol;

    @BeforeEach
    public void setUp() {
        rol = new Rol();
    }

    @Test
    public void testSetAndGetIdRol() {
        // Valor inicial de prueba
        Long idRol = 1L;
        rol.setIdRol(idRol);
        Assertions.assertEquals(idRol, rol.getIdRol());

        // Cambiar a otro valor
        rol.setIdRol(2L);
        Assertions.assertEquals(2L, rol.getIdRol());

        // Prueba con valor nulo
        rol.setIdRol(null);
        Assertions.assertNull(rol.getIdRol());
    }

    @Test
    public void testSetAndGetTipo() {
        // Valor inicial de prueba
        String tipo = "ADMIN";
        rol.setTipo(tipo);
        Assertions.assertEquals(tipo, rol.getTipo());

        // Cambiar a otro valor
        rol.setTipo("USER");
        Assertions.assertEquals("USER", rol.getTipo());

        // Prueba con valor nulo
        rol.setTipo(null);
        Assertions.assertNull(rol.getTipo());
    }


    @Test
    public void testEqualsAndHashCode() {
        // Probar equals y hashCode
        Rol rol1 = new Rol();
        rol1.setIdRol(1L);
        rol1.setTipo("ADMIN");

        Rol rol2 = new Rol();
        rol2.setIdRol(1L);
        rol2.setTipo("ADMIN");

        // Verificar igualdad de objetos
        Assertions.assertEquals(rol1, rol2);
        Assertions.assertEquals(rol1.hashCode(), rol2.hashCode());

        // Verificar cuando no son iguales
        rol2.setIdRol(2L);
        Assertions.assertNotEquals(rol1, rol2);
    }
}
