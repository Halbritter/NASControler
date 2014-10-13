package de.Albritter.SSHJava.GUI.login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.WindowConstants;

import de.Albritter.SSHJava.GUI.UniversallActionListener;
import de.Albritter.SSHJava.helper.Names;
import de.Albritter.SSHJava.helper.Tools;

import java.awt.Toolkit;

public class LoginFrame extends JFrame
{

	private JPanel			contentPane;
	private JPasswordField	passwordField;
	private JButton			loginButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			public void run()
			{
				try
				{
					LoginFrame frame = new LoginFrame();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	@SuppressWarnings("deprecation")
	public String getPasswort(){
		
		
		 return passwordField.getText();
	}
	/**
	 * Create the frame.
	 */
	public LoginFrame()
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginFrame.class.getResource("icon.png")));
		Tools.out(LoginFrame.class.getResource("icon.png"));
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 80);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JLabel topLable = new JLabel(Names.LoginFrameNames.LABLE_LOGIN);
		topLable.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(topLable, BorderLayout.NORTH);

		passwordField = new JPasswordField();
		contentPane.add(passwordField, BorderLayout.CENTER);

		loginButton = new JButton("Login");
		loginButton.addActionListener(new UniversallActionListener());
		loginButton.setActionCommand(Names.ButtonsActionComands.BUTTON_LOGIN);
		contentPane.add(loginButton, BorderLayout.EAST);
		
	}
}
