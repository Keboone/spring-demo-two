package practice.two.learning.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import two.learning.spring.Coach;

public class PracticeDemoApp
{

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ConfigClass.class);
		
		Coach theCoach = context.getBean("golfCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}

}
