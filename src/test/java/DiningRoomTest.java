import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    Guest guest;
    Room room;


    @Before
    public void before(){
        diningRoom = new DiningRoom( "DiningRoom1", RoomType.DININGROOM);
        guest = new Guest("Colin");
//        room.getGuestsInRoom();
    }
    @Test
    public void diningRoomHasName(){
        assertEquals("DiningRoom1", diningRoom.getName());
    }
    @Test
    public void checkDinningRoomHasCapacity(){
        assertEquals(100, diningRoom.getCapacityFromEnum());
    }
    @Test
    public void canAddGuestsToDiningRoom(){
        diningRoom.checkInGuest(guest);
        assertEquals(1, diningRoom.checkGuestsInRoom());
    }

}
