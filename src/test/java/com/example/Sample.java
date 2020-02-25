package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Sample {

  @Test
  public void sampleTest() {
//    WebDriver driver = new ChromeDriver();
//    driver.get("https://mail.ru");
    Assertions.assertEquals(4, 8 / 2);
  }
}
