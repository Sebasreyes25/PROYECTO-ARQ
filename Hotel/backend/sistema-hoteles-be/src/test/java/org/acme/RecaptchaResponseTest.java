package org.acme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RecaptchaResponseTest {

    private RecaptchaResponse recaptchaResponse;

    @BeforeEach
    public void setUp() {
        recaptchaResponse = new RecaptchaResponse();
    }

    @Test
    public void testSetAndGetSuccess() {
        // Caso éxito verdadero
        recaptchaResponse.setSuccess(true);
        Assertions.assertTrue(recaptchaResponse.isSuccess());

        // Caso éxito falso
        recaptchaResponse.setSuccess(false);
        Assertions.assertFalse(recaptchaResponse.isSuccess());
        
    }

    @Test
    public void testSetAndGetChallenge_ts() {
        // Asignar un valor específico
        String challenge_ts = "2023-04-01T12:34:56Z";
        recaptchaResponse.setChallenge_ts(challenge_ts);
        Assertions.assertEquals(challenge_ts, recaptchaResponse.getChallenge_ts());

        // Cambiar a otro valor
        String nuevoChallengeTs = "2023-05-01T14:00:00Z";
        recaptchaResponse.setChallenge_ts(nuevoChallengeTs);
        Assertions.assertEquals(nuevoChallengeTs, recaptchaResponse.getChallenge_ts());

        // Validar caso nulo
        recaptchaResponse.setChallenge_ts(null);
        Assertions.assertNull(recaptchaResponse.getChallenge_ts());
    }

    @Test
    public void testSetAndGetHostname() {
        // Asignar un valor específico
        String hostname = "example.com";
        recaptchaResponse.setHostname(hostname);
        Assertions.assertEquals(hostname, recaptchaResponse.getHostname());

        // Cambiar a otro valor
        String nuevoHostname = "newexample.com";
        recaptchaResponse.setHostname(nuevoHostname);
        Assertions.assertEquals(nuevoHostname, recaptchaResponse.getHostname());

        // Validar caso nulo
        recaptchaResponse.setHostname(null);
        Assertions.assertNull(recaptchaResponse.getHostname());
    }

    @Test
    public void testSetAndGetErrorCodes() {
        // Asignar un arreglo de códigos de error
        String[] errorCodes = new String[]{"missing-input-secret", "invalid-input-secret"};
        recaptchaResponse.setErrorCodes(errorCodes);
        Assertions.assertArrayEquals(errorCodes, recaptchaResponse.getErrorCodes());

        // Asignar otro arreglo de códigos de error
        String[] nuevosErrorCodes = new String[]{"timeout-or-duplicate", "bad-request"};
        recaptchaResponse.setErrorCodes(nuevosErrorCodes);
        Assertions.assertArrayEquals(nuevosErrorCodes, recaptchaResponse.getErrorCodes());

        // Validar caso nulo
        recaptchaResponse.setErrorCodes(null);
        Assertions.assertNull(recaptchaResponse.getErrorCodes());
    }

    @Test
    public void testSetAndGetErrorCodesEmpty() {
        // Caso con arreglo vacío
        String[] emptyErrorCodes = new String[]{};
        recaptchaResponse.setErrorCodes(emptyErrorCodes);
        Assertions.assertArrayEquals(emptyErrorCodes, recaptchaResponse.getErrorCodes());
    }
}

