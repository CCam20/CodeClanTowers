import java.util.ArrayList;

public class DiningRoom extends Room{

    private String name;
//    private ArrayList<Guest> guestsInRoom;
    public DiningRoom(String name, RoomType roomType){
        super(roomType);
        this.name = name;
//        this.guestsInRoom = new ArrayList<Guest>();
    }
    public String getName() {
        return name;
    }
//    public void addGuest(Guest guest) {
//        this.guestsInRoom.add(guest);
//    }
//    public int getGuestsInRoom() {
//        return this.guestsInRoom.size();
//    }
////    public int getGuestsInRoom();
}
