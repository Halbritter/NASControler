package de.Albritter.SSHJava;


import de.Albritter.SSHJava.helper.ObjectRefferences;
import net.neoremind.sshxcute.core.ConnBean;
import net.neoremind.sshxcute.core.SSHExec;
import net.neoremind.sshxcute.exception.TaskExecFailException;

public class InitSSH
{
	private static String	ip;
	private static String	username;
	private static String	password;
	
	public static SSHExec	ssh;
	
	// private static String[] arg;
	
	private static ConnBean	cb;

	public static void init(String passwordString, String usernameString, String ipString) throws TaskExecFailException
	{
		ip = ipString;
		username = usernameString;
		password = passwordString;

		InitSSH.cb = new ConnBean(ip, username, password);
		ObjectRefferences.Objects.setConnBean(cb);

	
		SSHExec ssh = SSHExec.getInstance(cb);
		ObjectRefferences.Objects.setSshObject(ssh);
		if (!(ssh.connect().booleanValue()))
		{
			ssh.disconnect();
		}

		/*
		 * arg[0] = "apt-get upgrade";
		 * 
		 * CustomTask sampleTask = new ExecCommand(arg);
		 * 
		 * Result res = ssh.exec(sampleTask);
		 * 
		 * if (res.isSuccess) { System.out.println("Return code: " + res.rc);
		 * System.out.println("sysout: " + res.sysout); } else {
		 * System.out.println("Return code: " + res.rc);
		 * System.out.println("error message: " + res.error_msg); }
		 * ssh.disconnect();
		 */
	}
}
