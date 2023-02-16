package two.learning.spring;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FileRandomFortuneService implements FortuneService
{

	private List<String> listOfFortunes;
	private String fileName = "C:/Users/Keboon/eclipse-workspace/spring-demo-annotations/src/randomFortuneData.txt";
	
	private Random rand = new Random();
	
	public FileRandomFortuneService() 
	{
		File theFile = new File(fileName);
		
		System.out.println("Reading fortunes from the file: " + theFile);
		System.out.println("File exists: " + theFile.exists());
		
		listOfFortunes = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(theFile))) 
		{
			String tempLine;
			
			while((tempLine = br.readLine()) != null)
			{
				listOfFortunes.add(tempLine);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String getFortune() 
	{
		int index = rand.nextInt(listOfFortunes.size());
		
		String yourFortune = listOfFortunes.get(index);
		
		return "Your todays' fortune: " + yourFortune;
	}

}
