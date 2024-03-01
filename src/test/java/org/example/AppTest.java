package org.example;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
    App app = new App();
    @Test
    public void addTest() {
        assertEquals(3, app.add(1,2));
}


}
