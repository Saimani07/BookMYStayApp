Centralized Room Inventory Management

This use case introduces centralized inventory management using a HashMap.

A new class RoomInventory is created to manage room availability.

Room availability is stored using HashMap<String, Integer> where:

Key → Room Type

Value → Available Room Count

The HashMap provides average O(1) constant-time lookup and update operations.

Inventory initialization is handled inside the constructor to ensure a consistent starting state.

The method getRoomAvailability() returns the current inventory status.

The method updateAvailability() allows controlled updates to room counts.

This design establishes a Single Source of Truth for availability data.

Room characteristics (beds, size, price) remain in the Room domain model, ensuring separation of concerns.

This approach improves scalability, maintainability, and prevents inconsistent state compared to scattered variables used in Use Case 2.