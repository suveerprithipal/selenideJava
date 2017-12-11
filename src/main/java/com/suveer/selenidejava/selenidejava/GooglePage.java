package com.suveer.selenidejava.selenidejava;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.page;

/**
 * Created for demo on 9/12/17.
 *
 * @author Suveer Prithipal
 */

public class GooglePage {

  private SelenideElement q;

  public SearchResultsPage searchGoogle(String searchString){
    q.val(searchString).pressEnter();
    return page(SearchResultsPage.class);

  }
}
