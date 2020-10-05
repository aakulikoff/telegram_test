import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SuperNewTests {

    @Test
    void firstTest() {
        assertTrue(false);
    }

    @Test
    void secondTest() {
        assertTrue(false);
    }


    @Test
    void thirdTest(){
        assertTrue(false);
    }

    @Test
    void forthTest(){
        assertTrue(false);
    }

    @Test
    void fifthTest(){
        assertTrue(true);
    }

    @Test
    @Disabled
    void sixTest(){
        assertTrue(true);
    }
}
