# Cloud-Native Microservices E-Commerce Platform
**Architecture:** Modular Microservices | **Orchestration:** Docker Compose  
**Tech Stack:** Java (Spring Boot), ReactJS, Docker, MongoDB

This project is a full-stack e-commerce solution built using a **Microservices Architecture**. By decoupling business logic into independent services, the system ensures independent scaling, faster updates, and high fault tolerance.

---

## 🏗 System Architecture
The platform is divided into two main components:
*   **Backend:** Modular Spring Boot microservices designed for specific business domains.
*   **Frontend:** A modern, responsive UI built with ReactJS and Vite.
*   **Orchestration:** Managed via Docker Compose to ensure consistent environments across development and production.

---

## 🛠 Tech Stack
*   **Backend:** Java, Spring Boot (Microservices)
*   **Frontend:** ReactJS, Vite
*   **Database:** MongoDB
*   **DevOps:** Docker, Docker Compose
*   **Deployment Ready:** AWS EKS (Elastic Kubernetes Service)

---

## 🚀 Setup & Installation

### 1. Prerequisites
Ensure you have the following installed and running:
*   [Docker Desktop](https://www.docker.com/products/docker-desktop/) (Docker Engine must be active)
*   [Node.js](https://nodejs.org/) (for frontend dependencies)
*   An IDE (Optional): IntelliJ IDEA, VS Code, or STS.

### 2. Backend Orchestration (Docker)
1.  Extract the project folder.
2.  Open your Terminal or Command Prompt at the **project root** folder.
3.  Run the following command to start all microservices and databases:
    ```bash
    docker-compose up
    ```
4.  *Note: Please wait a few moments for the microservices to initialize and connect to the MongoDB containers.*

### 3. Frontend Setup
1.  Open a new terminal window and navigate to the `frontend` folder.
2.  Install the required packages:
    ```bash
    npm install
    ```
3.  Start the development server:
    ```bash
    npm run dev
    ```

### 4. Access the UI
Once the server is running, open your browser and navigate to:
👉 **[http://localhost:5173/](http://localhost:5173/)**

---

## 📁 Project Structure
```text
Microservicebasedecommorce/
├── backend/            # Spring Boot Microservice Source Code
├── frontend/           # ReactJS + Vite UI Application
├── docker-compose.yaml # Docker Orchestration script
└── README.md           # Project Documentation
