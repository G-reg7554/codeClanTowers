import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Guest guest;
    Bedroom bedroom;
    Bedroom bedroomOne;
    Hotel hotel;

    @Before
    public void setUp(){
        bedroom = new Bedroom(59, RoomType.DOUBLE);
        bedroomOne = new Bedroom(60, RoomType.TRIPLE);
        hotel = new Hotel("Hotel California");
        guest = new Guest("Mike");


    }
    @Test
    public void hasRoomNumberTest(){
        assertEquals(59, bedroom.getRoomNumber());
    }
    @Test
    public void getRoomNumberEnumTest(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void getRoomEnumValueTest(){
        assertEquals(3, bedroomOne.getRoomEnumValue());
    }

    @Test
    public void addGuestToBedroomTest(){
        assertEquals(0, bedroom.checkGuests().size());
    }

    @Test
    public void addGuestTest(){
        bedroom.addGuests(guest);
        bedroom.addGuests(guest);
        bedroom.addGuests(guest);
        hotel.addBedrooms(bedroom);
        assertEquals(3, bedroom.checkGuests().size());
        assertEquals(1, hotel.checkBedrooms().size());
        assertEquals(59, bedroom.getRoomNumber());
    }

    @Test
    public void removeGuestTest(){
        bedroom.addGuests(guest);
        bedroom.addGuests(guest);
        bedroom.addGuests(guest);
        bedroom.removeGuests(guest);
        bedroom.removeGuests(guest);
        hotel.addBedrooms(bedroom);
        assertEquals(1, hotel.checkBedrooms().size());
        assertEquals(1, bedroom.checkGuests().size());
        assertEquals(59, bedroom.getRoomNumber());


    }

}
