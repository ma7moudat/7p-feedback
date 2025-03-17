# Task: User Feedback System

## Context

You're building a simple user feedback system where users can submit feedback, view existing feedback, and mark feedback as "helpful." The system consists of a backend API and a Vue frontend that interacts with it.

## Provided Template

As a starting point, you are provided with a bare-bones SpringBoot Java application to create the REST API.

The `frontend` directory contains the basic Vue/TypeScript application structure for the frontend.

Feel free to add any dependencies you see fit to both the backend and the frontend.

## Time Constraint

You have **45 minutes** to implement the requirements. 

Stay calm and relaxed. You are not expected to complete all the requirements in the given time. More importantly, 
you should demonstrate your logical thinking and problem-solving skills.

## Requirements

### Backend (Java, Spring Boot)
* Implement a REST API with the following endpoints:
  * `POST /feedback` → Submits a new feedback entry.
  * `GET /feedback` → Retrieves all feedback entries.
  * `PUT /feedback/{id}/helpful` → Marks a feedback entry as "helpful."
* A feedback entry consists of:
  * `id` (auto-generated UUID)
  * `message` (string, required)
  * `author` (string, optional)
  * `helpfulCount` (integer, starts at 0)
* Store feedback entries (e.g. in memory using a list or H2 database).

### Frontend (Vue 3, Composition API, TypeScript)
* Expand the existing Vue application with:
  * A **form** where users can submit feedback.
  * A **list** of submitted feedback, showing the message, author, and how many times it was marked as helpful.
  * A **button** on each feedback entry to mark it as helpful.
* The frontend should:
  * Communicate with the backend.
  * Use Vue state management (or ref/reactive) to update the UI.
  * Show basic validation for form input.
  
## Evaluation Criteria
* **Backend:**
  * RESTful API design and correct HTTP methods.
  * Clean code structure and proper use of Java/Kotlin best practices.
  * Good use of services, controllers, and DTOs.
* **Frontend:**
  * Clear component structure.
  * API interaction using Axios.
  * Proper event handling and reactivity.
* **Bonus Points:**
  * UI updates optimistically when marking feedback as helpful.
  * Simple styling for a clean UX.
  * Error handling (e.g., show messages on API failures).
