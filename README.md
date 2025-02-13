# Spring Boot AI Agent with Gemini

This repository demonstrates a simple Spring Boot application that integrates with the Gemini AI API (or Vertex AI, depending on the specific API calls being used) to create a basic AI agent.  It provides a REST API for interacting with the AI and can be used as a starting point for building more complex AI-powered applications.

## Features

*   TBD **REST API:** Exposes endpoints for interacting with the AI agent. Currently, it includes a `/chat` endpoint for basic conversational interactions.
*   **Gemini/Vertex AI Integration:**  Uses the Google Cloud Java client libraries to communicate with the Gemini/Vertex AI API.
*   **Spring Boot:** Built using the Spring Boot framework for easy setup and deployment.
*   **Example Use Case:** Implements a simple chatbot that responds to greetings and pre-defined questions.

## Getting Started

### Prerequisites

*   Java 17 or higher
*   Maven or Gradle (for dependency management)
*   A Google Cloud Project with the Gemini API enabled (or Vertex AI, depending on the API you are using)
*   A service account with appropriate permissions to access the Gemini/Vertex AI API.  You will need to download the service account's JSON key file.

### Installation

1.  **Clone the repository:**

    ```bash
    git clone [https://github.com/prasadgaikwad/springboot-ai-gemini.git](https://www.google.com/search?q=https://github.com/prasadgaikwad/springboot-ai-gemini.git)
    cd springboot-ai-gemini
    ```

2.  **Set up authentication:**

3.  **Build the application:**

    *   **Maven:**

        ```bash
        mvn clean install
        ```

4.  **Run the application:**

    *   **Maven:**

        ```bash
        mvn spring-boot:run
        ```

### Usage
