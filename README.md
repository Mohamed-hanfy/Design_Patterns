# Design_Patterns

A curated set of classic GoF design pattern implementations in Java. Each package demonstrates one pattern with minimal, focused examples you can run from the command line.

### Highlights
- Covers Adapter, Command, Composite, Decorator, Iterator, Observer, Proxy, Singleton, State, Strategy, and Template Method
- Plain Java (no frameworks) with small runnable demos
- Maven project targeting Java 23

## Project Structure

```
src/main/java/org/example/
  adapter/            # Adapter pattern demo
  command/            # Command pattern demo (remote control + commands)
  composite/          # Composite pattern (menus and items)
  decorator/          # Decorator pattern (beverages and condiments)
  iterator/           # Custom iterator implementations and usage
  observer/           # Weather station subject/observers
  proxy/              # Gumball machine remote monitor (proxy-like)
  singleton/          # Thread-safe singleton example
  state/              # Gumball machine state transitions
  strategy/           # Duck behaviors (fly/quack strategies)
  template/           # Caffeine beverage template method
  Main.java           # Simple entry point that may run selected demos
```

Key demo entry points you can run directly:
- `org.example.Main`
- `org.example.state.GumballMachineSimulation`
- `org.example.proxy.GumballMachineSimulationII`

## Prerequisites

- Java 23 (JDK 23)
- Maven 3.9+

Verify versions:
```bash
java -version
mvn -v
```

## Build

```bash
mvn clean compile
```

If you prefer a JAR (without a predefined main-class):
```bash
mvn -q -DskipTests package
```

## Run

This project does not declare an exec plugin or manifest main-class, so run classes via the compiled output in `target/classes`.

Windows PowerShell examples:

```bash
# 1) Run the default example (if implemented)
mvn -q compile
java -cp target/classes org.example.Main

# 2) Run State pattern simulation
java -cp target/classes org.example.state.GumballMachineSimulation

# 3) Run Proxy pattern simulation
java -cp target/classes org.example.proxy.GumballMachineSimulationII
```

If you want to use `mvn exec:java`, add the exec plugin and specify the `mainClass`. Example plugin snippet for `pom.xml`:

```xml
<build>
  <plugins>
    <plugin>
      <groupId>org.codehaus.mojo</groupId>
      <artifactId>exec-maven-plugin</artifactId>
      <version>3.3.0</version>
      <configuration>
        <mainClass>org.example.Main</mainClass>
      </configuration>
    </plugin>
  </plugins>
  <!-- keep other build settings here -->
  <!-- note: not currently included in this repo's pom.xml -->
  
</build>
```

Then you could run:
```bash
mvn -q compile exec:java
```

## Pattern Summaries

- Adapter: Convert `Turkey` to `Duck` interface using `TurkeyAdapter` so clients expecting `Duck` can work with a `WilldTurkey`.
- Command: Encapsulate requests (e.g., `LightOnCommand`, `LightOffCommand`) and execute via `RemoteControl`/`SimpleRemoteControl`.
- Composite: Treat `Menu` and `MenuItem` uniformly with `MenuComponent`; `Waitress` traverses and prints.
- Decorator: Dynamically add responsibilities to beverages (e.g., `Espresso` + `Mocha`) via `CondimentDecorator`.
- Iterator: Provide custom iterators for different menu collections with a common `Iterator` interface and a `Waitress` client.
- Observer: `WeatherData` (Subject) notifies `CurrentStateDisplay` (Observer) via a simple observer API.
- Proxy: `GumballMonitor` observes `GumballMachine` state from afar (proxy/monitoring flavor).
- Singleton: Lazy-initialized singleton ensuring a single instance across the app.
- State: `GumballMachine` transitions across `NoQuarterState`, `HasQuarterState`, `SoldState`, `SoldOutState`, and `winnerState`.
- Strategy: `Duc` composes `FlyBehavior` and `QuacBehavior` (e.g., `Quack`) to vary behavior at runtime.
- Template Method: `CaffeineBeverage` defines an algorithm skeleton; `Tea` and `Coffee` implement steps.

## How to Explore

1. Open the corresponding package and read the interfaces/classes (start with the interface/abstract types).
2. Run the demo class for that pattern (see Run section).
3. Modify behaviors or add new concrete classes to see pattern flexibility.

## Extending the Examples

- Add new beverages/condiments in `decorator` and compose them in a small runner.
- Create additional commands/devices in `command` and wire them in `RemoteControl`.
- Implement a new `FlyBehavior` or `QuacBehavior` in `strategy` and inject them into `Duc`.
- Add composite levels or leaf types in `composite` and print using `Waitress`.

## Notes

- The Java package/class names are intentionally simple and educational.
- Some names are kept close to Head First Design Patterns style for familiarity.