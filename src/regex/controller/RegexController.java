package regex.controller;

import java.awt.Color;

import javax.swing.JOptionPane;

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
	
	public Color validFirstName(String name)
	{
		if(name.matches(".*[a-zA-Z]{2,30}"))
		{
			return Color.GREEN;
		}
		return Color.RED;
	}
	
	public Color validLastName(String name)
	{
		if(name.matches(".*[a-zA-Z ,.-]{2,40}"))
		{
			return Color.GREEN;
		}
		return Color.RED;
	}
	
	public Color validNumber(String number)
	{
		if(number.matches("^(?:(?:\\+?1\\s*(?:[.-]\\s*)?)?(?:\\(\\s*([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9])\\s*\\)|([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9]))\\s*(?:[.-]\\s*)?)?([2-9]1[02-9]|[2-9][02-9]1|[2-9][02-9]{2})\\s*(?:[.-]\\s*)?([0-9]{4})(?:\\s*(?:#|x\\.?|ext\\.?|extension)\\s*(\\d+))?$"))
				//"^(1\\-)?[0-9]{3}\\-?[0-9]{3}\\-?[0-9]{4}$"
		{
			return Color.GREEN;
		}
		return Color.RED;
	}
	
	public Color validEmail(String email)
	{
		if(email.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$"))
		{
			return Color.GREEN;
		}
		return Color.RED;
	}
}
