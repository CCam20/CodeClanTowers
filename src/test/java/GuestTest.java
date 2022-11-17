import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest1;

    @Before
    public void before(){
        guest1 = new Guest("Randolf");
    }
    @Test
    public void hasName(){
        assertEquals("Randolf", guest1.getName());
    }

}
