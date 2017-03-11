package inwoners;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

/**
 * Created by niek on 3/11/17.
 */
public class WijkSoapBindingImplTest {
    private Wijk wijk;

    @Before
    public void setUp() throws Exception {
        wijk = new WijkSoapBindingImpl();
    }

    @After
    public void tearDown() throws Exception {
        wijk = null;
    }

    @Test
    public void calcInwonersVoorWijkNormal() throws Exception {
        assertEquals(wijk.calcInwonersVoorWijk("test", 2015), 6450);
        assertEquals(wijk.calcInwonersVoorWijk("Nieuwegein Zuid", 2015), 6458);
        assertEquals(wijk.calcInwonersVoorWijk("Amsterdam Zuid", 2015), 6457);
        assertEquals(wijk.calcInwonersVoorWijk("Amsterdam Bijlmer Arena", 2015), 6464);

        assertEquals(wijk.calcInwonersVoorWijk("test", 2016), 6454);
        assertEquals(wijk.calcInwonersVoorWijk("Nieuwegein Zuid", 2016), 6461);
        assertEquals(wijk.calcInwonersVoorWijk("Amsterdam Zuid", 2016), 6461);
        assertEquals(wijk.calcInwonersVoorWijk("Amsterdam Bijlmer Arena", 2016), 6467);

        assertEquals(wijk.calcInwonersVoorWijk("test", 2017), 6457);
        assertEquals(wijk.calcInwonersVoorWijk("Nieuwegein Zuid", 2017), 6464);
        assertEquals(wijk.calcInwonersVoorWijk("Amsterdam Zuid", 2017), 6464);
        assertEquals(wijk.calcInwonersVoorWijk("Amsterdam Bijlmer Arena", 2017), 6470);
    }

    @Test
    public void calcInwonersVoorWijkEmptyName() throws Exception {
        assertEquals(wijk.calcInwonersVoorWijk("", 0), 0);
        assertEquals(wijk.calcInwonersVoorWijk("", 1), 3);
        assertEquals(wijk.calcInwonersVoorWijk("", 2), 6);
        assertEquals(wijk.calcInwonersVoorWijk("", 3), 9);
    }

    @Test
    public void calcInwonersVoorWijkYearZero() throws Exception {
        assertEquals(wijk.calcInwonersVoorWijk("test", 0), 2);
        assertEquals(wijk.calcInwonersVoorWijk("Nieuwegein Zuid", 0), 10);
        assertEquals(wijk.calcInwonersVoorWijk("Amsterdam Zuid", 0), 9);
        assertEquals(wijk.calcInwonersVoorWijk("Amsterdam Bijlmer Arena", 0), 16);
    }

    @Test
    public void calcInwonersVoorWijkYearNegative() throws Exception {
        assertEquals(wijk.calcInwonersVoorWijk("test", -1), 0);
        assertEquals(wijk.calcInwonersVoorWijk("Nieuwegein Zuid", -1), 7);
        assertEquals(wijk.calcInwonersVoorWijk("Amsterdam Zuid", -1), 6);
        assertEquals(wijk.calcInwonersVoorWijk("Amsterdam Bijlmer Arena", -1), 12);
    }

    @Test(expected = NullPointerException.class)
    public void calcInwonersVoorWijkYearNull() throws Exception {
        wijk.calcInwonersVoorWijk(null, 2017);
        wijk.calcInwonersVoorWijk(null, 2017);
        wijk.calcInwonersVoorWijk(null, 2017);
        wijk.calcInwonersVoorWijk(null, 2017);
    }

}