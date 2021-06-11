package beanScopeDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import coaches.Coach;

public class BeanScoopeDemoApp {

    public static void main(String[] args) {

        // Load the spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope_applicationContext.xml");

        // retrieve bean from spring container
        Coach coach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // print out results
        System.out.println("Memory location for coach: " + coach);
        System.out.println("Memory location for alphaCoach: " + alphaCoach);

        // close the context
        context.close();
    }
}
