public class Bedroom extends Room {
    //roomNumber and roomType

    private int roomNumber;
    private RoomType roomType;

    public Bedroom(int roomNumber, RoomType roomType){
        super(roomType.capacity);
        this.roomNumber = roomNumber;
        this.roomType = roomType;

    }
    public int getRoomNumber(){
        return this.roomNumber;
    }
    public RoomType getRoomType(){
        return this.roomType;
    }

    public int getRoomEnumValue(){
        return this.roomType.getValue();
    }

}
