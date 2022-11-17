import java.util.ArrayList;

public class BedRoom extends Room{

    private int roomNum;

    public BedRoom(RoomType roomType, int roomNum){
        super(roomType);
        this.roomNum = roomNum;
    }


    public int getRoomNumber() {
        return this.roomNum;
    }
}
