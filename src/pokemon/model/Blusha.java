package pokemon.model;

public class Blusha extends Pokemon implements Water
{
	private int spray;
	
	public Blusha()
	{
		super(1001, "Blusha");
		setup();
	}
	
	public Blusha(String name)
	{
		super(1001, name);
		setup();
	}
	
	public Blusha(int number, String name)
	{
		super(number, name);
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
