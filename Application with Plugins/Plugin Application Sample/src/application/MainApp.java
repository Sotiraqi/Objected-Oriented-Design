package application;

import fileiowithplugins.abstractions.*;

public class MainApp {

	public static void main(String[] args) {
		PluginsManager manager = new PluginsManager();
		try
		{
			manager.loadPlugins("/plugins");
		}
		catch(Exception e)
		{
			System.out.println("Modules cannot be loaded!" + e.getMessage());
		}
		
		if (manager.getPluginsList().size() > 0)
		{
			IFileIOPlugin selectedPlugin = manager.getPluginsList().get(0);				
			
			IInputDevice inputDevice = selectedPlugin.getInputDevice();
			IOutputDevice outputDevice = selectedPlugin.getOutputDevice();;
			
			String readData = inputDevice.readString();
			outputDevice.WriteString(readData);
		}
		else
		{
			System.out.println("Doesn't exists any compatible model!");
		}
	}

}


