package pokemon.model;

public class Antima extends FlipperFish implements Bug, Water 
{
	
	private int bugAmount;
	private int volume;
	
	public Antima()
	{
		super(1000, "Antima");
		setup();
	}
	
	public Antima(String name)
	{
		super(1000, name);
		setup();
	}
	
	public Antima(int number, String name)
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
		
	public void slipupEnemy()
	{
			
	}
		
	public boolean waterfall()
	{
		return false;
	}
		
	public int squirt(int volume)
	{
		return 0;
	}
	
	protected void setup()
	{
		super.setup();
		this.setAttackPoints(200);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.89);
		this.setHealthPoints(123);
	}
}

