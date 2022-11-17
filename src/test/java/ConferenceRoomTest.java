import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom("Conference Room 1", RoomType.MEETING);
    }

    @Test
    public void conferenceRoomHasName() {
        assertEquals("Conference Room 1", conferenceRoom.getName());
    }

    public void conferenceRoomHasType() {
//    assertEquals(2, room.getCapacityFromEnum());}
        assertEquals(RoomType.MEETING, conferenceRoom.getRoomType());
    }

    @Test
    public void conferenceRoomHasCapacity() {
        assertEquals(10, conferenceRoom.getCapacityFromEnum());
    }

    @Test
    public void getBedroomCapacityFromEnum() {
        assertEquals(10, conferenceRoom.getCapacityFromEnum());
    }
}
