import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    Room room;
    Guest guest;
    ConferenceRoom conferenceRoom;
    Bedroom bedroom;
    RoomType roomType;
    Hotel hotel;
    @Before
    public void setUp(){
        conferenceRoom = new ConferenceRoom("Meeting Room", RoomType.CONFERENCEROOM);
        hotel = new Hotel("Hotel California");
        guest = new Guest("Dave");

    }
    @Test
    public void addGuestToBedroomTest(){
        assertEquals(0, conferenceRoom.checkGuests().size());
    }

    @Test
    public void addGuestTest(){
        conferenceRoom.addGuests(guest);
        conferenceRoom.addGuests(guest);
        conferenceRoom.addGuests(guest);
        hotel.addConferenceRooms(conferenceRoom);
        assertEquals(3, conferenceRoom.checkGuests().size());
        assertEquals(1,hotel.checkConferenceRooms().size());
    }

    @Test
    public void removeGuestTest(){
        conferenceRoom.addGuests(guest);
        conferenceRoom.addGuests(guest);
        conferenceRoom.addGuests(guest);
        conferenceRoom.removeGuests(guest);
        hotel.addConferenceRooms(conferenceRoom);
        assertEquals(2, conferenceRoom.checkGuests().size());
        assertEquals(1, hotel.checkConferenceRooms().size());
    }

}
