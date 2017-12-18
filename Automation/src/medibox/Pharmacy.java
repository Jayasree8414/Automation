package medibox;

import org.testng.annotations.Test;

import Framework.Pomclass;

public class Pharmacy extends Login {
	
	//public static void main(String[] args)  {
		@Test
		public void testlogin()
		{
			Pomclass p=new Pomclass(driver);
			p.login("jayasree.n@medibox.in", "84148414");
		}
	}
		


