package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

  @Test
  public void sampleTest() {
    WebDriver driver = new ChromeDriver();
    driver.get("https://mail.ru");
    driver.close();
    Assertions.assertEquals(4, 8 / 2);
  }
}
