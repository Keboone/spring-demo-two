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
		
		/*
		 * tutaj mamy tennisCoach -> ID stworzone automatycznie przez Springa
		 * zmieniajac pierwsza litere nazwe klasy na małą
		*/
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// zadanie na koniec sekcji
		
		/*
		 * tutaj mamy thatSillyCoach -> ID stworzone przez nas w nawiasach 
		 * przy @Component("thatSillyCoach") w klasie RugbyCoach
		 * 
		 * DOD:
		 * tutaj musieliśmy zmienić na klasę RugbyCoach przy tworzeniu obiektu,
		 * ponieważ metody getEmail() oraz getTeam() nie są zdefiniowane w interfejsie Coach
		*/
		RugbyCoach theSillyCoach = context.getBean("thatSillyCoach", RugbyCoach.class);
		
		System.out.println(theSillyCoach.getDailyWorkout());
		System.out.println(theSillyCoach.getDailyFortune());
		System.out.println(theSillyCoach.getEmail());
		System.out.println(theSillyCoach.getTeam());
		
		
		context.close();
	}

}
