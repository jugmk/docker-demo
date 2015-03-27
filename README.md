# Spring Boot Demo application

Demo application for the tech presentation from 25.03.2015 at Broz Cafe.

## How to try this demo?

### Prerequisites

1. Java 8 JDK
2. Maven (at least 3.0.5)
3. Docker

### Build the application

> `mvn -P prod -Dmaven.test.skip=true`

### Dockerize the application

#### Step 1

Build the docker image with the application

`
FROM java:8
COPY demo-prod.jar /apps/spring_app/
WORKDIR /apps/spring_app
EXPOSE 8080
CMD ["java", "-jar", "demo-prod.jar"]
`
