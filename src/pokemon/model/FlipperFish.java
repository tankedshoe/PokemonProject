package pokemon.model;

public class FlipperFish extends Pokemon implements Water
{
	private int spray;
	
	public FlipperFish()
	{
		super(1004, "FlipperFish");
		setup();
	}
	
	public FlipperFish(String name)
	{
		super(1004, name);
		setup();
	}
	
	public FlipperFish(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	public void slipupEnemy()
	{
		
	}
	
	public boolean waterfall()
	{
		return true;
	}
	
	public int squirt(int volume)
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
