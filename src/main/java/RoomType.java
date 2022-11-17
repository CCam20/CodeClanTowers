public enum RoomType {
    SINGLE(1, 1),
    DOUBLE(2, 2),
    TRIPLE(3, 3),
    FAMILY(4, 4),
    MEETING(5, 10),
    EVENT(6, 50);
    private final int value;
    private final int capacity;

    RoomType(int value, int capacity){
        this.value = value;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getValue() {
        return this.value;
    }
}
