import java.util.ArrayList;

public class BedRoom extends Room{

    private RoomType roomType;
    private int roomNum;

    public BedRoom(int capacity, ArrayList<Guest> guestInRoom, RoomType roomType, int roomNum){
        super(capacity, guestInRoom);
        this.roomType = roomType;
        this.roomNum = roomNum;
    }

}
