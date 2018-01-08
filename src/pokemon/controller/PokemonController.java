package pokemon.controller;

import pokemon.model.*;
import pokemon.view.*;
import java.util.List;
import java.util.ArrayList;

public class PokemonController
{
	private List<Pokemon> pokedex;
	private PokemonFrame appFrame;
	
	public void Pokemon()
	{
		this.pokedex = new ArrayList<Pokemon>();
		appFrame = new PokemonFrame(this);
		
		buildPokedex();
	}
	
	private void buildPokedex()
	{
		pokedex.add(new Antima());
		pokedex.add(new Blusha());
		pokedex.add(new Buggle());
		pokedex.add(new Copperus());
		pokedex.add(new FlipperFish());
		pokedex.add(new Metacular());
		
	}
	
	public String [] convertPokedex()
	{
		String[] names = new String [pokedex.size()];
		
		for (int index = 0; index < pokedex.size(); index++)
		{
			names[index] = pokedex.get(index).getName();
		}
		
		return names;
	}
	
	public List<Pokemon> getPokedex()
	{
		return pokedex;
	}
	
	public boolean isValidInteger(String input)
	{
		return false;
	}
	
	public boolean isValidDouble(String input)
	{
		return false;
	}
}

