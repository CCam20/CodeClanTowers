import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
public class HotelTest {

    Hotel hotel;
    Guest guest;

    BedRoom bedRoom;

    @Before
    public void before(){
        guest = new Guest("Randolf");
        hotel = new Hotel();
        bedRoom = new BedRoom(RoomType.FAMILY, 202);
    }
    @Test
    public void canCheckInGuests(){
        bedRoom.checkInGuest(guest);
        assertEquals(1, bedRoom.checkGuestsInRoom());
    }
    @Test
    public void canCheckOutGuests() {
        bedRoom.checkInGuest(guest);
        bedRoom.checkOutGuest(guest);
        assertEquals(0, bedRoom.checkGuestsInRoom());
    }
}

