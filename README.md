Fawry Quantum Internship Challenge
This project is a simple E-commerce Checkout System written in Java as part of the Fawry Quantum Internship challenge. It handles common real-world shopping cart scenarios, including product management, cart operations, and the checkout process.

🚀 Features
Product Types:

Food: Includes expiry date and weight.

Electronics: Includes weight only.

Digital Products: No shipping required.

Shopping Cart:

Add multiple items with quantities.

Validate stock availability.

Checkout Logic:

Verify food expiry.

Calculate shipping fees for shippable products.

Check if the user has sufficient balance.

Generate a detailed receipt and a shipping notice (if applicable).

📁 Project Structure
Fawry-Quantum-Internship-Challenge/
└── src/
    ├── Main.java                       // Application entry point

    ├── interfaces/                    // Common behaviors
    │   ├── Expirable.java              // Interface for expirable items (e.g., Food)
    │   └── Shippable.java              // Interface for items requiring shipping

    ├── models/                        // Core domain models
    │   ├── Product.java                // Abstract base class for all products
    │   ├── Food.java                   // Food product with expiry and weight
    │   ├── Electronic.java             // Electronic product with weight
    │   ├── Digital.java                // Digital product (no shipping)
    │   ├── Cart.java                   // Represents the shopping cart
    │   ├── CartItem.java               // Holds product and quantity info
    │   └── Customer.java               // Represents the customer (with balance)

    ├── services/                      // Business logic and operations
    │   ├── CheckoutService.java        // Coordinates the full checkout process
    │   ├── CheckExpirationDate.java    // Validates food product expiry
    │   ├── CheckCustomerBalanceService.java // Verifies if customer has enough balance
    │   ├── CalculationsForShippableProducts.java // Calculates shipping costs
    │   ├── PrintCheckoutReceipt.java   // Prints a detailed checkout receipt
    │   └── PrintShipmentNotice.java    // Prints shipping notice for shippable items
