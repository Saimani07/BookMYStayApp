# Use Case 4 – Room Search & Availability Check

## Project Description

This project demonstrates a **Hotel Booking Management System module** that allows guests to search for available rooms without modifying the inventory data.
The system follows **read-only access principles**, ensuring that room availability can be viewed safely without affecting booking or inventory updates.

## Objective

The goal of this use case is to enable guests to:

* View available room types
* Check room pricing and details
* Ensure that only rooms with available inventory are displayed

The system maintains **clear separation between search operations and booking logic**.

## Key Concepts Used

* **Read-Only Access** – The search service reads data without modifying inventory.
* **Defensive Programming** – Ensures only valid and available rooms are displayed.
* **Separation of Concerns** – Search logic is separated from booking and inventory updates.
* **Inventory as State Holder** – The inventory stores room availability information.
* **Domain Model Usage** – Room objects contain details such as pricing and amenities.

## System Components

1. **Room Class**

    * Stores room details such as:

        * Room type
        * Price
        * Amenities

2. **RoomInventory Class**

    * Maintains the availability of rooms using a Map.
    * Provides a method to retrieve availability.

3. **RoomSearchService Class**

    * Implements the room search functionality.
    * Displays available rooms based on inventory data.

4. **Main Class (UseCase4RoomSearch)**

    * Creates room objects.
    * Initializes inventory.
    * Calls the search service to display available rooms.

## Features

* Displays only rooms with availability greater than zero
* Retrieves availability from centralized inventory
* Shows room details and pricing
* Prevents accidental modification of inventory

## How to Compile and Run

### Compile

```
javac UseCase4RoomSearch.java
```

### Run

```
java UseCase4RoomSearch
```

## Sample Output

```
Available Rooms:

Room Type: Single
Price: 2000
Amenities: WiFi, TV

Room Type: Double
Price: 3500
Amenities: WiFi, TV, AC

Room Type: Suite
Price: 6000
Amenities: WiFi, TV, AC, Mini Bar
```

## Benefits

* Accurate visibility of room availability
* Improved system stability
* Reduced risk of inventory corruption
* Clear separation between read-only and write operations

## Author

Saimani07
