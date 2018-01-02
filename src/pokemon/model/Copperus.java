package pokemon.model;

public class Copperus extends Pokemon implements Steel
{
	private int power;
	
	public Copperus()
	{
		super(1003, "Copperus");
		setup();
	}
	
	public Copperus(String name)
	{
		super(1003, name);
		setup();
	}
	
	public Copperus(int number, String name)
	{
		super(number, name);
		setup();
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
	
	protected void setup()
	{
		this.setAttackPoints(200);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.89);
		this.setHealthPoints(123);
	}
}
