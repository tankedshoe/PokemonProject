package pokemon.model;

public class Blusha extends Pokemon implements Water
{
	private int spray;
	
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
}
