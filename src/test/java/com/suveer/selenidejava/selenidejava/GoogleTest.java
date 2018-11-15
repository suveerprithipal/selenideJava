package com.suveer.selenidejava.selenidejava;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created for demo on 9/12/17.
 *
 * @author Suveer Prithipal
 */


public class GoogleTest {

 private static RemoteWebDriver driver;


  @Before
  public void setup() throws MalformedURLException {

    DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
      desiredCapabilities.setCapability("--no-sandbox",true);
//    desiredCapabilities.setCapability("--disable-dev-shm-usage",true);
    desiredCapabilities.setCapability("--headless",true);
    desiredCapabilities.setPlatform(Platform.LINUX);
    driver = new RemoteWebDriver(new URL("http://10.11.13.237:4444/wd/hub/"), desiredCapabilities);
    WebDriverRunner.setWebDriver(driver);

  }

  @After
  public void teardown() {
    if (driver != null) {
      driver.quit();

    }
  }


    @Test
    public void xpathTest(){
        GooglePage googlePage = open("http://www.google.com",GooglePage.class);
        SearchResultsPage searchResultsPage = googlePage.searchiesGoogle("Selenide");

    }
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
    try {
      searchResultsPage.checkResultsSize(7);
      searchResultsPage.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
    }
    catch (Exception e){
      System.out.print(e);
    }


    /**

    Use page object models and design patterns
    This example is to demo the ease of use with Selenide.
    Its important to separate out your implementation for better maintenance, easy of reading and debugging.
     */
  }
    @Test
    public void googlePageTest1(){
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
        try {
            searchResultsPage.checkResultsSize(7);
            searchResultsPage.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
        }
        catch (Exception e){
            System.out.print(e);
        }


        /**

         Use page object models and design patterns
         This example is to demo the ease of use with Selenide.
         Its important to separate out your implementation for better maintenance, easy of reading and debugging.
         */
    }
    @Test
    public void googlePageTest2(){
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
        try {
            searchResultsPage.checkResultsSize(7);
            searchResultsPage.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
        }
        catch (Exception e){
            System.out.print(e);
        }


        /**

         Use page object models and design patterns
         This example is to demo the ease of use with Selenide.
         Its important to separate out your implementation for better maintenance, easy of reading and debugging.
         */
    }
    @Test
    public void googlePageTest3(){
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
        try {
            searchResultsPage.checkResultsSize(7);
            searchResultsPage.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
        }
        catch (Exception e){
            System.out.print(e);
        }


        /**

         Use page object models and design patterns
         This example is to demo the ease of use with Selenide.
         Its important to separate out your implementation for better maintenance, easy of reading and debugging.
         */
    }
    @Test
    public void googlePageTest4(){
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
        try {
            searchResultsPage.checkResultsSize(7);
            searchResultsPage.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
        }
        catch (Exception e){
            System.out.print(e);
        }


        /**

         Use page object models and design patterns
         This example is to demo the ease of use with Selenide.
         Its important to separate out your implementation for better maintenance, easy of reading and debugging.
         */
    }
    @Test
    public void googlePageTest5(){
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
        try {
            searchResultsPage.checkResultsSize(7);
            searchResultsPage.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
        }
        catch (Exception e){
            System.out.print(e);
        }


        /**

         Use page object models and design patterns
         This example is to demo the ease of use with Selenide.
         Its important to separate out your implementation for better maintenance, easy of reading and debugging.
         */
    }
    @Test
    public void googlePageTest6(){
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
        try {
            searchResultsPage.checkResultsSize(7);
            searchResultsPage.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
        }
        catch (Exception e){
            System.out.print(e);
        }


        /**

         Use page object models and design patterns
         This example is to demo the ease of use with Selenide.
         Its important to separate out your implementation for better maintenance, easy of reading and debugging.
         */
    }
    @Test
    public void googlePageTest7(){
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
        try {
            searchResultsPage.checkResultsSize(7);
            searchResultsPage.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
        }
        catch (Exception e){
            System.out.print(e);
        }


        /**

         Use page object models and design patterns
         This example is to demo the ease of use with Selenide.
         Its important to separate out your implementation for better maintenance, easy of reading and debugging.
         */
    }
    @Test
    public void googlePageTest8(){
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
        try {
            searchResultsPage.checkResultsSize(7);
            searchResultsPage.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
        }
        catch (Exception e){
            System.out.print(e);
        }


        /**

         Use page object models and design patterns
         This example is to demo the ease of use with Selenide.
         Its important to separate out your implementation for better maintenance, easy of reading and debugging.
         */
    }
    @Test
    public void googlePageTest9(){
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
        try {
            searchResultsPage.checkResultsSize(7);
            searchResultsPage.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
        }
        catch (Exception e){
            System.out.print(e);
        }


        /**

         Use page object models and design patterns
         This example is to demo the ease of use with Selenide.
         Its important to separate out your implementation for better maintenance, easy of reading and debugging.
         */
    }
    @Test
    public void googlePageTest10(){
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
        try {
            searchResultsPage.checkResultsSize(7);
            searchResultsPage.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
        }
        catch (Exception e){
            System.out.print(e);
        }


        /**

         Use page object models and design patterns
         This example is to demo the ease of use with Selenide.
         Its important to separate out your implementation for better maintenance, easy of reading and debugging.
         */
    }
    @Test
    public void googlePageTest11(){
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
        try {
            searchResultsPage.checkResultsSize(7);
            searchResultsPage.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
        }
        catch (Exception e){
            System.out.print(e);
        }


        /**

         Use page object models and design patterns
         This example is to demo the ease of use with Selenide.
         Its important to separate out your implementation for better maintenance, easy of reading and debugging.
         */
    }
    @Test
    public void googlePageTest12(){
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
        try {
            searchResultsPage.checkResultsSize(7);
            searchResultsPage.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
        }
        catch (Exception e){
            System.out.print(e);
        }


        /**

         Use page object models and design patterns
         This example is to demo the ease of use with Selenide.
         Its important to separate out your implementation for better maintenance, easy of reading and debugging.
         */
    }
    @Test
    public void googlePageTest13(){
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
        try {
            searchResultsPage.checkResultsSize(7);
            searchResultsPage.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
        }
        catch (Exception e){
            System.out.print(e);
        }


        /**

         Use page object models and design patterns
         This example is to demo the ease of use with Selenide.
         Its important to separate out your implementation for better maintenance, easy of reading and debugging.
         */
    }
    @Test
    public void googlePageTest14(){
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
        try {
            searchResultsPage.checkResultsSize(7);
            searchResultsPage.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
        }
        catch (Exception e){
            System.out.print(e);
        }


        /**

         Use page object models and design patterns
         This example is to demo the ease of use with Selenide.
         Its important to separate out your implementation for better maintenance, easy of reading and debugging.
         */
    }
    @Test
    public void googlePageTest15(){
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
        try {
            searchResultsPage.checkResultsSize(7);
            searchResultsPage.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
        }
        catch (Exception e){
            System.out.print(e);
        }


        /**

         Use page object models and design patterns
         This example is to demo the ease of use with Selenide.
         Its important to separate out your implementation for better maintenance, easy of reading and debugging.
         */
    }
    @Test
    public void googlePageTest16(){
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
        try {
            searchResultsPage.checkResultsSize(7);
            searchResultsPage.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
        }
        catch (Exception e){
            System.out.print(e);
        }


        /**

         Use page object models and design patterns
         This example is to demo the ease of use with Selenide.
         Its important to separate out your implementation for better maintenance, easy of reading and debugging.
         */
    }
    @Test
    public void googlePageTest17(){
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
        try {
            searchResultsPage.checkResultsSize(7);
            searchResultsPage.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
        }
        catch (Exception e){
            System.out.print(e);
        }


        /**

         Use page object models and design patterns
         This example is to demo the ease of use with Selenide.
         Its important to separate out your implementation for better maintenance, easy of reading and debugging.
         */
    }
    @Test
    public void googlePageTest18(){
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
        try {
            searchResultsPage.checkResultsSize(7);
            searchResultsPage.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
        }
        catch (Exception e){
            System.out.print(e);
        }


        /**

         Use page object models and design patterns
         This example is to demo the ease of use with Selenide.
         Its important to separate out your implementation for better maintenance, easy of reading and debugging.
         */
    }
    @Test
    public void googlePageTest19(){
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
        try {
            searchResultsPage.checkResultsSize(7);
            searchResultsPage.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
        }
        catch (Exception e){
            System.out.print(e);
        }


        /**

         Use page object models and design patterns
         This example is to demo the ease of use with Selenide.
         Its important to separate out your implementation for better maintenance, easy of reading and debugging.
         */
    }
    @Test
    public void googlePageTest20(){
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
        try {
            searchResultsPage.checkResultsSize(7);
            searchResultsPage.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
        }
        catch (Exception e){
            System.out.print(e);
        }


        /**

         Use page object models and design patterns
         This example is to demo the ease of use with Selenide.
         Its important to separate out your implementation for better maintenance, easy of reading and debugging.
         */
    }
    @Test
    public void googlePageTest21(){
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
        try {
            searchResultsPage.checkResultsSize(7);
            searchResultsPage.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
        }
        catch (Exception e){
            System.out.print(e);
        }


        /**

         Use page object models and design patterns
         This example is to demo the ease of use with Selenide.
         Its important to separate out your implementation for better maintenance, easy of reading and debugging.
         */
    }
    @Test
    public void googlePageTest22(){
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
        try {
            searchResultsPage.checkResultsSize(7);
            searchResultsPage.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
        }
        catch (Exception e){
            System.out.print(e);
        }


        /**

         Use page object models and design patterns
         This example is to demo the ease of use with Selenide.
         Its important to separate out your implementation for better maintenance, easy of reading and debugging.
         */
    }
    @Test
    public void googlePageTest23(){
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
        try {
            searchResultsPage.checkResultsSize(7);
            searchResultsPage.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
        }
        catch (Exception e){
            System.out.print(e);
        }


        /**

         Use page object models and design patterns
         This example is to demo the ease of use with Selenide.
         Its important to separate out your implementation for better maintenance, easy of reading and debugging.
         */
    }
    @Test
    public void googlePageTest24(){
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
        try {
            searchResultsPage.checkResultsSize(7);
            searchResultsPage.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
        }
        catch (Exception e){
            System.out.print(e);
        }


        /**

         Use page object models and design patterns
         This example is to demo the ease of use with Selenide.
         Its important to separate out your implementation for better maintenance, easy of reading and debugging.
         */
    }
    @Test
    public void googlePageTest25(){
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
        try {
            searchResultsPage.checkResultsSize(7);
            searchResultsPage.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
        }
        catch (Exception e){
            System.out.print(e);
        }


        /**

         Use page object models and design patterns
         This example is to demo the ease of use with Selenide.
         Its important to separate out your implementation for better maintenance, easy of reading and debugging.
         */
    }
    @Test
    public void googlePageTest26(){
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
        try {
            searchResultsPage.checkResultsSize(7);
            searchResultsPage.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
        }
        catch (Exception e){
            System.out.print(e);
        }


        /**

         Use page object models and design patterns
         This example is to demo the ease of use with Selenide.
         Its important to separate out your implementation for better maintenance, easy of reading and debugging.
         */
    }
    @Test
    public void googlePageTest27(){
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
        try {
            searchResultsPage.checkResultsSize(7);
            searchResultsPage.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
        }
        catch (Exception e){
            System.out.print(e);
        }


        /**

         Use page object models and design patterns
         This example is to demo the ease of use with Selenide.
         Its important to separate out your implementation for better maintenance, easy of reading and debugging.
         */
    }
    @Test
    public void googlePageTest28(){
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
        try {
            searchResultsPage.checkResultsSize(7);
            searchResultsPage.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
        }
        catch (Exception e){
            System.out.print(e);
        }


        /**

         Use page object models and design patterns
         This example is to demo the ease of use with Selenide.
         Its important to separate out your implementation for better maintenance, easy of reading and debugging.
         */
    }
    @Test
    public void googlePageTest29(){
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
        try {
            searchResultsPage.checkResultsSize(7);
            searchResultsPage.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
        }
        catch (Exception e){
            System.out.print(e);
        }


        /**

         Use page object models and design patterns
         This example is to demo the ease of use with Selenide.
         Its important to separate out your implementation for better maintenance, easy of reading and debugging.
         */
    }
    @Test
    public void googlePageTest30(){
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
        try {
            searchResultsPage.checkResultsSize(7);
            searchResultsPage.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
        }
        catch (Exception e){
            System.out.print(e);
        }


        /**

         Use page object models and design patterns
         This example is to demo the ease of use with Selenide.
         Its important to separate out your implementation for better maintenance, easy of reading and debugging.
         */
    }

























}
