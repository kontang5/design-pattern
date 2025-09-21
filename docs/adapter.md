# Adapter Pattern

**Adapter Pattern** allows objects with incompatible interfaces to work together. It acts as an **adapter** between two interfaces, converting the interface of a class into another interface expected by the client.

## Structure

![Adapter pattern](figures/adapter.png)
- **Target**: Defines the domain-specific interface that the client uses.
- **Client**: Collaborates with objects using the target interface.
- **Adaptee**: The existing class with an incompatible interface that needs to be adapted.
- **Adapter**: Implements the target interface and translates requests from the client to the adaptee.

## Considerations

- Encapsulates conversion logic, keeping client code decoupled from the adaptee.
- Supports integration of legacy or third-party code without modification.
- May increase complexity linearly with the number of adapters.
