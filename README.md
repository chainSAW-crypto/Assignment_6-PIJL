# Duck Behavior Simulation Project

## Project Structure

The project is organized into several key components:

### Interfaces:
- **FlyBehavior** - Defines the `fly()` method.
- **QuackBehavior** - Defines the `quack()` method.
- **SwimBehavior** - Defines the `swim()` method.

### Behavior Implementations:
- **FlyWithWings, FlyNoWay** - Implement `FlyBehavior` with flying and non-flying behaviors.
- **Quack, Squeak, MuteQuack** - Implement `QuackBehavior` with different quacking sounds.
- **Swim, Float, Drown** - Implement `SwimBehavior` with swimming, floating, and drowning behaviors.

### Abstract Duck Class:
- **Duck** - An abstract class that uses behavior interfaces to define the actions of ducks. It provides methods to perform flying, quacking, and swimming behaviors, along with setter methods to dynamically change a duck's behavior.

### Concrete Duck Classes:
- **MallardDuck, RedHeadDuck, RubberDuck** - Extend the `Duck` class and initialize different behaviors.

### Main Class:
- **Main** - Contains the `main` method to demonstrate the behavior of different ducks.

## How It Works

Each duck type (e.g., Mallard Duck, RedHead Duck, Rubber Duck) is instantiated with specific behaviors for flying, quacking, and swimming. These behaviors can be changed at runtime, demonstrating the flexibility of the Strategy Design Pattern. The `Main` class creates instances of different ducks and invokes their methods to display their behaviors.

## Running the Project

To run this project, you need to have Java installed on your machine. Compile and run the `Main` class using your Java IDE or the command line:

```sh
javac Main.java
java Main
