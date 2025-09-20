# Iterator

**Iterator Pattern** provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

## Structure

![Iterator pattern](figures/iterator.png)
- **Iterator**: Defines an interface for accessing and traversing elements of an aggregate object.
- **ConcreteIterator**: Implements the iterator interface and provides a way to access the elements of an aggregate object.
- **Aggregate**: Defines an interface for creating an iterator object.
- **ConcreteAggregate**: Implements the aggregate interface and provides methods for creating an iterator object.

## Considerations

- Encapsulates traversal logic separate from the aggregate’s internal structure.
- Supports multiple traversal strategies without modifying the aggregate.
- Requires additional classes (iterator + aggregate), adding complexity for simple collections.

---

## Implementation

![Iterator pattern](figures/iterator_impl.png)

| Element             | Role              | Description                                                                         |
|---------------------|-------------------|-------------------------------------------------------------------------------------|
| `Iterator<Book>`    | Iterator          | Defines an interface for traversing `Book` elements.                                |
| `BookShelfIterator` | ConcreteIterator  | Implements `Iterator<Book>`; keeps track of the current index and bookshelf.        |
| `Iterable<Book>`    | Aggregate         | Defines an interface for creating an iterator object.                               |
| `BookShelf`         | ConcreteAggregate | Implements `Iterable<Book>`; stores a collection of books and creates iterators.    |
| `Book`              | Data element      | Immutable data holder with a `title`; represents the actual element being iterated. |