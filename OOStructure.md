# OO Design Structure

##### Reference
https://leetcode.com/discuss/interview-question/object-oriented-design/508056/OOD-Design-Maps-Navigator-Client-for-different-transportation-types

---

## TransportType Enum
 #### Attributes:
 - type enum // __WALK, CAR, BUS, BIKE__

---

## Location Class
 #### Attributes:
 - latitude Double
 - longitude Double

## PathNode Class
 #### Attributes:
 - location Location
 - prev PathNode
 - next PathNode

---

## INavigator Interface
 #### Methods:
 - getPath(Location A, Location B) PathNode

## Navigator Class implements INavigator
 #### Attributes:
 - transportType TransportType
 #### Methods:
 - getPath(Location A, Location B) PathNode
 - Navigator(transportType TransportType) \
// constructor - use __Singleton__ Object

---

## TransportContext Class
 #### Attributes:
 - transport ITransport
 #### Methods:
 - buildPath(Location A, Location B) PathNode
 - TransportContext(ITransport transport) \
// constructor - sets transport attribute to passed in transport object

---

## ITransport Interface
 #### Methods:
 - buildPath(Location A, Location B) PathNode

### Walk Class implements ITransport
 #### Methods:
 - buildPath(Location A, Location B) PathNode

### Car Class implements ITransport
 #### Methods:
 - buildPath(Location A, Location B) PathNode

### Bus Class implements ITransport
 #### Methods:
 - buildPath(Location A, Location B) PathNode

### Bike Class implements ITransport
 #### Methods:
 - buildPath(Location A, Location B) PathNode

---

# For Executing Transport use - Strategy Pattern

- Interface - exposing execute algo method
- Concrete Algo Classes implementing Interface

- Context Class (only talks to the Interface,
                only takes in a reference for Class which implements Interface)
    : keeps a reference to one of Concrete Classes
    : executes Concrete Class method based on reference of selected Strategy

- Client Class will pass the object of one of Concrete Classes to the Context Class
    and set the reference
    : And further Client Class will use the Context Class execute method to execute
    required Strategy based on the reference object passed in