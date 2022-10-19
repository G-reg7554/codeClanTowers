import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HotelTest {

    Guest guest;
    ConferenceRoom conferenceRoom;
    Bedroom bedroom;
    Hotel hotel;
    @Before
    public void setUp(){
        hotel = new Hotel("Hotel California");
        bedroom = new Bedroom(59, RoomType.DOUBLE);
        conferenceRoom = new ConferenceRoom("Meeting Room", RoomType.CONFERENCEROOM);
    }
    @Test
    public void checkBedroomsSizeTest(){
        assertEquals(0, hotel.checkBedrooms().size());
    }

    @Test
    public void checkConferenceRoomsSizeTest(){
        assertEquals(0, hotel.checkConferenceRooms().size());
    }

    @Test
    public void addBedroomsTest(){
        hotel.addBedrooms(bedroom);
        hotel.addBedrooms(bedroom);
        hotel.addBedrooms(bedroom);
        assertEquals(3, hotel.checkBedrooms().size());
    }

    @Test
    public void addConferenceRoomsTest(){
        hotel.addConferenceRooms(conferenceRoom);
        assertEquals(1, hotel.checkConferenceRooms().size());
    }



}

