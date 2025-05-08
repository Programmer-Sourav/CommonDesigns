
This repository is for Design Patterns used in Software Development. 

1. First Commit: Factory method Pattern and Abstract Factory Method Pattern.

The Factory Method Pattern defines an interface for creating an object,
but lets subclasses alter the type of objects that will be created.


An abstract class or interface declares the factory method (e.g. getProduct()).
Subclasses override this method to instantiate specific types.

EntityCrop defines the factory method (getProduct).

ProductRice and ProductSugarCane override it to produce Rice and Sugarcane.

✅ This is Factory Method Pattern: subclasses decide which product to create.


Creating interfaces and then providing concrete implementations does
align with the Factory Pattern, particularly the Factory Method Pattern in design patterns.

Factory Pattern is useful for:

Hiding object creation logic.

Promoting loose coupling.

Creating objects based on logic or configuration.
**/
/******
Abstract Factory pattern is a container that holds similar/related types of objects.


The Abstract Factory Pattern acts like a container or a factory of factories,
where each factory creates families of related or dependent objects without specifying their concrete classes.


The Abstract Factory provides an interface for
 creating related objects (often grouped by theme — like UI elements, OS-specific components, etc.).

Real-World Analogy:
Think of a UI toolkit that supports multiple operating systems — Windows, Mac, Linux. Each OS has its own versions of buttons, scrollbars, etc. You want to create families of objects (e.g., Button, ScrollBar) without knowing the exact class you're instantiating.

🧱 Structure:
Abstract Factory Interface – Declares creation methods for each type of object.

Concrete Factory – Implements the creation methods for specific families.

Abstract Product – Declares interface for a type of object (e.g., Button).

Concrete Product – Implements that interface for a specific family (e.g., WindowsButton, MacButton).

Factory Method = single object

Abstract Factory = related group of objects (like a themed set)

Great for ensuring consistency among related objects and enabling easy scalability.


Definition
The Abstract Factory Pattern provides an interface to create families of related or dependent objects without specifying their concrete classes.

📐 Structure
A common interface (e.g., Crop) that declares multiple product-creation behaviors.

Concrete factories (e.g., ProductRice, ProductSugarCane) implement this interface and create actual product objects.

✅ Intent / Use Cases
When you need to create a family of related products (e.g., UI kits for MacOS/Windows).

To ensure that products belong together, and are used together consistently.

