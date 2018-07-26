import org.junit.Test;

import static org.junit.Assert.*;

public class ebadiradMazeGenTest {

    @Test
    public void testRandBetween(){
        int lower = 1;
        int upper = 25;
        for(int i = 0; i < 101; i ++){
            assertTrue(EbadiradMazeGen.randBetween(lower,upper) >= 1);
            assertTrue(EbadiradMazeGen.randBetween(lower,upper) <= 25);
        }
            assertTrue(EbadiradMazeGen.randBetween(upper,lower) >=1);
            assertTrue(EbadiradMazeGen.randBetween(upper,lower)<= 25);

    }
    @Test
    public void testValidSubArea(){
        //width of the area has to be more than 3 wide and 3 tall.
        assertFalse(EbadiradMazeGen.validSubArea(1,1,1,1));
        assertFalse(EbadiradMazeGen.validSubArea(1,3,1,3));
        assertFalse(EbadiradMazeGen.validSubArea(1,5,1,2));
        assertTrue(EbadiradMazeGen.validSubArea(5,9,2,6));
        assertTrue(EbadiradMazeGen.validSubArea(1,70,1,50));
        assertFalse(EbadiradMazeGen.validSubArea(1,4,3,10));
        assertFalse(EbadiradMazeGen.validSubArea(3,1,3,1));
        assertFalse(EbadiradMazeGen.validSubArea(5,1,2,1));

    }

}