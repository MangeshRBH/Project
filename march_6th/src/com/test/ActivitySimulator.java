package com.test;
import java.awt.*;
import java.awt.event.KeyEvent;

public class ActivitySimulator {
    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot automationBot = new Robot();
        
        while (true) {
            automationBot.keyPress(KeyEvent.VK_SHIFT); 
            automationBot.keyRelease(KeyEvent.VK_SHIFT);
            System.out.println("hello");
            Thread.sleep(180000); 
        }
    }
}


