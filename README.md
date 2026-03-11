# Use Case 6 – Reservation Confirmation & Room Allocation

## Project Description

This module of the **Hotel Booking Management System** confirms booking requests and allocates rooms safely.
The system processes booking requests and assigns a **unique room ID** to each confirmed reservation while updating the room inventory immediately.

## Objective

The objective of this use case is to:

* Confirm booking requests from the queue
* Assign a unique room ID for each reservation
* Prevent double booking
* Maintain consistency between booking and inventory data

## Key Concepts Used

* **Set Data Structure** – Ensures uniqueness of room IDs.
* **HashMap** – Maps room types to allocated room IDs.
* **Inventory Synchronization** – Updates room availability immediately after allocation.
* **Atomic Allocation Operation** – Room assignment and inventory update occur together.

## System Components

### 1. Reservation Class

Represents a guest’s booking request.

Stores:

* Guest Name
* Requested Room Type

### 2. RoomInventory Class

Maintains the current room availability.

Functions:

* Retrieve available rooms
* Update inventory after allocation

### 3. RoomAllocationService Class

Responsible for:

* Confirming booking requests
* Generating unique room IDs
* Assigning rooms safely
* Updating inventory

### 4. Main Class (UseCase6RoomAllocationService)

* Initializes room inventory
* Creates booking requests
* Calls the allocation service
* Displays booking confirmations

## Features

* Generates unique room IDs
* Prevents duplicate room allocation
* Updates inventory immediately
* Ensures consistent booking records

## How to Compile and Run

### Compile

```bash
javac UseCase6RoomAllocationService.java
```

### Run

```bash
java UseCase6RoomAllocationService
```

## Example Output

```
Room Allocation Processing

Booking confirmed for Guest: Abhi, Room ID: Single-1
Booking confirmed for Guest: Subha, Room ID: Single-2
Booking confirmed for Guest: Vanmathi, Room ID: Suite-1
```

## Benefits

* Guaranteed uniqueness of room assignments
* Prevention of double-booking
* Immediate synchronization between booking and inventory
* Reliable room allocation process

## Author

Sai Manikanta
