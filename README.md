Instructions
============

* Start webapp: 
    
    mvn jetty:run-war

* Compile and package war
    
    mvn package

* war file is then in target/*.war

* After starting webapp, you can access the REST service under http://localhost:8080/easyRest/service/hello.txt or http://localhost:8080/easyRest/service/hello.json, depending on what format you need.
