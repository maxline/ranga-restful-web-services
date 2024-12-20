# Udemy Ranga - microservices-with-spring-boot-and-spring-cloud
## Section 3: Restful web services with Spring Boot and Spring Cloud 
From the course Master Microservice with Spring Boot and Spring Cloud  
https://globallogic.udemy.com/course/microservices-with-spring-boot-and-spring-cloud/learn/lecture/32398358#content

Step 04 (20). What's happening in the background
- Front Controller pattern: Mapping servlets: dispatcherServlet urls=[/], h2Console urls=[/h2-console/*]
- Generate JSON: ResController = Controller + Response body (JacksonHttpMessageConvertersConfiguration)
- ErrorMvcAutoConfiguration (`<h1>Whitelabel Error Page</h1>`)

Step 08 (25). Social Media Application (users and posts)<br>
https://github.com/in28minutes/spring-microservices-v3/blob/main/02.restful-web-services/01-step-by-step-changes/v2.md#step-08

- GET http://localhost:8080/users
- GET http://localhost:8080/users/3
- POST http://localhost:8080/users

Talent Api Tester

Step 10 (27). Add response status and location<br>
Step 11 (29). Add error handling.<br>
@ResponseStatus(code = HttpStatus.NOT_FOUND)
UserNotFoundException

Step 12. (31)
Code Changes for the Step - https://github.com/in28minutes/spring-microservices-v3/blob/main/02.restful-web-services/01-step-by-step-changes/v2.md#step-12
ResponseEntityExceptionHandler::handleException()

