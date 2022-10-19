public enum RoomType {
    SINGLE(1),
    DOUBLE(2),
    TRIPLE(3),
    FAMILY(4),

    CONFERENCEROOM(5);

    public final int capacity;


    RoomType(int capacity){

        this.capacity = capacity;
    }

    public int getValue() {
        return this.capacity;
    }
}