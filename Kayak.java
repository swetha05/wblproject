package com.home.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Kayak {
public static void main(String args[]){
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.kayak.com");
	driver.findElement(By.className("keel FlightsSearch horizon")).click();
	driver.findElement(By.id("SYCo-destination")).sendKeys("Las Vegas (LAS)");
	Select dropdown = new Select(driver.findElement(By.className("r9-datepicker-display")));
	dropdown.selectByValue("13");

	Select dropdown1 = new Select(driver.findElement(By.className("r9-datepicker-icon r9-icon-calendar-depart")));
	dropdown1.selectByValue("22");
	Select dropdown2 = new Select(driver.findElement(By.className("label")));
	dropdown2.getFirstSelectedOption();
	//dropdown2.selectByValue("22");//
	/*List<WebElement> element = driver.findElements(By.cssSelector(".txt_black.heading_4"));
    for (int i = 0; i < element.size(); i++) {
        String temp = element.get(i).getText();
        if (temp.equals("0")) {
            element.get(i).click();             
            break;*/
driver.findElement(By.id("S9xQ-submit")).click();      

}


    

}


