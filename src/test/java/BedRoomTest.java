import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
public class BedRoomTest {

    BedRoom bedroom;
    ArrayList<Guest> guestsInRoom;
    Guest guest1;
//    Room room;


    @Before
    public void before(){
        guest1 = new Guest("Randolf");
        guestsInRoom = new ArrayList<>();
        bedroom = new BedRoom(RoomType.DOUBLE, 102);
    }
    @Test
    public void bedroomHasCapacity() {
//    assertEquals(2, room.getCapacityFromEnum());}
        assertEquals(RoomType.DOUBLE,bedroom.getRoomType());
    }
}
