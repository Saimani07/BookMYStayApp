/**
 * CLASS Reservation
 *
 Use Case 5: Booking Request (FIFO)
 * Description:
 This class represents a booking request
 made by a guest.
 *
 At this stage, a reservation only captures
 intent, not confirmation or room allocation.
 @version 5.0
 */
import java.util.*;

// Reservation class
class Reservation {

    // Name of guest
    private String guestName;

    // Requested room type
    private String roomType;

    // Constructor
    public Reservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }

    // Getter for guest name
    public String getGuestName() {
        return guestName;
    }

    // Getter for room type
    public String getRoomType() {
        return roomType;
    }
}


// Booking Request Queue class
class BookingRequestQueue {

    // Queue storing booking requests
    private Queue<Reservation> requestQueue;

    // Constructor
    public BookingRequestQueue() {
        requestQueue = new LinkedList<>();
    }

    // Add request to queue
    public void addRequest(Reservation reservation) {
        requestQueue.offer(reservation);
    }

    // Get next request
    public Reservation getNextRequest() {
        return requestQueue.poll();
    }

    // Check if requests exist
    public boolean hasPendingRequests() {
        return !requestQueue.isEmpty();
    }
}


// Main class
public class UseCase5BookingRequestQueue {

    public static void main(String[] args) {

        // Display heading
        System.out.println("Booking Request Queue\n");

        // Initialize queue
        BookingRequestQueue bookingQueue = new BookingRequestQueue();

        // Create booking requests
        Reservation r1 = new Reservation("Abhi", "Single");
        Reservation r2 = new Reservation("Subha", "Double");
        Reservation r3 = new Reservation("Vanmathi", "Suite");

        // Add requests to queue
        bookingQueue.addRequest(r1);
        bookingQueue.addRequest(r2);
        bookingQueue.addRequest(r3);

        // Process requests in FIFO order
        while (bookingQueue.hasPendingRequests()) {

            Reservation request = bookingQueue.getNextRequest();

            System.out.println("Processing Booking Request:");
            System.out.println("Guest Name: " + request.getGuestName());
            System.out.println("Room Type: " + request.getRoomType());
            System.out.println();
        }
    }
}