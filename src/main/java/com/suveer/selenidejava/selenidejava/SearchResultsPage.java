package com.suveer.selenidejava.selenidejava;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.CollectionCondition.texts;

/**
 * Created for demo on 9/12/17.
 *
 * @author Suveer Prithipal
 */

public class SearchResultsPage {
  @FindBy(css = "#ires .g")
  private ElementsCollection results;


  public void checkResultsSize(int expectedSize) {
    results.shouldHave(size(expectedSize));
  }

  public void checkResults(String... expectedTexts) {
    results.shouldHave(texts(expectedTexts));
  }

  public ElementsCollection getResults() {
    return results;
  }
}