public enum RoomType {
    SINGLE(1),
    DOUBLE(2),
    TRIPLE(3),
    FAMILY(4);

    private final int value;
//    private final int capacity;

    RoomType(int value){
        this.value = value;
//        this.capacity = capacity;
    }

    public int getValue() {
        return this.value;
    }


//    public int getCapacity() {
//        return capacity;
//    }
}
