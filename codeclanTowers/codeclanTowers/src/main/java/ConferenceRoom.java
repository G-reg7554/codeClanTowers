public class ConferenceRoom extends Room{
    RoomType roomType;
    private String name;

    public ConferenceRoom(String name, RoomType roomType){
        super(roomType.capacity);
        this.name = name;
    }
}
