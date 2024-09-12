package org.acme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class UsuarioCreacionDTOTest {

    private UsuarioCreacionDTO usuarioDTO;

    @BeforeEach
    public void setUp() {
        usuarioDTO = new UsuarioCreacionDTO();
    }

    @Test
    public void testSetAndGetEmail() {
        // Prueba con un email válido
        String email = "usuario@example.com";
        usuarioDTO.setEmail(email);
        Assertions.assertEquals(email, usuarioDTO.getEmail());

        // Cambiar el email a otro valor
        usuarioDTO.setEmail("nuevo@example.com");
        Assertions.assertEquals("nuevo@example.com", usuarioDTO.getEmail());

        // Prueba con valor nulo
        usuarioDTO.setEmail(null);
        Assertions.assertNull(usuarioDTO.getEmail());
    }

    @Test
    public void testSetAndGetPassword() {
        // Prueba con un password seguro
        String password = "passwordSeguro123";
        usuarioDTO.setPassword(password);
        Assertions.assertEquals(password, usuarioDTO.getPassword());

        // Cambiar el password a otro valor
        usuarioDTO.setPassword("nuevoPassword456");
        Assertions.assertEquals("nuevoPassword456", usuarioDTO.getPassword());

        // Prueba con valor nulo
        usuarioDTO.setPassword(null);
        Assertions.assertNull(usuarioDTO.getPassword());
    }

    @Test
    public void testSetAndGetRol() {
        // Prueba con rol válido
        int rol = 1;
        usuarioDTO.setRol(rol);
        Assertions.assertEquals(rol, usuarioDTO.getRol());

        // Cambiar el rol a otro valor
        usuarioDTO.setRol(2);
        Assertions.assertEquals(2, usuarioDTO.getRol());
    }

    @Test
    public void testSetAndGetPrimerNombre() {
        // Prueba con un nombre común
        String primerNombre = "Juan";
        usuarioDTO.setPrimerNombre(primerNombre);
        Assertions.assertEquals(primerNombre, usuarioDTO.getPrimerNombre());

        // Cambiar a otro nombre
        usuarioDTO.setPrimerNombre("Pedro");
        Assertions.assertEquals("Pedro", usuarioDTO.getPrimerNombre());

        // Prueba con valor nulo
        usuarioDTO.setPrimerNombre(null);
        Assertions.assertNull(usuarioDTO.getPrimerNombre());
    }

    @Test
    public void testSetAndGetSegundoNombre() {
        // Prueba con un segundo nombre
        String segundoNombre = "Carlos";
        usuarioDTO.setSegundoNombre(segundoNombre);
        Assertions.assertEquals(segundoNombre, usuarioDTO.getSegundoNombre());

        // Cambiar el segundo nombre
        usuarioDTO.setSegundoNombre("Alberto");
        Assertions.assertEquals("Alberto", usuarioDTO.getSegundoNombre());

        // Prueba con valor nulo
        usuarioDTO.setSegundoNombre(null);
        Assertions.assertNull(usuarioDTO.getSegundoNombre());
    }

    @Test
    public void testSetAndGetPrimerApellido() {
        // Prueba con un apellido
        String primerApellido = "Pérez";
        usuarioDTO.setPrimerApellido(primerApellido);
        Assertions.assertEquals(primerApellido, usuarioDTO.getPrimerApellido());

        // Cambiar el apellido
        usuarioDTO.setPrimerApellido("López");
        Assertions.assertEquals("López", usuarioDTO.getPrimerApellido());

        // Prueba con valor nulo
        usuarioDTO.setPrimerApellido(null);
        Assertions.assertNull(usuarioDTO.getPrimerApellido());
    }

    @Test
    public void testSetAndGetSegundoApellido() {
        // Prueba con un segundo apellido
        String segundoApellido = "Gómez";
        usuarioDTO.setSegundoApellido(segundoApellido);
        Assertions.assertEquals(segundoApellido, usuarioDTO.getSegundoApellido());

        // Cambiar el segundo apellido
        usuarioDTO.setSegundoApellido("Rodríguez");
        Assertions.assertEquals("Rodríguez", usuarioDTO.getSegundoApellido());

        // Prueba con valor nulo
        usuarioDTO.setSegundoApellido(null);
        Assertions.assertNull(usuarioDTO.getSegundoApellido());
    }

    @Test
    public void testSetAndGetFechaNacimiento() {
        // Prueba con una fecha de nacimiento válida
        LocalDate fechaNacimiento = LocalDate.of(1990, 1, 1);
        usuarioDTO.setFechaNacimiento(fechaNacimiento);
        Assertions.assertEquals(fechaNacimiento, usuarioDTO.getFechaNacimiento());

        // Cambiar la fecha de nacimiento
        LocalDate nuevaFecha = LocalDate.of(2000, 5, 15);
        usuarioDTO.setFechaNacimiento(nuevaFecha);
        Assertions.assertEquals(nuevaFecha, usuarioDTO.getFechaNacimiento());

        // Prueba con valor nulo
        usuarioDTO.setFechaNacimiento(null);
        Assertions.assertNull(usuarioDTO.getFechaNacimiento());
    }

    @Test
    public void testSetAndGetNacionalidad() {
        // Prueba con una nacionalidad
        String nacionalidad = "Mexicana";
        usuarioDTO.setNacionalidad(nacionalidad);
        Assertions.assertEquals(nacionalidad, usuarioDTO.getNacionalidad());

        // Cambiar la nacionalidad
        usuarioDTO.setNacionalidad("Argentina");
        Assertions.assertEquals("Argentina", usuarioDTO.getNacionalidad());

        // Prueba con valor nulo
        usuarioDTO.setNacionalidad(null);
        Assertions.assertNull(usuarioDTO.getNacionalidad());
    }

    @Test
    public void testSetAndGetPasaporte() {
        // Prueba con un número de pasaporte válido
        Long pasaporte = 123456789L;
        usuarioDTO.setPasaporte(pasaporte);
        Assertions.assertEquals(pasaporte, usuarioDTO.getPasaporte());

        // Cambiar el pasaporte
        usuarioDTO.setPasaporte(987654321L);
        Assertions.assertEquals(987654321L, usuarioDTO.getPasaporte());

        // Prueba con valor nulo
        usuarioDTO.setPasaporte(null);
        Assertions.assertNull(usuarioDTO.getPasaporte());
    }

    @Test
    public void testSetAndGetRecaptchaToken() {
        // Prueba con un token de reCAPTCHA
        String recaptchaToken = "03AGdBq25-k_JsomethingT0";
        usuarioDTO.setRecaptchaToken(recaptchaToken);
        Assertions.assertEquals(recaptchaToken, usuarioDTO.getRecaptchaToken());

        // Cambiar el token
        usuarioDTO.setRecaptchaToken("newRecaptchaToken");
        Assertions.assertEquals("newRecaptchaToken", usuarioDTO.getRecaptchaToken());

        // Prueba con valor nulo
        usuarioDTO.setRecaptchaToken(null);
        Assertions.assertNull(usuarioDTO.getRecaptchaToken());
    }

}

