package org.acme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class UsuarioDetalleDTOTest {

    private UsuarioDetalleDTO usuarioDetalleDTO;

    @BeforeEach
    public void setUp() {
        usuarioDetalleDTO = new UsuarioDetalleDTO();
    }

    @Test
    public void testSetAndGetId() {
        Long id = 1L;
        usuarioDetalleDTO.setId(id);
        Assertions.assertEquals(id, usuarioDetalleDTO.getId());

        // Probar con otro valor
        usuarioDetalleDTO.setId(2L);
        Assertions.assertEquals(2L, usuarioDetalleDTO.getId());

        // Probar con valor nulo
        usuarioDetalleDTO.setId(null);
        Assertions.assertNull(usuarioDetalleDTO.getId());
    }

    @Test
    public void testSetAndGetRolNombre() {
        String rolNombre = "Administrador";
        usuarioDetalleDTO.setRolNombre(rolNombre);
        Assertions.assertEquals(rolNombre, usuarioDetalleDTO.getRolNombre());

        // Cambiar el valor a otro rol
        usuarioDetalleDTO.setRolNombre("Usuario");
        Assertions.assertEquals("Usuario", usuarioDetalleDTO.getRolNombre());

        // Probar con valor nulo
        usuarioDetalleDTO.setRolNombre(null);
        Assertions.assertNull(usuarioDetalleDTO.getRolNombre());
    }

    @Test
    public void testSetAndGetEmail() {
        String email = "usuario@example.com";
        usuarioDetalleDTO.setEmail(email);
        Assertions.assertEquals(email, usuarioDetalleDTO.getEmail());

        // Cambiar a otro email
        usuarioDetalleDTO.setEmail("otro@example.com");
        Assertions.assertEquals("otro@example.com", usuarioDetalleDTO.getEmail());

        // Probar con valor nulo
        usuarioDetalleDTO.setEmail(null);
        Assertions.assertNull(usuarioDetalleDTO.getEmail());
    }

    @Test
    public void testSetAndGetPrimerNombre() {
        String primerNombre = "Juan";
        usuarioDetalleDTO.setPrimerNombre(primerNombre);
        Assertions.assertEquals(primerNombre, usuarioDetalleDTO.getPrimerNombre());

        // Cambiar a otro nombre
        usuarioDetalleDTO.setPrimerNombre("Pedro");
        Assertions.assertEquals("Pedro", usuarioDetalleDTO.getPrimerNombre());

        // Probar con valor nulo
        usuarioDetalleDTO.setPrimerNombre(null);
        Assertions.assertNull(usuarioDetalleDTO.getPrimerNombre());
    }

    @Test
    public void testSetAndGetSegundoNombre() {
        String segundoNombre = "Carlos";
        usuarioDetalleDTO.setSegundoNombre(segundoNombre);
        Assertions.assertEquals(segundoNombre, usuarioDetalleDTO.getSegundoNombre());

        // Cambiar el valor
        usuarioDetalleDTO.setSegundoNombre("Luis");
        Assertions.assertEquals("Luis", usuarioDetalleDTO.getSegundoNombre());

        // Probar con valor nulo
        usuarioDetalleDTO.setSegundoNombre(null);
        Assertions.assertNull(usuarioDetalleDTO.getSegundoNombre());
    }

    @Test
    public void testSetAndGetPrimerApellido() {
        String primerApellido = "Pérez";
        usuarioDetalleDTO.setPrimerApellido(primerApellido);
        Assertions.assertEquals(primerApellido, usuarioDetalleDTO.getPrimerApellido());

        // Cambiar a otro apellido
        usuarioDetalleDTO.setPrimerApellido("García");
        Assertions.assertEquals("García", usuarioDetalleDTO.getPrimerApellido());

        // Probar con valor nulo
        usuarioDetalleDTO.setPrimerApellido(null);
        Assertions.assertNull(usuarioDetalleDTO.getPrimerApellido());
    }

    @Test
    public void testSetAndGetSegundoApellido() {
        String segundoApellido = "Gómez";
        usuarioDetalleDTO.setSegundoApellido(segundoApellido);
        Assertions.assertEquals(segundoApellido, usuarioDetalleDTO.getSegundoApellido());

        // Cambiar a otro apellido
        usuarioDetalleDTO.setSegundoApellido("Rodríguez");
        Assertions.assertEquals("Rodríguez", usuarioDetalleDTO.getSegundoApellido());

        // Probar con valor nulo
        usuarioDetalleDTO.setSegundoApellido(null);
        Assertions.assertNull(usuarioDetalleDTO.getSegundoApellido());
    }

    @Test
    public void testSetAndGetFechaNacimiento() {
        LocalDate fechaNacimiento = LocalDate.of(1990, 1, 1);
        usuarioDetalleDTO.setFechaNacimiento(fechaNacimiento);
        Assertions.assertEquals(fechaNacimiento, usuarioDetalleDTO.getFechaNacimiento());

        // Cambiar a otra fecha
        LocalDate nuevaFecha = LocalDate.of(2000, 5, 15);
        usuarioDetalleDTO.setFechaNacimiento(nuevaFecha);
        Assertions.assertEquals(nuevaFecha, usuarioDetalleDTO.getFechaNacimiento());

        // Probar con valor nulo
        usuarioDetalleDTO.setFechaNacimiento(null);
        Assertions.assertNull(usuarioDetalleDTO.getFechaNacimiento());
    }

    @Test
    public void testSetAndGetNacionalidad() {
        String nacionalidad = "Mexicana";
        usuarioDetalleDTO.setNacionalidad(nacionalidad);
        Assertions.assertEquals(nacionalidad, usuarioDetalleDTO.getNacionalidad());

        // Cambiar a otra nacionalidad
        usuarioDetalleDTO.setNacionalidad("Argentina");
        Assertions.assertEquals("Argentina", usuarioDetalleDTO.getNacionalidad());

        // Probar con valor nulo
        usuarioDetalleDTO.setNacionalidad(null);
        Assertions.assertNull(usuarioDetalleDTO.getNacionalidad());
    }

    @Test
    public void testSetAndGetPasaporte() {
        Long pasaporte = 123456789L;
        usuarioDetalleDTO.setPasaporte(pasaporte);
        Assertions.assertEquals(pasaporte, usuarioDetalleDTO.getPasaporte());

        // Cambiar a otro valor
        usuarioDetalleDTO.setPasaporte(987654321L);
        Assertions.assertEquals(987654321L, usuarioDetalleDTO.getPasaporte());

        // Probar con valor nulo
        usuarioDetalleDTO.setPasaporte(null);
        Assertions.assertNull(usuarioDetalleDTO.getPasaporte());
    }

    @Test
    public void testToString() {
        usuarioDetalleDTO.setId(1L);
        usuarioDetalleDTO.setEmail("usuario@example.com");
        usuarioDetalleDTO.setPrimerNombre("Juan");

        String expected = "UsuarioDetalleDTO{id=1, email='usuario@example.com', primerNombre='Juan'}";
        Assertions.assertTrue(usuarioDetalleDTO.toString().contains("id=1"));
        Assertions.assertTrue(usuarioDetalleDTO.toString().contains("email='usuario@example.com'"));
    }
}

