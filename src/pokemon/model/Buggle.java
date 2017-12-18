package pokemon.model;

public class Buggle extends Pokemon implements Bug
{
	private int bugAmount;
	
	public Buggle(int number, String name)
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
}
