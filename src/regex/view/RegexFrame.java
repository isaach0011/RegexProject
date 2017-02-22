package regex.view;

import javax.swing.JFrame;
import regex.controller.RegexController;
import java.awt.Dimension;

public class RegexFrame extends JFrame
{
	private RegexController baseController;
	private RegexFrame baseFrame;
	private RegexPanel basePanel;
	
	public RegexFrame(RegexController baseController)
	{
		super();
		this.baseController = baseController;
		basePanel = new RegexPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("Regex Project");
		this.setSize(new Dimension(900,600));
		this.setResizable(false);
		this.setVisible(true);	
	}
}