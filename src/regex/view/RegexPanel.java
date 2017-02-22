package regex.view;

import javax.swing.*;
import regex.controller.RegexController;
import java.awt.Color;
import java.awt.Dimension;
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
	
	public RegexPanel(RegexController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	public void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900,600));
		this.setBackground(Color.gray);
	}
	
	public void setupLayout()
	{
		
	}
	
	public void setupListeners()
	{
		
	}
}
