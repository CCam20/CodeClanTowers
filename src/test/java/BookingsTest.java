import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingsTest {

    private Bookings bookings;
    private BedRoom bedRoom;

    @Before
    public void before(){
        bedRoom = new BedRoom(RoomType.SINGLE, 101);
        bookings = new Bookings(bedRoom, 3, 85);
    }
    @Test
    public void doesBookingHaveNightsBooked(){
        assertEquals(3, bookings.getNightsBooked());
    }
    @Test
    public void bookingHasNightlyRate(){
        bookings.setRate(85);
        assertEquals(85, bookings.getRate());
    }
    @Test
    public void checkTotalCost(){
        assertEquals(255, bookings.getTotalCost());

    }

}
