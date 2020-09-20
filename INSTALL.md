Java JRE: https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html#license-lightbox
PostgreSQL11: http://www.enterprisedb.com/postgresql-tutorial-resources-training?cid=55
Node.js: https://nodejs.org/dist/v12.18.4/node-v12.18.4-x64.msi

Angular Cli: npm install -g @angular/cli
Angular Material: ng add @angular/material

Deployment with Spring Boot Jar Packaging

In this case we will be packaging the angular project as a jar. So no changes reqired in the client pom file.Also, we do not require to configure any maven plugin in the server pom file. Remove all the build configuration except spring-boot-maven-plugin. Don't forget to add client project jar dependency in the server pm file. So, now when we build our project the jar will be included in the META-INF/resources directory and Spring Boot is preconfigured to serve static content from this resources folder. One thing you require to change is in the build parameter of package.json.

"build": "ng build -prod –output-path META-INF/resources"

ng serve --open