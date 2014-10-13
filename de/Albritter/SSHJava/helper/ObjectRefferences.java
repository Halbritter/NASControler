package de.Albritter.SSHJava.helper;

import de.Albritter.SSHJava.GUI.login.LoginFrame;
import de.Albritter.SSHJava.helper.Names.Console;
import net.neoremind.sshxcute.core.ConnBean;
import net.neoremind.sshxcute.core.SSHExec;

public class ObjectRefferences
{

	public static class Objects
	{
		private static SSHExec	ssh;
		private static ConnBean	cb;
		private static Console	con;

		public static SSHExec getSshObject()
		{
			return ssh;
		}

		public static void setSshObject(SSHExec ssh)
		{

			Objects.ssh = ssh;
		}

		public static ConnBean getConnBean()
		{
			return cb;
		}

		public static void setConnBean(ConnBean cb)
		{
			Objects.cb = cb;
		}

		public static Console getConsole()
		{
			return con;
		}

		public static void setConsole(Console con)
		{
			Objects.con = con;
		}

	}

	public static class Windows
	{
private static LoginFrame loginFrame ;

/**
 * @return the loginFrame
 */
public static LoginFrame getLoginFrame()
{
	return loginFrame;
}


public static void setLoginFrame(LoginFrame loginFrame)
{
	Windows.loginFrame = loginFrame;
}
	}

	public static class ConfigValues
	{
		public static String	user;

		public static String	ip;

	}
}
