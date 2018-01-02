package pokemon.view;

import javax.swing.*;
import pokemon.controller.*;

public class PokemonPanel
{
	private PokemonController appController;
	private SpringLayout layout;
	
	private JLabel healthLabel;
	private JLabel attackLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel evolvableLabel;
	private JLabel modifierLabel;
	private JLabel iconLabel;
	
	private JCheckBox evolvableBox;
	private JTextField nameField;
	private JTextField numberField;
	private JTextField attackField;
	private JTextField healthField;
	private JTextField modifierField;
	
	private JTextArea descriptionArea;
	private JTextArea typeArea;
	
	private JButton saveButton;
	private JButton clearButton;
	private JComboBox pokedexDropdown;
	
	private JPanel firstType;
	private JPanel secondType;
	private JPanel thirdType;
	private JPanel fourthType;
	
	public PokemonPanel()
	{
		super();
		this.appController = appController;
		
		this.healthLabel = new JLabel("0");
		this.attackLabel = new JLabel("Default Attack.");
		this.nameLabel = new JLabel("Default Name");
		this.numberLabel = new JLabel("0");
		this.evolvableLabel = new JLabel("No Modifier");
		this.iconLabel = new JLabel("Default Icon");
		
		this.evolvableBox = new JCheckBox();
		this.nameField = new JTextField(20);
		this.numberField = new JTextField(20);
		this.attackField = new JTextField(20);
		this.healthField = new JTextField(20);
		this.modifierField = new JTextField(20);
		
		this.descriptionArea = new JTextArea(10, 25);
		this.typeArea = new JTextArea(10, 25);
				
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void updatePokedexInfo(int index)
	{
		nameField.setText(appController.getPokedex().get(index).getName());
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText(appController.getPokedex().get(index).getNumber() + "");
		attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
		modifierField.setText(appController.getPokedex().get(index).getEnhancementModifier() + "");
	}
	
	private void setupPanel()
	{
		this.add(healthLabel);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
