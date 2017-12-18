package pokemon.model;

public class FlipperFish extends Pokemon implements Water
{
	private int spray;
	
	public FlipperFish(int number, String name)
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
}
