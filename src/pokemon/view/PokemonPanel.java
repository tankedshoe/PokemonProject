package pokemon.view;

import javax.swing.*;
import pokemon.controller.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
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
		
		descriptionArea.setText(appController.getPokedex().get(index).toString());
		typeArea.setText("");
		
		for (String current : appController.getPokedex().get(index).getPokemonTypes())
		{
			typeArea.append(current + "\n");
		}
	}
	
	private void setupComboBox()
	{
		DefaultComboBoxModel pokemonModel = new DefaultComboBoxModel(appController.convertPokedex());
		pokedexDropdown.setModel(pokemonModel);
	}
	
	private void setupTypePanels()
	{
		String [] types = appController.getPokedex().get(pokedexDropdown.getSelectedIndex()).getPokemonTypes();
		
		//Change this to match your 3 minimum Types in your pokedex
		if (types[0].equals("Steel"))
		{
			firstType.setBackground(Color.GRAY);
		}
		else if(types[0].equals("Water"))
		{
			firstType.setBackground(Color.BLUE);
		}
		else if(types[0].equals("Bug"))
		{
			firstType.setBackground(Color.GREEN);
		}
		else
		{
			firstType.setBackground(Color.WHITE);
		}
		
		if (types[1].equals("Steel"))
		{
			if (types[1].equals("Steel"))
			{
				secondType.setBackground(Color.GRAY);
			}
			
			if (types.length == 3)
			{
				
			}
		}
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
		
	}
	
	private void setupLayout()
	{
		layout.putConstraint(SpringLayout.NORTH, iconLabel, 52, SpringLayout.SOUTH, saveButton);
		layout.putConstraint(SpringLayout.WEST, iconLabel, 10, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, descriptionArea, 0, SpringLayout.NORTH, iconLabel);
		layout.putConstraint(SpringLayout.EAST, evolvableBox, -26, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.WEST, evolvableLabel, 0, SpringLayout.WEST, attackLabel);
		layout.putConstraint(SpringLayout.EAST, attackLabel, 0, SpringLayout.EAST, iconLabel);
		layout.putConstraint(SpringLayout.NORTH, modifierField, -5, SpringLayout.NORTH, evolvableLabel);
		layout.putConstraint(SpringLayout.WEST, modifierField, 0, SpringLayout.WEST, attackField);
		layout.putConstraint(SpringLayout.EAST, modifierField, 0, SpringLayout.EAST, nameField);
		layout.putConstraint(SpringLayout.NORTH, healthField, 0, SpringLayout.NORTH, numberLabel);
		layout.putConstraint(SpringLayout.WEST, healthField, 0, SpringLayout.WEST, attackField);
		layout.putConstraint(SpringLayout.EAST, healthField, 0, SpringLayout.EAST, nameField);
		layout.putConstraint(SpringLayout.SOUTH, evolvableBox, -38, SpringLayout.NORTH, attackField);
		layout.putConstraint(SpringLayout.EAST, numberLabel, -288, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.SOUTH, numberLabel, -16, SpringLayout.NORTH, attackLabel);
		layout.putConstraint(SpringLayout.SOUTH, evolvableLabel, -15, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.NORTH, attackField, -5, SpringLayout.NORTH, attackLabel);
		layout.putConstraint(SpringLayout.EAST, attackField, 0, SpringLayout.EAST, nameField);
		layout.putConstraint(SpringLayout.SOUTH, attackLabel, -16, SpringLayout.NORTH, evolvableLabel);
		layout.putConstraint(SpringLayout.NORTH, numberField, -5, SpringLayout.NORTH, healthLabel);
		layout.putConstraint(SpringLayout.WEST, numberField, 0, SpringLayout.WEST, nameField);
		layout.putConstraint(SpringLayout.EAST, numberField, -9, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.EAST, descriptionArea, -10, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH, healthLabel, 16, SpringLayout.SOUTH, nameLabel);
		layout.putConstraint(SpringLayout.EAST, healthLabel, -176, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH, nameField, -5, SpringLayout.NORTH, nameLabel);
		layout.putConstraint(SpringLayout.WEST, nameField, 6, SpringLayout.EAST, nameLabel);
		layout.putConstraint(SpringLayout.EAST, nameField, -9, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH, nameLabel, 15, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.EAST, nameLabel, -154, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		pokedexDropdown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int selectedPokemonIndex = pokedexDropdown.getSelectedIndex();
				updatePokedexInfo(selectedPokemonIndex);
				updateImage();
				updateTypePanels();
				repaint();
			}
		});
		
		saveButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				if(appController.isValidInteger(attackField.getText()) && appController.isValidInteger(healthField.getText()) && appController.isValidDouble(modifierField.getText()))
				{
					int selected = pokedexDropdown.getSelectedIndex();
					int health = Integer.parseInt(healthField.getText());
					int attack = Integer.parseInt(attackField.getText());
					double modifier = Double.parseDouble(modifierField.getText());
					String name = nameField.getText();
					boolean evolvable = evolvableBox.isSelected();
					
					//Send to the Controller to modify the Pokemon
					appController.updateSelected(selected, health, attack, evolvable, modifier, name);
							
				}
			}
		});
	}
	
	public void updateImage()
	{
		String path = "/pokemon/view/images";
		String defaultName = "default";
		String name = pokedexDropdown.getSelectedItem().toString();
		String extension = ".png";
		ImageIcon pokemonIcon;
		
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name + extension));
		}
		catch (NullPointerException missingImageFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		
		iconLabel.setIcon(pokemonIcon);
	}
	
	public void updateTypePanels()
	{
		
	}
}
