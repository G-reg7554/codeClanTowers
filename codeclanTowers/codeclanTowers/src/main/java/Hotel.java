import java.util.ArrayList;

public class Hotel{
    Room room;
    Guest guest;
    private ArrayList<Bedroom>bedroomList;
    private ArrayList<ConferenceRoom>conferenceRoomList;

    private String name;

    public Hotel(String name){
        this.name = name;
        this.bedroomList = new ArrayList<>();
        this.conferenceRoomList = new ArrayList<>();
    }

    public ArrayList<Bedroom> checkBedrooms(){
        return this.bedroomList;
    }

    public ArrayList<ConferenceRoom> checkConferenceRooms(){
        return this.conferenceRoomList;
    }

    public boolean addBedrooms(Bedroom bedroom){
        return this.bedroomList.add(bedroom);
    }

    public boolean addConferenceRooms(ConferenceRoom conferenceRoom){
        return this.conferenceRoomList.add(conferenceRoom);
    }

}
