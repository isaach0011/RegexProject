package regex.view;

import javax.swing.*;
import regex.controller.RegexController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;

public class RegexPanel extends JPanel
{
	private RegexController baseController;
	private RegexFrame baseFrame;
	private SpringLayout baseLayout;
	private JTextField firstInput;
	private JTextField lastInput;
	private JTextField numberInput;
	private JTextField emailInput;
	private JLabel firstLabel;
	private JLabel lastLabel;
	private JLabel numberLabel;
	private JLabel emailLabel;
	private JLabel title;
	private JButton button;
	
	public RegexPanel(RegexController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.firstInput = new JTextField(30);
		this.lastInput = new JTextField(30);
		this.numberInput = new JTextField(30);
		this.emailInput = new JTextField(30);
		this.title = new JLabel("Regex");
		this.firstLabel = new JLabel("First Name");
		this.lastLabel = new JLabel("Last Name");
		this.numberLabel = new JLabel("Number");
		this.emailLabel = new JLabel("Email");
		this.button = new JButton("Submit");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	public void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900,600));
		this.setBackground(Color.gray);
		
		title.setFont(new Font("Impact", Font.BOLD, 50));
		
		this.add(title);
		this.add(firstInput);
		this.add(lastInput);
		this.add(numberInput);
		this.add(emailInput);
		this.add(firstLabel);
		this.add(lastLabel);
		this.add(numberLabel);
		this.add(emailLabel);
		this.add(button);
	}
	
	public void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, button, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, button, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, emailInput, -5, SpringLayout.NORTH, emailLabel);
		baseLayout.putConstraint(SpringLayout.WEST, emailLabel, 52, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, emailLabel, -43, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, numberInput, -5, SpringLayout.NORTH, numberLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, numberLabel, 395, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, numberLabel, 52, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, lastLabel, 111, SpringLayout.SOUTH, firstLabel);
		baseLayout.putConstraint(SpringLayout.WEST, firstLabel, 0, SpringLayout.WEST, lastLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, lastInput, -5, SpringLayout.NORTH, lastLabel);
		baseLayout.putConstraint(SpringLayout.WEST, lastInput, 50, SpringLayout.EAST, lastLabel);
		baseLayout.putConstraint(SpringLayout.WEST, lastLabel, 46, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, title, 0, SpringLayout.WEST, firstLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, firstLabel, 5, SpringLayout.NORTH, firstInput);
		baseLayout.putConstraint(SpringLayout.NORTH, title, 29, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, emailInput, 0, SpringLayout.WEST, firstInput);
		baseLayout.putConstraint(SpringLayout.WEST, numberInput, 0, SpringLayout.WEST, firstInput);
		baseLayout.putConstraint(SpringLayout.WEST, firstInput, 0, SpringLayout.WEST, lastInput);
		baseLayout.putConstraint(SpringLayout.NORTH, firstInput, 121, SpringLayout.NORTH, this);
	}
	
	public void setupListeners()
	{
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String firstName = firstInput.getText();
				String lastName = lastInput.getText();
				String number = numberInput.getText();
				String email = emailInput.getText();
				
				firstInput.setBackground(baseController.validFirstName(firstName));
				lastInput.setBackground(baseController.validLastName(lastName));
				numberInput.setBackground(baseController.validNumber(number));
				emailInput.setBackground(baseController.validEmail(email));
			}
		});
	}
}
