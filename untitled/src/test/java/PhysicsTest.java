import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhysicsTest extends TestCase {

        @Test
        public void x1() {
            var young = new Physics();
            int x[][]={{3,2,1},{-3,-2,-1},{0,0,0}};
            assertTrue(young.CalculateSum(3, x));
        }
        @Test
        public void x2() {
            var young = new Physics();
            int x[][]={{0,0,0},{0,0,0},{0,0,0}};
            assertTrue(young.CalculateSum(3, x));
        }
        @Test
        public void x3() {
            var young = new Physics();
            int x[][]={{0,1,0},{5,0,-6},{-13,15,99}};
            assertFalse(young.CalculateSum(3, x));
        }
        @Test
        public void x4() {
            var young = new Physics();
            int x[][]={{0,2,-2},{1,-1,3},{-3,0,0}};
            assertFalse(young.CalculateSum(3, x));
        }


}