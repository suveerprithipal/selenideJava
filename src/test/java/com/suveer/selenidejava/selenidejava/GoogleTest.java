package com.suveer.selenidejava.selenidejava;

import org.junit.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created for demo on 9/12/17.
 *
 * @author Suveer Prithipal
 */

public class GoogleTest {
  @Test
  public void googlePageTest(){
    /**
      No need to create a webdriver instance!

      Selenide provides with easy to use API's that provide rich functionality.
      On a normal day with selenium, we would need to create a webdriver instance, and bind it to a browser.
      We would also need to define page elements to use them.

      Selenide removes the need to do this by wrapping up that into a singe API.
      Below, we use "open" to create the webdriver instance, and bind it to a class.

      Passing it a class, provides the shape for the instance, giving it methods and defined functionality.
     */
    GooglePage googlePage = open("http://www.google.com",GooglePage.class);


    /**
      Now that we have an instance of webdriver up and we are on our test app, Google.
      We can then search something.
      Searching for something means it will return a result.
      Therefore, we need a class to take the shape of these results.
     */
    SearchResultsPage searchResultsPage = googlePage.searchGoogle("selenide");


    /**
    Tests.
    Now that we have results, we can perform tests.
    Below, we use the searchResultsPage and query the class for expected results.

     */
    searchResultsPage.checkResultsSize(8);
    searchResultsPage.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));


    /**

    Use page object models and design patterns
    This example is to demo the ease of use with Selenide.
    Its important to separate out your implementation for better maintenance, easy of reading and debugging.
     */
  }

}
