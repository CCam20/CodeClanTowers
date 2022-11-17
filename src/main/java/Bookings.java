public class Bookings{

    private int nightsBooked;
    private BedRoom bedRoom;

    public Bookings(BedRoom bedRoom, int nightsBooked){
        this.nightsBooked = nightsBooked;
        this.bedRoom = bedRoom;
    }

    public int getNightsBooked() {
        return nightsBooked;
    }

    public void setNightsBooked(int nightsBooked) {
        this.nightsBooked = nightsBooked;
    }
}
