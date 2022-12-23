package com.demoqa.step_defs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.junit.Assert.*;

public class GetAllBooks_Steps {

    Response response;
    @When("User sends GET request to receive all books information")
    public void user_sends_get_request_to_receive_all_books_information() {
        response = RestAssured.given().accept(ContentType.JSON)
                .when().get("/BookStore/v1/Books");

      //  response.prettyPrint();
    }
    @Then("Verifies that application returns {int} results")
    public void verifies_that_application_returns_results(int expectedBookQty) {

        // jsonPath() method:
        JsonPath jsonPath = response.jsonPath();
        List<Object> books = jsonPath.getList("books");
        System.out.println("books.size() = " + books.size());
        assertEquals(expectedBookQty, books.size());

        // collections
        // if I want to get first level of information from Response, I need a Map,
        // It is in String and Object format
        Map<String, Object> responseMap = response.as(Map.class); // De-Serialization: First-level of info
//        System.out.println("responseMap = " + responseMap);
        List<Map<String, Object>> booksList = (List<Map<String, Object>>) responseMap.get("books");
        System.out.println("booksList.size() = " + booksList.size());
        assertEquals(expectedBookQty, booksList.size());
    }
}
