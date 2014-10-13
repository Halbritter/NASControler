package de.Albritter.SSHJava.helper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

public class GetPropertyValues
{


	
	
		public  GetPropertyValues() throws IOException
		{

			Properties prop = new Properties();
			String propFileName = "config.properties";

			InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
			prop.load(inputStream);
			if (inputStream == null)
			{
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}

			Tools.out("Config file "+ propFileName+" was lodet at "+new Date(System.currentTimeMillis())+"\n");
			// get the property value and print it out
			
			ObjectRefferences.ConfigValues.user = prop.getProperty("user");
			ObjectRefferences.ConfigValues.ip = prop.getProperty("ip");
			Tools.out(ObjectRefferences.ConfigValues.ip+"\n"+ObjectRefferences.ConfigValues.user);
			

		}
	}

