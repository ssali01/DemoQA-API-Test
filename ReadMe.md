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
    