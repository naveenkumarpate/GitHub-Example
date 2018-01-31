package com.GetHub_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetHub_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\DUCAT\\Seleniam Automation\\Gmail Login\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.navigate().to("http://toolsqa.com/iframe-practice-page/");
		String defaulttext = driver.findElement(By.cssSelector("#page > div.page-title.title-center.solid-bg > div > div > div > div.wf-td.hgroup > h1")).getText();
		System.out.println(defaulttext);
		WebElement iframe =driver.findElement(By.cssSelector("#IF2"));
		driver.switchTo().frame(iframe);
		String text = driver.findElement(By.cssSelector("#content > h2")).getText();
		System.out.println(text);
		

	}

}
