package com.suveer.selenidejava.selenidejava;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {


  @Test
  public void googlePageTest(){

    GooglePage googlePage = open("http://www.google.co.nz",GooglePage.class);
    SearchResultsPage searchResultsPage = googlePage.searchGoogle("selenide");

    searchResultsPage.checkResultsSize(9);
    searchResultsPage.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));

  }

}
