# 🏦 ATM Simulation – Java Project

This project is a **Java-based ATM (Automated Teller Machine) Simulation**, built to demonstrate **OOP concepts, input validation, and basic banking operations**.  

It simulates real-world ATM functionality such as **PIN verification, OTP login, deposits, withdrawals, and balance inquiry**.

---

## 🚀 Features

- **Login Authentication**
  - PIN validation (default: `1234`)  
  - Maximum 3 attempts allowed  
  - OTP login option if PIN fails  
  - Card block message if all attempts fail  

- **Banking Operations**
  - **Deposit**: Add money to your savings account  
  - **Withdraw**: Withdraw money ensuring minimum balance (`₹500`)  
  - **Balance Inquiry**: Check available account balance  

- **Error Handling**
  - Invalid input detection  
  - Ensures withdrawal cannot breach minimum balance  
  - Prevents invalid deposit/withdraw amounts  

---

## 🛠️ Technologies Used

- **Language**: Java  
- **Concepts**: OOP (Classes, Methods, Encapsulation), Loops, Conditionals  
- **Utilities**: `Scanner`, `Random`, `Thread.sleep` for server simulation  

---

## 📂 Project Structure
```
ATM_Simulation-JAVA-/
│── src/
│ └── project1_ATM/
│ ├── ATM.java # Main ATM logic (Login + Menu)
│ ├── BankServer.java # Handles PIN validation & OTP generation
│ └── Transaction.java # Deposit, Withdraw & Balance functions
│── bin/ # Compiled .class files
│── .classpath # Eclipse classpath file
│── .project # Eclipse project configuration
│── README.md # Project documentation
```
---
