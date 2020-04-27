import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle = new WaterBottle();

    @Test
    public void startsWith100(){
        assertEquals( 100, waterBottle.getVolume() );
    }

    @Test
    public void drinkRemoves10(){
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void emptyBottle(){
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void bottleFills(){
        waterBottle.fill();
        assertEquals( 100, waterBottle.getVolume() );
    }

}
