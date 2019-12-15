# Microservice-spring

Add config files (with service name)
```
/home/ghoul/cloud-conf
├── application.properties
├── company-service.properties
└── eureka-service.properties
```
## Service Company
Package Dependencies
 - Config Client
 - Eureka Discovery
 - Lombok
 - Actuator
 - JPA
 - H2
 - Web
 - Rest repository
#

 ## Service Registry
Package Dependencies
 - Eureka Server
 - Config Client
  
#
 ## Service Config
Package Dependencies
 - Config Server
 #

 ## Service Proxy
Package Dependencies
 - Zuul
 - Config Client