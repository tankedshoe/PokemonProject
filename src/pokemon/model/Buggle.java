package pokemon.model;

public class Buggle extends Pokemon implements Bug
{
	private int bugAmount;
	
	public Buggle()
	{
		super(1002, "Buggle");
		setup();
	}
	
	public Buggle(String name) 
	{
		super(1002, name);
		setup();
	}
	
	public Buggle(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	public void bite()
	{
		
	}
	
	public boolean runAway() 
	{
		return false;
	}
	
	public int swarm(int bugAmount)
	{
		return 0;
	}
	
	protected void setup()
	{
		this.setAttackPoints(200);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.89);
		this.setHealthPoints(123);
	}
}
