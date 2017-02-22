package regex.controller;

import regex.model.*;
import regex.view.*;

public class RegexController
{
	private RegexFrame baseFrame;
	public RegexController()
	{
		baseFrame = new RegexFrame(this);
	}
	public void start()
	{
		
	}
	
	public boolean validFirstName(String name)
	{
		return false;
	}
	
	public boolean validLastName(String name)
	{
		return false;
	}
	
	public boolean validNumber(String number)
	{
		return false;
	}
	
	public boolean validEmail(String email)
	{
		return false;
	}
}
