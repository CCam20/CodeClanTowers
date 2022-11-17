public enum RoomType {
//    SINGLE(1, 1),
//    DOUBLE(2, 2),
//    TRIPLE(3, 3),
//    FAMILY(4, 4);
    SINGLE(1),
    DOUBLE(2),
    TRIPLE(3),
    FAMILY(4);
//conference rooms to be added
    private final int value;
//    private final int capacity;

//    RoomType(int value, int capacity){
//        this.value = value;
//        this.capacity = capacity;
//    }
    RoomType(int value) {
        this.value = value;
    }
//    public int getValue() {
//        return this.value;
//    }
//
    public int getCapacity() {
        return this.value;
    }

}
