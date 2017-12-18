package pokemon.model;

public class Antima extends FlipperFish implements Bug, Water 
{
	private int bugAmount;
	private int spray;
	
	public Antima(int number, String name)
	{
		super(number, name);
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
}
