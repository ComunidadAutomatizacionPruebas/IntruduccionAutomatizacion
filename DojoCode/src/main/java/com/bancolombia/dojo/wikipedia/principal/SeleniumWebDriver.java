package com.bancolombia.dojo.wikipedia.principal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriver {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org");
        //driver.findElement(By.id("js-link-box-es")).click();
        WebElement idiomaEspanol = driver.findElement(By.id("js-link-box-es"));
        idiomaEspanol.click();
        driver.findElement(By.id("searchInput")).sendKeys("Automatización de software");
        driver.findElement(By.name("go")).click();
        String texto = driver.findElement(By.id("firstHeading")).getText();
        System.out.println(texto);
    }

}
