This is a simple prototype of an **E-commerce platform** built using **Java**. It simulates key features of an online store, including product listings, user roles (Admin and Customer), shopping cart management, and order processing. The project also demonstrates the use of **object-oriented principles**, **inheritance**, and **Java lambdas and streams**.

## Features

- **Product Categories**: Different types of products such as Electronics, Clothing, and Grocery.
- **User Roles**: Admin and Customer roles with distinct functionalities.
- **Shopping Cart**: Customers can add products to their cart.
- **Order Processing**: Customers can place orders, and the total is calculated based on product prices, discounts, taxes, and shipping.
- **Filters and Sorting**: Use of lambdas to filter products by category and sort them by price.
- **Order Totals**: Lambda expressions are used for calculating cart totals, applying taxes, and adding shipping fees.

## Technologies Used

- **Java**: Core language used for the project.
- **Inheritance**: Used to manage different product and user types.
- **Lambdas & Streams**: Applied for filtering, sorting, and calculating totals.

## File Structure

- `src/`
  - `Product.java`: Base class for products and subclasses for specific types.
  - `Electronics.java`: Represents an electronic product.
  - `Clothing.java`: Represents a clothing product.
  - `Grocery.java`: Represents a grocery product.
  - `User.java`: Base class for users and subclasses for Customer and Admin.
  - `Customer.java`: Class for customers.
  - `Admin.java`: Class for admins.
  - `Order.java`: Manages orders and calculates totals.
  - `Utils.java`: Utility class for filtering and sorting products, calculating cart totals.
  - `ECommerceDemo.java`: Main class to demonstrate the platform functionalities.

## Setup Instructions

### Prerequisites

- Install **Java**.
- Install **IntelliJ IDEA** or any Java-compatible IDE.
