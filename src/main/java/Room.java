import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guestsInRoom;

    public Room(int capacity, ArrayList<Guest>guestsInRoom) {
        this.capacity = capacity;
        this.guestsInRoom = guestsInRoom;
    }
}

