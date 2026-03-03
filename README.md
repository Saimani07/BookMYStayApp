Project Overview

Book My Stay is a Core Java-based Hotel Booking Management System designed to demonstrate practical application of:

Object-Oriented Programming (OOP)

Abstraction & Inheritance

Polymorphism

Encapsulation

HashMap for centralized state management

Scalable system design principles

The project is implemented incrementally using structured use cases to illustrate how real-world software systems evolve.

🎯 Implemented Use Cases (Main Branch)
✅ Use Case 1 – Application Entry & Welcome Message

Demonstrates Java program execution flow

Introduces main() method

Establishes predictable application startup

✅ Use Case 2 – Basic Room Types & Static Availability

Introduces abstract class Room

Implements SingleRoom, DoubleRoom, SuiteRoom

Demonstrates inheritance and polymorphism

Uses simple variables for availability

✅ Use Case 3 – Centralized Room Inventory Management

Replaces scattered variables with HashMap

Introduces RoomInventory class

Establishes Single Source of Truth

Provides O(1) availability lookup and update

Ensures separation of concerns

🏗 Architecture Highlights

Domain Model: Room and its subclasses

Inventory Management: RoomInventory

Availability stored using HashMap<String, Integer>

Clean separation between:

Room characteristics (beds, size, price)

Room availability (inventory state)