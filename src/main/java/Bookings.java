public class Bookings{

    private int nightsBooked;
    private int rate;
    private BedRoom bedRoom;

    public Bookings(BedRoom bedRoom, int nightsBooked, int rate){
        this.nightsBooked = nightsBooked;
        this.bedRoom = bedRoom;
        this.rate = rate;
    }

    public int getNightsBooked() {
        return nightsBooked;
    }

    public void setNightsBooked(int nightsBooked) {
        this.nightsBooked = nightsBooked;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getTotalCost() {
        return this.rate * this.nightsBooked;
    }
}
