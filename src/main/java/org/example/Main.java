package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        System.setProperty("webdriver.chrome.driver","C://chromedrivers//chromedriver-win64//chromedriver-win64//chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        driver.get("https://www.google.com/");

        int[] a = {11, 23, 43, 2, 34, 32, 44, 55};
        Main cc = new Main();
        int g = cc.secondHighest(a);
        System.out.println(g);

    }

    public int secondHighest(int [] b){
        int n = b.length;

        Arrays.sort(b);

        for(int i= n-2; i>=0; i--){
            if(b[i] != b[i-1]){
                return b[i];
            }
        }
        return -1;
    }
}