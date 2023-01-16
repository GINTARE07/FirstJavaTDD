import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWaterBottle {
    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle( 90);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, WaterBottle.getVolume);

    }
    @Test
    public void canTakeVolume(){
        assertEquals(90, WaterBottle.setTakeVolume);
    }

}
