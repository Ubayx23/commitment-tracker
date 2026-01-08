# Commitment Tracker

- Allows a user to create a tasks and commit to it if the task isnt finished within the time frame, user must acknowledge consequences before moving on.

- Raises the question, how do we store values in java
- Through a data base with Entity

        - We need a unique Id for each user
        - A string for title of task
        - A time to check for the timer for the task

- Why use SpringBoot
        - Spring Boot is a configuration network, allows Java to run with less config files.
        - In short terms a boiler plate for Java.

- The project in simple terms allows a user to:
- Create task
- Set title and description
- Set time the task should be done by
- If task not done by specified time
- Send message to user to acknowledge they didnt finish task
- Repeat if wanted

## File Structure

- Define the database configuration in the application.properties file

- Need a file called Commitment.java
- Will store the database
- Such as Id
- Title
- Description
- Time

- Another file for repository interface
- This will allow the user to perform a set of methods such as:
- Create task
- Delete task
- Update task

- Another file for repository in the service layer
- This is responsible for interacting with the database

- We use the service layer in the controller
- This is responsible for handling requests
- Calling appropiate service methods
- Returning response
