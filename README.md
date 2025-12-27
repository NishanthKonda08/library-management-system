# Library Management System

A command-line application to manage library checkouts, returns, and fines.

## Features
- Add books and DVDs to the library
- Register members
- Checkout and return items
- Automatic fine calculation (Books: $1/day, DVDs: $2/day)
- View member checkouts and fines
- Check available items

## Classes
- `LibraryItem` - Abstract base class for all items
- `Book` - Concrete class for books (14-day checkout)
- `DVD` - Concrete class for DVDs (7-day checkout)
- `Member` - Represents a library member
- `Library` - Manages all items and members
- `Checkoutable` - Interface for checkable items


