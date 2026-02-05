package com.integracion.utp.greeting.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Client")
class ClientTest {

    @Test
    void getId() {
        Client client = new Client();
        client.setId(-11);
        assertEquals(1, client.getId());
    }

    @Test
    void createClientWithIdNull(){
        Exception exception = assertThrows(NullPointerException.class, () -> {
            Client client = new Client();
            client.setId(null);
        });
        assertEquals("El id del cliente es null", exception.getMessage());

    }
}