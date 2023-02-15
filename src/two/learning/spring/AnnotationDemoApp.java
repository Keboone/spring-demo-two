package two.learning.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp 
{

	public static void main(String[] args) 
	{
		// read spring config file
		
		// get the bean from spring container
		
		// call a method on the bean
		
		// close the context
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theSillyCoach = context.getBean("thatSillyCoach", Coach.class);
		
		System.out.println(theSillyCoach.getDailyWorkout());
		
		// zadanie na koniec sekcji
		
		Coach theCoach = context.getBean("rugbyCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
	}

}
