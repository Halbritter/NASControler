package de.Albritter.SSHJava;

import de.Albritter.SSHJava.GUI.login.LoginFrame;
import de.Albritter.SSHJava.helper.GetPropertyValues;
import de.Albritter.SSHJava.helper.ObjectRefferences;

public class ServerControler
{

	public static void main(String[] args) throws Exception
	{
		new GetPropertyValues();
		
		LoginFrame login = new LoginFrame();
		login.setVisible(true);
		ObjectRefferences.Windows.setLoginFrame(login);

		// CommonError e = new CommonError(Names.Messages.INVALID_LOGIN + " or "
		// + Names.Messages.INVALID_IP);

	}
}
