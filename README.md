

---

# 🧪 UI Web Testing – Grocery Store App (Katalon)

## 📌 Overview

This project contains **UI automation testing** for the Grocery Store web application using **Katalon Studio**.

The goal is to validate:

* Core user flows (auth, product, cart, order)
* UI functionality and interaction
* End-to-end behavior from user perspective

---

## 🚀 Tech Stack

* **Katalon Studio**
* **Groovy (Script Mode)**
* **Web UI Automation (Selenium-based)**

---

## 🌐 Application Under Test

```bash
https://grocery-store-app-seven.vercel.app
```

---

## 🧪 Test Coverage

### 🔹 1. Authentication Flow

* Register new user (dynamic email)
* Generate token
* Save token

---

### 🔹 2. Product Flow

* View product list
* Filter by category
* View product detail

---

### 🔹 3. Cart Flow

* Create cart
* Add product to cart
* Update quantity

---

### 🔹 4. Order Flow

* Create order
* View order detail
* Edit order
* Delete order

---

## 🔄 Test Flow Example

```text
Open Browser → Navigate → Register → Get Token
→ Save Token → Browse Product → Add to Cart
→ Create Order → Edit → Delete
```

---

## ⚙️ Key Implementation

* ✅ Dynamic test data (random email using timestamp)
* ✅ Element-based interaction (click, input, select)
* ✅ End-to-end UI flow automation
* ✅ Organized Object Repository (page-based structure)

---

## ▶️ How to Run

1. Open project in **Katalon Studio**
2. Go to:

   ```
   Test Cases → TC_UI_Testing
   ```
3. Click **Run ▶️ (Chrome)**

---

## 📊 Sample Result

```text
Test Case: TC_UI_Testing
Status: PASSED
Steps: 30+
Duration: ~20–30 seconds
```

---

## 🧠 Key Insights

* UI automation validates real user behavior
* Dynamic data prevents duplicate errors (e.g., email registration)
* End-to-end flow ensures system integration works correctly

---

## 👤 Author

**Safah**
QA Engineer (Aspiring)

---
