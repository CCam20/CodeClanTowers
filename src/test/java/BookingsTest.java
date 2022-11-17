import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingsTest {

    private Bookings bookings;
    private BedRoom bedRoom;

    @Before
    public void before(){
        bedRoom = new BedRoom(RoomType.SINGLE, 101);
        bookings = new Bookings(bedRoom, 1);
    }
    @Test
    public void doesBookingHaveNightsBooked(){
        assertEquals(1, bookings.getNightsBooked());
    }
}
