# DemoQA Application Project Tests

## Goal of the project

1. Create a framework that can run through the terminal and create
a nice HTML report
2. Practice core components of Request and Respond Testing

### prepare pom.xml file

* Which dependencies we need?
   - RestAssured
   - Cucumber-java
   - Cucumber-junit
   - Object Mapper (Jackson, GSON)
   - Reporting plugin (plugin added in CukesRunner) for report
   - (Selenium, Boni-Garcia) NO NEED
* Which plugin we need to run from terminal?
    - Maven surefire  plug-in

### API Tests:

* You have 2 important topics to comprehend this type of testing:
  - How to send our Request?
      - BaseUrl + endPoint (path params and/or query params)
      - Headers info: content type, Authorizations
      - HTTP protocol type/Request Type: GET, POST, PUT, PATCH, DELETE
      - (Request Body) depends on Request type 
  - How to read and verify Response?
      - Status code
      - (Headers & Body) depending on requirements:
         Body verificationL path, jsonPath, POJO, Java Classes, Hemcrest, Matchers
    
De-Serialization: JSON --> JAVA codes (Customs classes or Collections). In order to do that, it is required of using:
  - as() method
  - Object Mappers


## How to Run the Project? You need to install locally following:
1. Maven
2. Java JDK
3. Git.exe
4. Open the folder of the project and start terminal inside that folder
5. Run command ``mvn clean verify ``