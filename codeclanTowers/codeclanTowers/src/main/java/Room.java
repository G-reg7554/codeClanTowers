import java.util.ArrayList;

public abstract class Room {
    private int capacity;
    private ArrayList<Guest> guestCollection;

    public Room(int capacity){
        this.capacity = capacity;
        this.guestCollection = new ArrayList<>();
    }

    public ArrayList<Guest> checkGuests(){
        return guestCollection;
    }




    public boolean addGuests(Guest guest){

        return guestCollection.add(guest);
    }


    public boolean removeGuests(Guest guest){
        return guestCollection.remove(guest);
    }










}
