package inwoners;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
        assertEquals(wijk.calcInwonersVoorWijk("x", 0), 0);
        assertEquals(wijk.calcInwonersVoorWijk("xx", 0), 1);
        assertEquals(wijk.calcInwonersVoorWijk("xxx", 0), 2);
        assertEquals(wijk.calcInwonersVoorWijk("xxxx", 0), 2);
    }

}