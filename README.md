# Chat Application Using WebSocket

This is a simple Chat Application built using Spring Boot as the backend and React as the frontend.
The application utilizes WebSocket for full duplex communication and Apache Kafka for message distribution. 
Users can log in with their names and send messages, which are then stored in Kafka and distributed to all consumers. 
WebSocket is used to display real-time updates to the users. 

## Technologies Used
  # Backend
- Spring Boot
- WebSocket
- Apache Kafka
- # Frontend
- React
- Axios
- Material-UI
- SocketJS

## Getting Started

To run the Chat Application, please follow the instructions below:

### Prerequisites

- Java Development Kit (JDK 1.8 min.)
- Node.js
- Apache Kafka

### Backend Setup

1. Clone the repository to your local machine.
2. Open the backend folder in an IDE of your choice.
3. Configure the Kafka server settings in the `application.properties` file.
4. Start the kafka broker.
5. Build and run the Spring Boot application.

```shell
$ cd backend
$ ./mvnw spring-boot:run
```

### Frontend Setup

1. Open the frontend folder in a code editor.
2. Install the project dependencies.

```shell
$ cd frontend
$ npm install
```

3. Configure the WebSocket endpoint in the `src/config.js` file.
4. Start the React development server.

```shell
$ npm start
```

5. Open your browser and navigate to `http://localhost:3000` to access the Chat Application.

## Architecture Overview

The Chat Application follows a client-server architecture with WebSocket and Apache Kafka as key components.

1. Users log in to the frontend application using their names.
2. When a user sends a message, it is sent to the Spring Boot backend application via an HTTP request.
3. The backend application stores the message in Kafka for distribution.
4. Kafka distributes the message to all consumers subscribed to the appropriate topic.
5. The backend application also sends the message to the WebSocket endpoint for real-time updates.
6. The frontend application receives the message from the WebSocket and displays it to the user.

## Dependencies

- **Spring Boot**: Framework for building Java applications.
- **React**: JavaScript library for building user interfaces.
- **WebSocket**: Provides real-time, bidirectional communication between client and server.
- **Apache Kafka**: Distributed event streaming platform.
- **Axios**: Promise-based HTTP client for the browser and Node.js.
- **Material-UI**: React component library for building UIs with a Material Design look and feel.
- **SocketJS**: WebSocket library for enabling real-time communication.

## Contributing

If you'd like to contribute to the Chat Application, please fork the repository and create a new branch. 
You can then submit a pull request with your changes, and they will be reviewed.

## Acknowledgements

- [Spring Boot](https://spring.io/projects/spring-boot)
- [React](https://reactjs.org/)
- [WebSocket](https://developer.mozilla.org/en-US/docs/Web/API/WebSocket)
- [Apache Kafka](https://kafka.apache.org/)
- [Axios](https://axios-http.com/)
- [Material-UI](https://material-ui.com/)
- [SocketJS](https://socket.io/)

## Demo link
   https://drive.google.com/file/d/1MbX-wEdt-5y9lE8YBZgqTCgMHq_t3q23/view?usp=sharing 

  
