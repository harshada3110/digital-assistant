# Digital Assistant Service Documentation

## Overview
The Digital Assistant Service is a RESTful API designed to allow users to define digital assistants with custom names and responses, and to send messages to these assistants to receive predefined responses. The service provides two main endpoints: one for defining assistants (/define_assistant) and another for sending messages to assistants (/send_message).

## Endpoints
### 1. Define Assistant Endpoint
- URL: ‘http://localhost:8000/define_assistant’
- Method: POST
- Description: Allows users to define a digital assistant with a custom name and response.

- Request Parameters:\
name (String): The name of the assistant.
response (String): The response string associated with the assistant.

- Response:\
Returns a success message upon successfully defining the assistant.

### 2. Send Message Endpoint
- URL: ‘http://localhost:8000/send_message/{name}’
- Method: POST
- Description: Allows users to send a message to a named assistant and receive the predefined response.

- Path Parameter:\
name (String): The name of the assistant to which the message is sent.

- Request Parameters:\
message (String): The message sent to the assistant.

- Response:\ 
Returns the predefined response associated with the named assistant, or an error message if the assistant is not found.


## Technologies Used
- **Spring Boot**: Framework for building the application.
- **Spring Data JPA**: Data access and persistence.
- **MySQL Database**: Database system for storing assistant data.

## Setup Instructions
1. Clone the repository from GitHub or extract project from the zip.
2. Navigate to the project directory.
3. Update the Configuration File: Open your application.properties file and replace the placeholder with your actual database name.
4. Verify Database Connection: Ensure that the database your_database_name exists in your MySQL server. 
5. Run the Spring Boot application.
6. Access the endpoints using an HTTP client like Postman.

## MySQL Commands
To create the database and verify the connection, following are the MySQL commands:

1. Login to MySQL:\
mysql -u root -p

2. Create the Database:\
CREATE DATABASE your_database_name;

3. Select the Database:\
USE your_database_name;

4. Verify Tables (after running your application):\
SHOW TABLES;

