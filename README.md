Basic Room Types & Static Availability

This program demonstrates object-oriented modeling in a Hotel Booking Management System.

An abstract class Room is created to represent a generic hotel room.

The Room class contains common attributes:

numberOfBeds

squareFeet

pricePerNight

Concrete classes SingleRoom, DoubleRoom, and SuiteRoom extend the Room class using inheritance.

Polymorphism is demonstrated by referencing child objects using the Room type.

Availability is stored using simple integer variables (static representation).

The program prints room details and availability to the console.

No data structures (ArrayList, Map, etc.) are used in this use case.

The purpose is to separate domain modeling (what a room is) from system state (availability).

This use case builds the foundation for future inventory management and refactoring.