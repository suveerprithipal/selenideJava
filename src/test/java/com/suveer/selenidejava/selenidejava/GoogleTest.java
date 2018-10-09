package com.suveer.selenidejava.selenidejava;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;

/**
 * Created for demo on 9/12/17.
 *
 * @author Suveer Prithipal
 */

public class GoogleTest {

  private RemoteWebDriver driver;

  @Before
  public void setup() throws MalformedURLException {
    driver = new RemoteWebDriver(new URL("http://13.211.227.115:5555/wd/hub"), DesiredCapabilities.chrome());
      WebDriverRunner.setWebDriver(driver);
  }

  @After
  public void teardown() {
    if (driver != null) {
      driver.quit();
    }
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
  public void xpathTest(){
    GooglePage googlePage = open("http://www.google.com",GooglePage.class);
    SearchResultsPage searchResultsPage = googlePage.searchiesGoogle("Selenide");

  }


}
