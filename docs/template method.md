# Template Method

**Template Method Pattern** defines the skeleton of an algorithm in a method (template method), deferring some steps to subclasses.

## Structure

![Template method pattern](figures/templatemethod.png)
- **Abstract class**: Implements the template method and defines methods.
  - **Common method**: Behavior that is applied to all subclasses.
  - **Abstract method**: Defines the steps of the algorithm.
- **Concrete class**: Implements the abstract method to carry out subclass-specific behavior while keeping the algorithm structure in place.

## Considerations

- Promotes code reuse by putting invariant parts of an algorithm in a single place.
- Provides flexibility by allowing subclasses to implement varying steps of the algorithm.
- Can lead to *rigid hierarchies* if overused; require subclasses for every tiny variation.