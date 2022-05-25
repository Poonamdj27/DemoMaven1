package com.mavenproject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


import com.google.common.io.Files;

public class ScreenShot {
	
	
	public void takeScreenShotUsingSelenium() throws IOException {
		System.setProperty("webdriver.chrome.driver","D:/Jar/chromedriver_win32/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		
		driver.get("https://www.testingshastra.com");
		File file = driver.getScreenshotAs(OutputType.FILE);
		File out= new File("usingSelenium.png");
		Files.copy(file, out);
	}
	public static void main(String[] args) throws IOException {
		new ScreenShot().takeScreenShotUsingSelenium();
	}


}
