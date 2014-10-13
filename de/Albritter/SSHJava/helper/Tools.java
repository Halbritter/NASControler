package de.Albritter.SSHJava.helper;

import java.net.URL;
import java.util.Date;

public class Tools
{

	public static String clearIP(String IPv4)
	{

		String IPString = IPv4;
		IPString = IPString.trim().toLowerCase();
		System.out.println("will loop for " + Names.Values.REMOV_CHARACTER_LIST.length + " times");
		for (int j = 0; j != Names.Values.TLD_LIST.length; j++)
		{
			if (IPString.contains(Names.Values.TLD_LIST[j]))
			{
				System.out.print(".");
			}
		}
		for (int i = 0; i != Names.Values.REMOV_CHARACTER_LIST.length; i++)
		{
			System.out.println(Names.Values.REMOV_CHARACTER_LIST[i]);
		}

		return IPv4;

	}

	public static void out(Date s)
	{
		System.out.print(s);
	}

	public static void out(String s)
	{
		System.out.print(s);
	}
	public static void out(URL s)
	{
		System.out.print(s);
	}
}
