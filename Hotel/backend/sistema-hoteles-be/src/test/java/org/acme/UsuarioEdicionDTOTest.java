package org.acme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioEdicionDTOTest {

    private UsuarioEdicionDTO usuarioEdicionDTO;

    @BeforeEach
    public void setUp() {
        usuarioEdicionDTO = new UsuarioEdicionDTO();
    }

    @Test
    public void testSetAndGetId() {
        Long id = 100L;
        usuarioEdicionDTO.setId(id);
        Assertions.assertEquals(id, usuarioEdicionDTO.getId());

        // Cambiar el valor del ID y verificar
        usuarioEdicionDTO.setId(200L);
        Assertions.assertEquals(200L, usuarioEdicionDTO.getId());

        // Probar con valor nulo
        usuarioEdicionDTO.setId(null);
        Assertions.assertNull(usuarioEdicionDTO.getId());
    }

    @Test
    public void testSetAndGetRol() {
        Integer rol = 1;
        usuarioEdicionDTO.setRol(rol);
        Assertions.assertEquals(rol, usuarioEdicionDTO.getRol());

        // Cambiar el valor del rol y verificar
        usuarioEdicionDTO.setRol(2);
        Assertions.assertEquals(2, usuarioEdicionDTO.getRol());

        // Probar con valor nulo
        usuarioEdicionDTO.setRol(null);
        Assertions.assertNull(usuarioEdicionDTO.getRol());
    }


}
