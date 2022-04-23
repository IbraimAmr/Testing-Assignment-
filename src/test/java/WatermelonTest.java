import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WatermelonTest {

    @Test
    public void testagain(){
        var x = new Watermelon();
        assertTrue(x.test(8));
    }

    @Test
    public void testonceagain(){
        var x = new Watermelon();
        assertFalse(x.test(9));
    }
    @Test
    public void testwatermelon(){
        var x = new Watermelon();
        assertFalse(x.test(2));
    }


}