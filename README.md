# 🛒 Java E-Commerce System

This is a simple **console-based e-commerce system** built in Java, designed as part of a software engineering training challenge. It demonstrates key Object-Oriented Programming (OOP) principles such as inheritance, interfaces, abstraction, and encapsulation.

---

## 📦 Features

- Define **products** with name, price, and quantity
- Support for:
  - **Expirable products** (e.g., Cheese, Biscuits)
  - **Non-expirable products** (e.g., TV, Mobile Scratch Card)
  - **Shippable products** that provide their weight
- **Cart system** that allows:
  - Adding products in specific quantities
  - Rejecting over-quantity requests
- **Checkout process** with:
  - Subtotal calculation
  - Shipping fees based on weight
  - Balance deduction
  - Error handling for empty carts, out-of-stock items, expired items, and insufficient balance
- **Shipping service** that lists shipped items and total weight

---

## 🧠 Concepts Used

- **Interfaces** (`Shippable`)
- **Abstract Classes** (`Product`, `ExpirableProduct`)
- **Inheritance** (e.g., `Cheese extends ExpirableProduct`)
- **Polymorphism** (handling shippable and non-shippable products)
- **Encapsulation** (fields and accessors)
- **Exception Handling**

---

## 🛠️ How to Run

1. Clone or download the project.
2. Open the project in a Java IDE (e.g., NetBeans, IntelliJ, Eclipse).
3. Run the `ECommerceSystem` class.

---

## 🧪 Sample Output


![Screenshot (1429)](https://github.com/user-attachments/assets/c9324640-1e7c-4131-8a2f-c173fbfed695)
