package pokemon.model;

public class Copperus extends Pokemon implements Steel
{
	private int power;
	
	public Copperus(int number, String name)
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
		return 0;
	}
}
