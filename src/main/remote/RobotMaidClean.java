package remote;
import vendors.RobotMaid;

public class RobotMaidClean extends Action
{

        private RobotMaid codsworth;


        public RobotMaidClean(RobotMaid codsworth)
        {
                super("RobotMaidClean");
                this.codsworth = codsworth;
        }

        @Override
        public boolean performAction()
        {	
		codsworth.startCleaning();
		if (codsworth.poweredOn())
		{
              		if (codsworth.isCleaning())
			{
				System.out.println("The robot is cleaning");
				System.out.printf("The robot is in %s mode.", codsworth.getDisposition());
			}
			else
			{
				System.out.println("The robot is idling about!");
				System.out.printf("The robot is in %s mode.", codsworth.getDisposition());
			}
		}
		else
		{
			System.out.println("Try turning it on!");
		}
                return true;
        }
}

