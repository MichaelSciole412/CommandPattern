package remote;
import vendors.RobotMaid;

public class RobotMaidEvil extends Action
{

        private RobotMaid codsworth;


        public RobotMaidEvil(RobotMaid codsworth)
        {
                super("RobotMaidEvil");
                this.codsworth = codsworth;
        }

        @Override
        public boolean performAction()
        {
		codsworth.changePersonality();
		if (codsworth.poweredOn())
		{	
                	if (codsworth.isEvil())
                	{
                        	System.out.println("uh-ooooh! You should start running!");
                	}
                	else
                	{
                        	System.out.println("The robot is idling about!");
                	}
		
			if (codsworth.isEvil())
                	{
                        	System.out.printf("The robot is in %s mode...why aren't you running?", codsworth.getDisposition());
                	}
		}
		else
		{
			System.out.println("Try turning it on!");
		}
                return true;
	}

}
