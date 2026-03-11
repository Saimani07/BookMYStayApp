/**
 MAIN CLASS Use Case4RoomSearch
 * Use Case 4: Room Search & Availability Check
 * Description:
 * This class demonstrates how guests
 *can view available rooms without
 * modifying inventory data.
 * The system enforces read-only access
 * by design and usage discipline.
 @version 4.0
 */
import java.util.*;

// Room class (domain object)
class Room {
    String type;
    double price;
    String amenities;

    public Room(String type, double price, String amenities) {
        this.type = type;
        this.price = price;
        this.amenities = amenities;
    }

    public void displayDetails() {
        System.out.println("Room Type: " + type);
        System.out.println("Price: ₹" + price);
        System.out.println("Amenities: " + amenities);
        System.out.println("---------------------------");
    }
}

// Inventory class (state holder)
class RoomInventory {
    private Map<String, Integer> availability;

    public RoomInventory() {
        availability = new HashMap<>();
        availability.put("Single", 3);
        availability.put("Double", 2);
        availability.put("Suite", 1);
    }

    public Map<String, Integer> getRoomAvailability() {
        return availability;   // Read-only access
    }
}

// Search Service
class RoomSearchService {

    public void searchAvailableRooms(
            RoomInventory inventory,
            Room singleRoom,
            Room doubleRoom,
            Room suiteRoom) {

        Map<String, Integer> availability = inventory.getRoomAvailability();

        System.out.println("Available Rooms:\n");

        // Single Room
        if (availability.get("Single") > 0) {
            singleRoom.displayDetails();
        }

        // Double Room
        if (availability.get("Double") > 0) {
            doubleRoom.displayDetails();
        }

        // Suite Room
        if (availability.get("Suite") > 0) {
            suiteRoom.displayDetails();
        }
    }
}

// Main class
public class UseCase4HotelBookingApp {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        Room singleRoom = new Room("Single", 2000, "WiFi, TV");
        Room doubleRoom = new Room("Double", 3500, "WiFi, TV, AC");
        Room suiteRoom = new Room("Suite", 6000, "WiFi, TV, AC, Mini Bar");

        RoomSearchService searchService = new RoomSearchService();

        searchService.searchAvailableRooms(
                inventory,
                singleRoom,
                doubleRoom,
                suiteRoom);
    }
}