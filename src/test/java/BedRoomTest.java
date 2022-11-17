import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
public class BedRoomTest {

    BedRoom bedroom;
    ArrayList<Guest> guestsInRoom;
    Guest guest1;


    @Before
    public void before(){
        bedroom = new BedRoom(RoomType.DOUBLE, 102);
    }
    @Test
    public void bedroomHasType() {
//    assertEquals(2, room.getCapacityFromEnum());}
        assertEquals(RoomType.DOUBLE,bedroom.getRoomType());
    }
    @Test
    public void bedRoomHasRoomNumber(){
        assertEquals(102, bedroom.getRoomNumber());
    }
    @Test
    public void getBedroomCapacityFromEnum(){
        assertEquals(2, bedroom.getCapacityFromEnum());
    }
}