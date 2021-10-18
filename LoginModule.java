
import java.net.*;
import java.util.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class First extends Frame implements ActionListener
{
	Label output=new Label("Enter credentials");
	TextField usernameinput=new TextField("Enter Username",20);
	TextField passwordinput=new TextField("Enter Password",20);
	Button login=new Button("Login");		
	Button reset=new Button("Reset");
	First()
	{
		Label loginpage=new Label("Login Page");
		loginpage.setBounds(235,100,80,30);
		loginpage.setAlignment(Label.CENTER);
		add(loginpage);
		Label username=new Label("Username");
		username.setBounds(150,200,80,30);
		username.setAlignment(Label.CENTER);
		username.setForeground(Color.WHITE);
		username.setBackground(Color.RED);
		add(username);
		Label password=new Label("Password");
		password.setBounds(150,250,80,30);
		password.setAlignment(Label.CENTER);
		password.setForeground(Color.WHITE);
		password.setBackground(Color.RED);
		add(password);
		usernameinput.setBounds(250,200,160,30);
		add(usernameinput);
		passwordinput.setBounds(250,250,160,30);
		passwordinput.setEchoChar('*');
		add(passwordinput);
		reset.setBounds(190,300,80,30);
		reset.addActionListener(this);
		add(reset);
		login.setBounds(280,300,80,30);
		login.addActionListener(this);
		add(login);
		output.setBounds(240,350,180,30);
		add(output);
		setSize(700,800);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==login)
		{
			String s1=usernameinput.getText();
			String s2=passwordinput.getText();
			if(s1.equals("Abhi") && s2.equals("0909"))
			{
				output.setText("Login Success");
			}
			else
			{
				output.setText("Invalid Login");
			}
		}
		else
		{
			usernameinput.setText("Enter Username");
			passwordinput.setText("Enter password");
		}
	}
}
public class Login
{
	public static void main(String[] args) throws UnknownHostException
	{
		System.out.println("JAI HANUMAN");
		new First();
	}
}
