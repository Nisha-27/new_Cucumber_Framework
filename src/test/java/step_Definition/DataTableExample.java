package step_Definition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import java.util.Map.Entry;


public class DataTableExample {
	
	WebDriver driver;

	@Given("I want pass the data")
	public void i_want_pass_the_data(DataTable data) throws Exception {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");

		WebElement username = driver.findElement(By.name("email"));
		List<String> names = data.asList();
		
		for(int i =0; i<names.size();i++)
		{
			System.out.println(names.get(i));
			username.sendKeys(names.get(i));
			Thread.sleep(5000);
			username.clear();
		}
		
		System.out.println("--------------------------------");
		
		for(String temp: names)
		{
			System.out.println(temp);
			
			username.sendKeys(temp);
			Thread.sleep(5000);
			username.clear();
			
		}
	}

	@Then("the data has been passed")
	public void the_data_has_been_passed() {
	    System.out.println("completetd");
	}

	@Given("I want pass multiple column of datas")
	public void i_want_pass_multiple_column_of_datas(DataTable datas) {
		
	    List<List<String>> asLists = datas.asLists();
	    
	    System.out.println(asLists.size());
	    
	    for(int i =0; i <asLists.size();i++)
	    {
	    	for(int j=0; j<asLists.get(i).size();j++)
	    	{
	    		System.out.println(asLists.get(i).get(j));
	    	}
	    }
	    System.out.println("-------------------------------");
	    
	    for(List<String> name:asLists)
	    {
	    	for(String temp : name)
	    	{
	    		System.out.println(temp);
	    	}
	    }
	    
	}
	
	@Given("I want pass data with heading")
	public void i_want_pass_data_with_heading(DataTable data) {
	    
		Map<String, String> asMap = data.asMap();
		
		for(Entry<String,String> mapValue: asMap.entrySet())
		{
			System.out.println(mapValue);
		}
		
		System.out.println("get all the values");
		
		for(String value:asMap.values())
		{
			System.out.println(value);
		}
		
		System.out.println("get all the keys");
		
		for(String key:asMap.keySet())
		{
			System.out.println(key);
		}
		
		System.out.println(asMap.get("name"));
		
	}
	
	@Given("I want pass heading with mulitple value")
	public void i_want_pass_heading_with_mulitple_value(DataTable data) {
		
		List<Map<String, String>> asMaps = data.asMaps();
		
		System.out.println(asMaps.size());
		
		for(int i=0; i < asMaps.size();i++)
		{
			for(Entry<String,String> temp: asMaps.get(i).entrySet())
			{
				System.out.println(temp);
			}
		}
		for(int i=0; i < asMaps.size();i++)
		{
			for(String value: asMaps.get(i).values())
			{
				System.out.println(value);
			}
		}
		for(int i=0; i < asMaps.size();i++)
		{
			for(String key: asMaps.get(i).keySet())
			{
				System.out.println(key);
			}
		}
		
	}
	
}
