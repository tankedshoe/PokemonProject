package pokemon.model;

public class Metacular extends Pokemon implements Steel
{
	private int power;
	
	public Metacular()
	{
		super(1005, "Metacular");
		setup();
	}
	
	public Metacular(String name)
	{
		super(1005, name);
		setup();
	}
	
	public Metacular(int number, String name)
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
		return power;
	}
	
	protected void setup()
	{
		this.setAttackPoints(200);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.89);
		this.setHealthPoints(123);
	}
}
