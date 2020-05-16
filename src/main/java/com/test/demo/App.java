package com.test.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.demo.service.Coach;


public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Coach coach = context.getBean("mycoach",Coach.class);
        System.out.println(coach.getWorkoutDetails());
        System.out.println(coach.getDailyFortune());
        
        context.close();
    }
}
