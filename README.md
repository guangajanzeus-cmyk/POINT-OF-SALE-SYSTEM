# Terminal-Based Point of Sale (POS) Architecture

An enterprise-grade, console-driven Point of Sale (POS) system engineered completely in native Java. This project prioritizes advanced Object-Oriented Programming (OOP) design patterns and strict data encapsulation, utilizing raw Java File I/O streams for structural state persistence rather than an external database engine.

---

## Functional Capabilities

*   **Inventory Subsystem:** Implements low-level tracking, real-time quantity updates, and pricing matrices across diverse product lines.
*   **Transaction Processing Engine:** Dynamically calculates subtotals, tax adjustments, promotional discounts, and payment tenders via the console interface.
*   **Audit Logging & Invoicing:** Automatically formats, compiles, and writes structural transaction metrics directly to permanent local text files upon session settlement.
*   **Flat-File Persistence Wrapper:** Simulates database logic by reading, parsing, and writing system records using native Java stream readers and writers.
*   **Robust Exception & Input Handling:** Integrates strict console buffer validation to prevent runtime failures caused by type mismatches, empty streams, or boundary exceptions.

---

## Object-Oriented Architectural Framework

The software architecture rejects flat script designs in favor of rigid enterprise OOP standards:

*   **Encapsulation & Domain Modeling:** Implements strongly protected model schemas utilizing private fields, explicit accessors/mutators, and strict visibility scopes.
*   **Inheritance & Polymorphism:** Leverages abstract bases and structural interfaces to manage overlapping behaviors across varied stock classifications (e.g., standard vs. perishable assets).
*   **Separation of Concerns:** Strictly decouples the terminal user interface logic from core business rules and file communication layers to maximize future extensibility.

---

## Data Architecture & File I/O Mechanics

System states are managed via text-based flat files using structured schemas:

*   `inventory.txt` - Retains current stock metrics, unique identifiers, and item valuations.
*   `sales_log.txt` - Serves as an ongoing ledger recording absolute chronological transaction history.
*   `/receipts/` - A dedicated output folder where distinct, dynamically generated billing invoices are permanently archived.

---

## Execution and Compilation

### Prerequisites
*   Java Development Kit (JDK 11 or higher)
*   Command-line environment (Terminal, Command Prompt, or shell console)

### Compilation Steps
1. Clone the project locally:
   ```bash
   git clone https://github.com
   ```
2. Navigate into the application root source directory:
   ```bash
   cd src
   ```
3. Compile all native Java dependencies:
   ```bash
   javac Main.java
   ```
4. Run the compiled application layer:
   ```bash
   java Main
   ```

---

## Planned Framework Extensions
*   Implementation of user authentication matrices dividing Admin and Cashier security privileges.
*   Integration of serialized object parsing architectures to phase out plain-text flat files.
*   Custom Exception pipelines designed to handle data corruption anomalies seamlessly.
