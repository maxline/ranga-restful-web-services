# Udemy Ranga - microservices-with-spring-boot-and-spring-cloud
## Section 3: Restful web services with Spring Boot and Spring Cloud 
From the course Master Microservice with Spring Boot and Spring Cloud  
https://globallogic.udemy.com/course/microservices-with-spring-boot-and-spring-cloud/learn/lecture/32398358#content

Step 04 (20). What's happening in the background
- Front Controller pattern: Mapping servlets: dispatcherServlet urls=[/], h2Console urls=[/h2-console/*]
- Generate JSON: ResController = Controller + Response body (JacksonHttpMessageConvertersConfiguration)
- ErrorMvcAutoConfiguration (`<h1>Whitelabel Error Page</h1>`)