/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class AppTestDriver {
    
    // System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
    // WebDriver driver = new ChromeDriver();
    // driver.get("http://localhost:8080/testing_tools_selenium_wd/");

    @Test
    public void testeArranjo() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");


        //CASO DE TESTE
        //VALOR MAIS PERTO DE 0
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/app/");
        Thread.sleep(2000);
        WebElement numberInput = driver.findElement(By.name("number1"));
        numberInput.sendKeys("1");
        Thread.sleep(2000);
        WebElement numberInput2 = driver.findElement(By.name("number2"));
        numberInput2.sendKeys("1");
        Thread.sleep(2000);
        WebElement bt = driver.findElement(By.id("dataSender"));
        bt.click();
        Thread.sleep(3000);
        String arranjo = driver.findElement(By.id("arranjoParagraph")).getText();
        assertTrue(arranjo.equals("1"));
		driver.close();
        driver.quit();


        Thread.sleep(2000);

        //CASO DE TESTE 2
        //VALOR MAIS PERTO DE 6
        WebDriver driver2 = new ChromeDriver();
        driver2.get("http://localhost:8080/app/");
        Thread.sleep(2000);
        WebElement numberInput3 = driver2.findElement(By.name("number1"));
        numberInput3.sendKeys("5");
        Thread.sleep(2000);
        WebElement numberInput4 = driver2.findElement(By.name("number2"));
        numberInput4.sendKeys("5");
        Thread.sleep(2000);
        WebElement bt2 = driver2.findElement(By.id("dataSender"));
        bt2.click();
        Thread.sleep(3000);
        String arranjo2 = driver2.findElement(By.id("arranjoParagraph")).getText();
        assertTrue(arranjo2.equals("120"));
        driver2.close();
        driver2.quit();

        Thread.sleep(2000);
        //CASO DE TESTE 3
        //VALOR NULO
        WebDriver driver3 = new ChromeDriver();
        driver3.get("http://localhost:8080/app/");
        Thread.sleep(2000);
        WebElement numberInput5 = driver3.findElement(By.name("number1"));
        numberInput5.sendKeys("0");
        Thread.sleep(2000);
        WebElement numberInput6 = driver3.findElement(By.name("number2"));
        numberInput6.sendKeys("0");
        Thread.sleep(2000);
        WebElement bt3 = driver3.findElement(By.id("dataSender"));
        bt3.click();
        Thread.sleep(3000);
        String arranjo3 = driver3.findElement(By.id("arranjoParagraph")).getText();
        assertTrue(arranjo3.equals("0"));
        driver3.close();
        driver3.quit();


    }
}


