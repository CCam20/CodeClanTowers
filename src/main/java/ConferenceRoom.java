public class ConferenceRoom extends Room{

    private String name;

    public ConferenceRoom(String name, RoomType roomType){
        super(roomType);
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
