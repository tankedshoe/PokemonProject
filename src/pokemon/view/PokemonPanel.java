package pokemon.view;

import javax.swing.*;
import pokemon.controller.*;

import java.awt.Color;

public class PokemonPanel extends JPanel
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
	
	public PokemonPanel(PokemonController appController)
	{
		super();
		this.appController = appController;
		
		this.healthLabel = new JLabel("0");
		this.attackLabel = new JLabel("Default Attack.");
		this.nameLabel = new JLabel("Default Name");
		this.numberLabel = new JLabel("0");
		this.evolvableLabel = new JLabel("No Modifier");
		this.iconLabel = new JLabel("Pokemon", new ImageIcon(getClass().getResource("/pokemon/view/images/default.png")), JLabel.CENTER);
		
		this.evolvableBox = new JCheckBox();
		this.nameField = new JTextField(20);
		this.numberField = new JTextField(20);
		this.attackField = new JTextField(20);
		this.healthField = new JTextField(20);
		this.modifierField = new JTextField(20);
		
		this.descriptionArea = new JTextArea(5, 10);
		this.typeArea = new JTextArea(4, 15);
				
		this.saveButton = new JButton("save");
		this.clearButton = new JButton("clear");
		this.pokedexDropdown = new JComboBox();
		
		this.firstType = new JPanel();
		this.secondType = new JPanel();
		this.thirdType = new JPanel();
		this.fourthType = new JPanel();
		
		this.layout = new SpringLayout();
		
		setupComboBox();
		setupTypePanels();
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
	
	private void setupComboBox()
	{
		DefaultComboBoxModel pokemonModel = new DefaultComboBoxModel(appController.convertPokedex());
		pokedexDropdown.setModel(pokemonModel);
	}
	
	private void setupPanel()
	{
		this.setLayout(layout);
		
		this.setBackground(Color.RED);
		this.add(healthLabel);
		this.add(attackLabel);
		this.add(nameLabel);
		this.add(numberLabel);
		this.add(evolvableLabel);
		this.add(iconLabel);
		this.add(evolvableBox);
		this.add(nameField);
		this.add(numberField);
		this.add(attackField);
		this.add(healthField);
		this.add(modifierField);
		this.add(descriptionArea);
		this.add(typeArea);
		this.add(saveButton);
		this.add(clearButton);
		this.add(pokedexDropdown);
		this.add(firstType);
		this.add(secondType);
		this.add(thirdType);
		this.add(fourthType);
		
	}
	
	private void setupLayout()
	{
		layout.putConstraint(SpringLayout.WEST, numberField, 301, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.EAST, numberField, -10, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH, iconLabel, 52, SpringLayout.SOUTH, saveButton);
		layout.putConstraint(SpringLayout.WEST, iconLabel, 10, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, descriptionArea, 0, SpringLayout.NORTH, iconLabel);
		layout.putConstraint(SpringLayout.EAST, descriptionArea, 0, SpringLayout.EAST, nameField);
		layout.putConstraint(SpringLayout.SOUTH, evolvableBox, -6, SpringLayout.NORTH, modifierField);
		layout.putConstraint(SpringLayout.EAST, evolvableBox, -26, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH, numberLabel, 5, SpringLayout.NORTH, modifierField);
		layout.putConstraint(SpringLayout.EAST, numberLabel, -28, SpringLayout.WEST, modifierField);
		layout.putConstraint(SpringLayout.NORTH, healthLabel, 5, SpringLayout.NORTH, nameField);
		layout.putConstraint(SpringLayout.EAST, healthLabel, -27, SpringLayout.WEST, nameField);
		layout.putConstraint(SpringLayout.NORTH, evolvableLabel, 5, SpringLayout.NORTH, attackField);
		layout.putConstraint(SpringLayout.WEST, evolvableLabel, 0, SpringLayout.WEST, attackLabel);
		layout.putConstraint(SpringLayout.NORTH, attackLabel, 5, SpringLayout.NORTH, healthField);
		layout.putConstraint(SpringLayout.EAST, attackLabel, 0, SpringLayout.EAST, iconLabel);
		layout.putConstraint(SpringLayout.NORTH, nameLabel, 5, SpringLayout.NORTH, numberField);
		layout.putConstraint(SpringLayout.EAST, nameLabel, -5, SpringLayout.WEST, numberField);
		layout.putConstraint(SpringLayout.SOUTH, modifierField, -6, SpringLayout.NORTH, healthField);
		layout.putConstraint(SpringLayout.EAST, modifierField, 0, SpringLayout.EAST, nameField);
		layout.putConstraint(SpringLayout.SOUTH, healthField, -6, SpringLayout.NORTH, attackField);
		layout.putConstraint(SpringLayout.EAST, healthField, 0, SpringLayout.EAST, nameField);
		layout.putConstraint(SpringLayout.SOUTH, attackField, -10, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.EAST, attackField, -10, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.WEST, nameField, 0, SpringLayout.WEST, numberField);
		layout.putConstraint(SpringLayout.EAST, nameField, 139, SpringLayout.WEST, numberField);
		layout.putConstraint(SpringLayout.NORTH, nameField, 6, SpringLayout.SOUTH, numberField);
		layout.putConstraint(SpringLayout.NORTH, numberField, 10, SpringLayout.NORTH, this);
	}
	
	private void setupListeners()
	{
		
	}
}
