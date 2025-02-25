# Spring Boot AI Agent with Gemini

This repository demonstrates a simple Spring Boot application that integrates with the Gemini AI API (or Vertex AI, depending on the specific API calls being used) to create a basic AI agent. It provides a REST API for interacting with the AI and can be used as a starting point for building more complex AI-powered applications.

## Features

*   **REST API:** Exposes endpoints for interacting with the AI agent. Currently, it includes a `/summarize` endpoint for generating text summaries.
*   **Gemini/Vertex AI Integration:** Uses the Google Cloud Java client libraries to communicate with the Gemini/Vertex AI API.
*   **Spring Boot:** Built using the Spring Boot framework for easy setup and deployment.
*   **Example Use Case:** Implements a simple summarization service for generating concise summaries from input text.

## Getting Started

### Prerequisites

*   Java 17 or higher
*   Maven or Gradle (for dependency management)
*   A Google Cloud Project with the Gemini API enabled (or Vertex AI, depending on the API you are using)
*   A service account with appropriate permissions to access the Gemini/Vertex AI API. You will need to download the service account's JSON key file.

### Installation

1.  **Clone the repository:**

    ```bash
    git clone https://github.com/prasadgaikwad/springboot-ai-gemini.git
    cd springboot-ai-gemini
    ```

2.  **Set up authentication:**

    - Place your service account's JSON key file in a secure location on your machine.
    - Set the `GOOGLE_APPLICATION_CREDENTIALS` environment variable to the path of the JSON key file:

    ```bash
    export GOOGLE_APPLICATION_CREDENTIALS="/path/to/your/keyfile.json"
    ```

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

#### Summarization API

The application provides an endpoint to generate summaries from input text:

- **Endpoint:** `/summarize`
- **Method:** `POST`

Example usage:

```bash
POST /summarize
Content-Type: application/json
```

**Request Body:**
```json
{
  "text": "Artificial intelligence is a branch of computer science that aims to create machines that can perform tasks that would typically require human intelligence."
}
```

**Response Body:**
```json
{
  "summary": "AI develops machines capable of performing human-like tasks."
}
```

To test this endpoint, use tools such as [Postman](https://www.postman.com/) or `curl`:

```bash
curl -X POST \
     -H "Content-Type: application/json" \
     -d '{"text": "Your large text to summarize"}' \
     http://localhost:8080/summarize
```

### Configuration

Update the application properties in `src/main/resources/application.properties` to configure API usage, such as enabling Gemini/Vertex AI and setting custom parameters.