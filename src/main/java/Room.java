import java.util.ArrayList;

public class Room {

//    private int capacity;
    private ArrayList<Guest> guestsInRoom;
    Guest guest;
    private RoomType roomType;

    public Room(RoomType roomType) {
        this.guestsInRoom = new ArrayList<>();
        this.roomType = roomType;
    }

    public int getCapacityFromEnum() {
       return this.roomType.getCapacity();
    }

    public ArrayList<Guest> getGuestsInRoom() {
        return guestsInRoom;
    }

    public void setGuestsInRoom(ArrayList<Guest> guestsInRoom) {
        this.guestsInRoom = guestsInRoom;
    }

    public RoomType getRoomType(){
        return this.roomType;
    }
}

