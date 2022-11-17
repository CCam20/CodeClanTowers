import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guestsInRoom;

    public Room(int capacity, ArrayList<Guest>guestsInRoom) {
        this.capacity = capacity;
        this.guestsInRoom = guestsInRoom;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Guest> getGuestsInRoom() {
        return guestsInRoom;
    }

    public void setGuestsInRoom(ArrayList<Guest> guestsInRoom) {
        this.guestsInRoom = guestsInRoom;
    }
}

