# Use Case 5 – Booking Request (First-Come-First-Served)

## Project Description

This module of the **Hotel Booking Management System** demonstrates how booking requests are handled using a **First-Come-First-Served (FIFO)** approach.
The system collects booking requests from guests and stores them in a queue to ensure fair and ordered processing.

## Objective

The goal of this use case is to:

* Accept booking requests from guests
* Store requests in the order they arrive
* Ensure fair handling of multiple booking requests
* Prepare requests for later processing by the room allocation system

## Key Concepts Used

* **Queue Data Structure** – Used to store booking requests.
* **FIFO Principle** – Requests are processed in the order they arrive.
* **Fair Request Handling** – Prevents any request from bypassing another.
* **Decoupling Request Intake from Allocation** – Requests are collected first and processed later.

## System Components

### 1. Reservation Class

Represents a booking request made by a guest.

Stores:

* Guest Name
* Requested Room Type

### 2. BookingRequestQueue Class

Manages booking requests using a **Queue**.

Main functions:

* Add booking requests to the queue
* Retrieve the next request
* Check if pending requests exist

### 3. Main Class (UseCase5BookingRequestQueue)

* Initializes the booking queue
* Creates reservation requests
* Adds them to the queue
* Displays requests in FIFO order

## Features

* Maintains request order automatically
* Ensures fair booking request handling
* Prevents simultaneous request conflicts
* No inventory or room allocation occurs at this stage

## How to Compile and Run

### Compile

```bash
javac UseCase5BookingRequestQueue.java
```

### Run

```bash
java UseCase5BookingRequestQueue
```

## Example Output

```
Booking Request Queue

Processing booking request:
Guest: Abhi - Room Type: Single

Processing booking request:
Guest: Subha - Room Type: Double

Processing booking request:
Guest: Vanmathi - Room Type: Suite
```

## Benefits

* Fair booking request management
* Predictable behavior during peak demand
* Efficient handling of multiple booking requests
* Preparation for later room allocation

## Author

Sai Manikanta
