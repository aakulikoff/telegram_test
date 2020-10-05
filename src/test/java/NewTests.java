
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NewTests {
    @Test
    void firstTest() {
        assertTrue(true);
}

    @Test
    void secondTest() {
        assertTrue(true);
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
        assertTrue(false);
    }

    @Test
    @Disabled
    void sixTest(){
        assertTrue(true);
    }
}
