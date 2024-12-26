# Udemy Ranga - microservices-with-spring-boot-and-spring-cloud
## Section 3: Restful web services with Spring Boot and Spring Cloud 
From the course Master Microservice with Spring Boot and Spring Cloud  
https://globallogic.udemy.com/course/microservices-with-spring-boot-and-spring-cloud/learn/lecture/32398358#content

## Step 04 (20). What's happening in the background
- Front Controller pattern: Mapping servlets: dispatcherServlet urls=[/], h2Console urls=[/h2-console/*]
- Generate JSON: ResController = Controller + Response body (JacksonHttpMessageConvertersConfiguration)
- ErrorMvcAutoConfiguration (`<h1>Whitelabel Error Page</h1>`)

## Step 08 (25). Social Media Application (users and posts)<br>
https://github.com/in28minutes/spring-microservices-v3/blob/main/02.restful-web-services/01-step-by-step-changes/v2.md#step-08

- GET http://localhost:8080/users
- GET http://localhost:8080/users/3
- POST http://localhost:8080/users

Talend Api Tester

## Step 10 (27). Add response status and location

## Step 11 (29). Add error handling.<br>
- @ResponseStatus(code = HttpStatus.NOT_FOUND)
- UserNotFoundException

## Step 12 (31).
- Code Changes for the Step - https://github.com/in28minutes/spring-microservices-v3/blob/main/02.restful-web-services/01-step-by-step-changes/v2.md#step-12
- ResponseEntityExceptionHandler::handleException()

## Step 14 (33). Add validation
- @Valid, @Size, @Past
- handleMethodArgumentNotValid()
- ex.getFieldError().getDefaultMessage()

## Step 17 (37). Swagger documentation (Open Api)
- http://localhost:8080/swagger-ui/index.html

## Step 18 (38). Content negotiation
- pom.xml `<artifactId>jackson-dataformat-xml</artifactId>`
- Accept header (MIME types - application/xml or application/json, 2 different representation of the response)

## Step 19 (39). Internationalization
- messages.properties, MessageSource
- Accept-Language=fr

## Step 20-21 (41-42). Versioning
- URI: http://localhost:8080/v2/person
- Parameters: http://localhost:8080/person?version=1
- Headers: "/person/header", headers = "X-API-VERSION=2"
- Media type: "/person/accept", produces = "application/vnd.company.app-v2+json"

## Step 22 (43). Hateoas
- "_links": "all-users"

## Step 23-24 (44-45). Filtering
- Static: @JsonIgnore, @JsonIgnoreProperty - bean annotation
- Dynamic: MappingJacksonValue, SimpleBeanPropertyFilter, SimpleFilterProvider(), mappingJacksonValue.setFilters(filters);

## Step 25 (46). Spring Boot Actuator
- http://localhost:8080/actuator
- http://localhost:8080/actuator/health
- management.endpoints.web.exposure.include=*
- http://localhost:8080/actuator/beans
- http://localhost:8080/actuator/metrics

## Step 26 (47). HAL
http://localhost:8080/explorer/index.html#

## Step 28 (51). Creating user entity
- @Entity, @Id, @GeneratedValue
- spring.datasource.url=jdbc:h2:mem:testdb
- spring.jpa.defer-datasource-initialization=true
- data.sql

## Step 29 (52). Enhancing REST API connect to H2 by using JPA

## Step 30 (53). Create Post entity with many to one relationship with User entity

## Step 32 (55). Implement Api for getting and creating a posts 

## Step 35 (61). MySQL with Docker
$ docker run --detach 
--env MYSQL_ROOT_PASSWORD=root 
--env MYSQL_USER=social-media-user 
--env MYSQL_PASSWORD=root 
--env MYSQL_DATABASE=social-media-database 
--name mysql 
--publish 3306:3306 
mysql:8-oracle

$ docker ps -a
% docker container ls      

Useful SQL commands
- see at mysql.doc.md
