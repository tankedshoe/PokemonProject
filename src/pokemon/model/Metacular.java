package pokemon.model;

public class Metacular extends Pokemon implements Steel
{
	private int power;
	
	public Metacular(int number, String name)
	{
		super(number, name);
		
	}
	
	public void hardenBody()
	{
		
	}
	
	public boolean fireResistant()
	{
		return false;
	}
	
	public int powerPunch(int power)
	{
		return power;
	}
}
