import java.util.ArrayList;

public abstract class Room {

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


    public void setGuestsInRoom(ArrayList<Guest> guestsInRoom) {
        this.guestsInRoom = guestsInRoom;
    }

    public RoomType getRoomType(){
        return this.roomType;
    }
    public void checkInGuest(Guest guest){
       this.guestsInRoom.add(guest);
    }
    public void checkOutGuest(Guest guest) {
        this.guestsInRoom.remove(guest);
    }
    public int checkGuestsInRoom() {
        return this.guestsInRoom.size();
    }
}

