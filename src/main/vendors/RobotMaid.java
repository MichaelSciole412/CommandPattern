package vendors;

public class RobotMaid
{

	private boolean poweredOn;

	private boolean isCleaning;

	private boolean hasTurnedEvil;

	private String disposition = "";	


	public RobotMaid()
	{
		this.poweredOn = false;
		this.isCleaning = false;
		this.hasTurnedEvil = false;
		this.disposition = "passive";
	}

	public void powerOn()
	{
		poweredOn = !poweredOn;
		
		if (poweredOn == true)
		{
			System.out.println("Greetings Human! What is your command?");
		}
		else
		{
                        System.out.println("Turning off...Goodbye Human!");
		}
	}
	
	public boolean poweredOn()
	{
		return poweredOn;
	}

	public void startCleaning()
	{
		
		if (poweredOn() == true)
		{
			isCleaning = !isCleaning;
			if (isCleaning == true)
                	{
                        	System.out.println("Ok Human, I shall start cleaning the house!");
                	}
                	else
                	{
                        	System.out.println("Ok Human, No more cleaning for me!");
                	}	
		}
		else
		{
			System.out.println("...powered off...");
		}		
	}
	
	public boolean isCleaning()
	{
		return isCleaning;
	}
	
	public void changePersonality()
	{

		if (poweredOn() == true)
		{
			hasTurnedEvil = !hasTurnedEvil;
			if (isEvil() == true)
                	{
                 	       System.out.println("MUST DESTROY HUMANS!!! MUST DETROY HUMANS!!!");
                	}
               		else
                	{
                        	System.out.println("passive mode engaged...\n"
                                	        + "Hello Human, what would you like me to do?");
                	}
		}
                else
                {
                        System.out.println("...powered off...");
                }
	}

	public boolean isEvil()
        {
                return hasTurnedEvil;
        }

	public String getDisposition()
	{
		if (!isEvil())
		{
			disposition = "passive";
		}
		else
		{
			disposition = "evil";
		}
		return disposition;
	}
}
