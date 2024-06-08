package GenericLib;

import java.util.Random;

public class WorkLib {
	
	public int getRandomNo()
	{
		Random r = new Random();
		int no = r.nextInt(1000);
		return no;
	}

}
