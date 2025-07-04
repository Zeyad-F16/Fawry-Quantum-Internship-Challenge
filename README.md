# Fawry Quantum Internship Challenge

A simple **E-commerce Checkout System** built in **Java** for the Fawry Quantum Internship challenge.  
This project simulates real-world scenarios of a shopping cart system — managing products, validating conditions, and completing the checkout process.

---

## 🚀 Features

- **Product Types**:
  - `Food`: Includes expiry date and weight.
  - `Electronics`: Includes weight only.
  - `Digital`: No shipping required.

- **Interfaces**:
  - `Expirable`: Implemented by food products.
  - `Shippable`: Implemented by products requiring delivery.

- **Shopping Cart**:
  - Add multiple items with specific quantities.
  - Ensure sufficient quantity available before checkout.

- **Checkout Logic**:
  - Validate expiry dates (for food items).
  - Calculate shipping for shippable products.
  - Validate user balance before completing purchase.
  - Print checkout receipt and shipping notice.

---

## 🧠 Project Structure

```
Fawry-Quantum-Internship-Challenge/
└── src/
    ├── Main.java                       // Entry point

    ├── interfaces/                    // Common behavior definitions
    │   ├── Expirable.java              // For products with expiry (e.g., Food)
    │   └── Shippable.java              // For products requiring shipping

    ├── models/                        // Domain models
    │   ├── Product.java                // Abstract base class
    │   ├── Food.java                   // Expirable & Shippable
    │   ├── Electronic.java             // Shippable
    │   ├── Digital.java                // Non-shippable
    │   ├── Cart.java                   // Represents the user's cart
    │   ├── CartItem.java               // Product + Quantity
    │   └── Customer.java               // Customer with balance

    ├── services/                      // Business logic
    │   ├── CheckoutService.java        // Handles full checkout flow
    │   ├── CheckExpirationDate.java    // Validates expiration of food items
    │   ├── CheckCustomerBalanceService.java // Ensures sufficient balance
    │   ├── CalculationsForShippableProducts.java // Shipping cost calculator
    │   ├── PrintCheckoutReceipt.java   // Displays receipt
    │   └── PrintShipmentNotice.java    // Displays shipping notice
```
