package remote;
import vendors.RobotMaid;

public class RobotMaidPower extends Action
{

	private RobotMaid codsworth;


	public RobotMaidPower(RobotMaid codsworth)
	{
		super("RobotMaidPower");
		this.codsworth = codsworth;
	}

	@Override
	public boolean performAction()
	{
		codsworth.powerOn();
		System.out.printf("Your Robot Maid is %s\n", codsworth.poweredOn() ? "on" : "off");
		if (codsworth.poweredOn())
		{
			System.out.printf("The robot is in %s mode.", codsworth.getDisposition());
		}
		return true;
	}
}
