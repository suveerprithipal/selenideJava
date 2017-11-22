package com.suveer.selenidejava.selenidejava.domain;


import org.junit.Test;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {

  @Test
  public void googleSearchTest(){
    open("https://www.google.com/");

    /*
     $(By.name("q")).val("selenide").pressEnter();
    $$("#ires .g").shouldHave(CollectionCondition.size(10));
    $("#ires .g").shouldBe(visible).shouldHave(text("Selenide: concise UI tests in Java"));
     */
  }
}
