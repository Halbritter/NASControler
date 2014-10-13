package de.Albritter.SSHJava.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import net.neoremind.sshxcute.exception.TaskExecFailException;
import de.Albritter.SSHJava.InitSSH;
import de.Albritter.SSHJava.helper.Names;
import de.Albritter.SSHJava.helper.ObjectRefferences;

public class UniversallActionListener implements ActionListener
{

	public UniversallActionListener()
	{
	}

	public void actionPerformed(ActionEvent arg0)
	{
		if (arg0.getActionCommand().equals(Names.ButtonsActionComands.BUTTON_LOGIN))
		{
			try
			{
				login();
			} catch (TaskExecFailException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private void login() throws TaskExecFailException
	{
		InitSSH.init(ObjectRefferences.Windows.getLoginFrame().getPasswort(), ObjectRefferences.ConfigValues.user, ObjectRefferences.ConfigValues.ip);

	}
}
