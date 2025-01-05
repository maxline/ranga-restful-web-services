# Udemy Ranga - microservices-with-spring-boot-and-spring-cloud
From the course Master Microservice with Spring Boot and Spring Cloud  
https://globallogic.udemy.com/course/microservices-with-spring-boot-and-spring-cloud/learn/lecture/32398358#content

Table of content<br>
- [Section 3: Restful web services](#section-3-restful-web-services-with-spring-boot-and-spring-cloud)
- [Section 5: Microservices with Spring Cloud](#section-5-microservices-with-spring-cloud)

## Section 5: Microservices with Spring Cloud

### Step 16 (98). Creating a service for currency conversion

### Step 14 (95). Creating a JPA repository

### Step 13 (92). Configure JPA, initialization H2 database
- http://localhost:8000/h2-console/

### Step 11 (90). Create a simple currency exchange service
- VM options -Dserver.port=8001 overrides application.properties server.port=8000
- http://localhost:8000/currency-exchange/from/USD/to/INR
- http://localhost:8001/currency-exchange/from/USD/to/INR

### Step 08 (85). Configuring profiles for limits service to the spring cloud server
- spring.cloud.config.profile=qa
- The following 1 profile is active: "qa"
- http://localhost:8080/limits shows values for "qa" profile

### Step 07 (83). Connect limits service to the spring cloud server
- spring.cloud.config.server.git.uri=file://${user.dir}/git-localconfig-repo

### Step 04 (78). Setting up Limits microservice
- Ports standardization: see the [standardization_ports.md](/standardization_ports.md) 

### Step 01-03 (74-77). Setting up Limits microservice
- http://localhost:8080/limits
- get configuration from application.properties

## Section 3: Restful web services with Spring Boot and Spring Cloud 

### Step 36-37 (62-63). Security intro
- Console: Using generated security password: 2f9f3c27-f53e-4f67-8358-fc9562171e1e

- SecurityFilterChain   // CSRF -> POST, PUT;
```
http.csrf().disable();
```

### Step 35 (61). MySQL with Docker
$ docker run --detach
--env MYSQL_ROOT_PASSWORD=root
--env MYSQL_USER=social-media-user
--env MYSQL_PASSWORD=root
--env MYSQL_DATABASE=social-media-database
--name mysql
--publish 3306:3306
mysql:8-oracle

### Step 32 (55). Implement Api for getting and creating a posts

### Step 30 (53). Create Post entity with many to one relationship with User entity

### Step 29 (52). Enhancing REST API connect to H2 by using JPA

### Step 28 (51). Creating user entity
- @Entity, @Id, @GeneratedValue
- spring.datasource.url=jdbc:h2:mem:testdb
- spring.jpa.defer-datasource-initialization=true
- data.sql

### Step 26 (47). HAL
http://localhost:8080/explorer/index.html#

### Step 25 (46). Spring Boot Actuator
- http://localhost:8080/actuator
- http://localhost:8080/actuator/health
- management.endpoints.web.exposure.include=*
- http://localhost:8080/actuator/beans
- http://localhost:8080/actuator/metrics

### Step 23-24 (44-45). Filtering
- Static: @JsonIgnore, @JsonIgnoreProperty - bean annotation
- Dynamic: MappingJacksonValue, SimpleBeanPropertyFilter, SimpleFilterProvider(), mappingJacksonValue.setFilters(filters);

### Step 22 (43). Hateoas
- "_links": "all-users"

### Step 20-21 (41-42). Versioning
- URI: http://localhost:8080/v2/person
- Parameters: http://localhost:8080/person?version=1
- Headers: "/person/header", headers = "X-API-VERSION=2"
- Media type: "/person/accept", produces = "application/vnd.company.app-v2+json"

### Step 19 (39). Internationalization
- messages.properties, MessageSource
- Accept-Language=fr

### Step 18 (38). Content negotiation
- pom.xml `<artifactId>jackson-dataformat-xml</artifactId>`
- Accept header (MIME types - application/xml or application/json, 2 different representation of the response)

### Step 17 (37). Swagger documentation (Open Api)
- http://localhost:8080/swagger-ui/index.html

### Step 14 (33). Add validation
- @Valid, @Size, @Past
- handleMethodArgumentNotValid()
- ex.getFieldError().getDefaultMessage()

### Step 12 (31).
- Code Changes for the Step - https://github.com/in28minutes/spring-microservices-v3/blob/main/02.restful-web-services/01-step-by-step-changes/v2.md#step-12
- ResponseEntityExceptionHandler::handleException()

### Step 11 (29). Add error handling.<br>
- @ResponseStatus(code = HttpStatus.NOT_FOUND)
- UserNotFoundException

### Step 10 (27). Add response status and location

### Step 08 (25). Social Media Application (users and posts)<br>
https://github.com/in28minutes/spring-microservices-v3/blob/main/02.restful-web-services/01-step-by-step-changes/v2.md#step-08

- GET http://localhost:8080/users
- GET http://localhost:8080/users/3
- POST http://localhost:8080/users

Talend Api Tester

### Step 04 (20). What's happening in the background
- Front Controller pattern: Mapping servlets: dispatcherServlet urls=[/], h2Console urls=[/h2-console/*]
- Generate JSON: ResController = Controller + Response body (JacksonHttpMessageConvertersConfiguration)
- ErrorMvcAutoConfiguration (`<h1>Whitelabel Error Page</h1>`)
