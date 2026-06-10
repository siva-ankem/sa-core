package com.sa.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class SaCoreApplicationTest {

    @Test
    void applicationShouldStart() {
        SaCoreApplication app = new SaCoreApplication();
        assertNotNull(app);
    }
}
