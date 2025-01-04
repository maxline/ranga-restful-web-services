package com.in28minutes.microservices.limitsservice.controller;

public class SystemPropertiesDemoApp {
    public static void main(String[] args) {
        // Example of getting list of system properties that can be used at application.properties
        System.getProperties().list(System.out);

//        java.specification.version=19
//        java.class.path=/Users/...
//        java.vm.vendor=Oracle Corporation
//        os.name=Mac OS X
//        user.country=US
//        user.home=/Users...
//        user.dir=/Users...
//        user.language=en
//        java.home=/Users/...
//        file.separator=/
//        line.separator=

        // ${user.dir} is used at application.properties

        // useful links for working with spring properties
        // https://docs.spring.io/spring-boot/appendix/application-properties/index.html
        // https://www.baeldung.com/spring-boot-properties-env-variables
        // http://localhost:8080/actuator/env

    }
}
