# Supply Chain Management System

A simple Java-based Supply Chain Management System that demonstrates how products move from suppliers to warehouses and customers through orders and shipments.

This project models core supply chain entities such as products, suppliers, warehouses, orders, and shipments using object-oriented programming principles.

---

## 📦 Features:

* Product inventory management
* Supplier product catalog
* Warehouse stock tracking
* Order processing with stock validation
* Shipment handling
* Console-based inventory display

---

## 🧱 Project Structure:

The application consists of the following classes:

### 1. Product

Represents an item stored and sold in the supply chain.

**Fields**

* `id` — Unique product identifier
* `name` — Product name
* `quantity` — Available stock

**Key Methods**

* `getId()` — Returns product ID
* `getName()` — Returns product name
* `getQuantity()` — Returns available stock
* `setQuantity(int quantity)` — Updates stock quantity

---

### 2. Supplier

Represents a supplier who provides products.

**Fields**

* `supplierName` — Name of supplier
* `suppliedProducts` — List of products supplied

**Key Methods**

* `addProduct(Product product)` — Adds a product to supplier catalog
* `getSuppliedProducts()` — Returns supplied products list
* `getSupplierName()` — Returns supplier name

---

### 3. Warehouse

Stores and manages product inventory.

**Fields**

* `inventory` — Map of product ID → Product

**Key Methods**

* `addProduct(Product product)` — Adds product to inventory
* `updateStock(int productId, int quantity)` — Increases stock
* `displayInventory()` — Prints inventory list
* `getProduct(int id)` — Fetches product by ID

---

### 4. Order

Represents a customer order.

**Fields**

* `orderId` — Unique order identifier
* `product` — Product being ordered
* `quantity` — Quantity requested

**Key Methods**

* `processOrder(Warehouse warehouse)`

  * Checks stock availability
  * Deducts quantity if sufficient
  * Prints order status

---

### 5. Shipment

Handles shipping of processed orders.

**Fields**

* `shipmentId` — Unique shipment identifier
* `destination` — Delivery location

**Key Methods**

* `shipOrder()` — Prints shipment confirmation

---

### 6. SupplyChainApp (Main Class)

Entry point of the application.

**Responsibilities**

* Creates supplier and products
* Adds products to warehouse
* Displays inventory
* Processes an order
* Ships the order
* Displays updated inventory

---

## ▶️ How It Works?

1. A supplier is created
2. Products are created and assigned to the supplier
3. Products are stocked in the warehouse
4. Inventory is displayed
5. A customer order is placed
6. Warehouse validates stock and processes order
7. Shipment is created and dispatched
8. Updated inventory is displayed

---

## 🖥️ Sample Output:

```
Warehouse Inventory:
Laptop : 50
Phone : 100

Order processed successfully
Shipment ID: 5001 shipped to Mumbai

Inventory After Order:
Laptop : 45
Phone : 100
```

---

## 🛠️ Requirements:

* Java 8 or higher
* Any Java IDE (IntelliJ IDEA, Eclipse, VS Code) or terminal

---

## 🚀 How to Run?

### Compile

```
javac *.java
```

### Run

```
java SupplyChainApp
```

---

## 🎯 Concepts Demonstrated:

* Object-Oriented Programming (OOP)
* Encapsulation
* Class relationships
* Collections (List, Map)
* Basic inventory logic

---

## 📌 Possible Enhancements:

* Add database integration
* Implement user interface (GUI/Web)
* Add order history tracking
* Support multiple warehouses
* Add product pricing and billing
* Implement shipment tracking status

---

## 🔥Author:

[**Bhavisha Ghatwal**](https://github.com/BhavishaGhatwal-10/Chain-Management))
