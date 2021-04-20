package standardfileioplugin;

import fileiowithplugins.abstractions.IFileIOPlugin;
import fileiowithplugins.abstractions.IInputDevice;
import fileiowithplugins.abstractions.IOutputDevice;


public class StandardFileIOPlugin implements IFileIOPlugin {

	@Override
	public String getPluginName() {
		// TODO Auto-generated method stub
		return "fileIOplugin";
	}
	
	@Override
	public IInputDevice getInputDevice() {
		// TODO Auto-generated method stub
		return new FileInputDevice();
	}

	@Override
	public IOutputDevice getOutputDevice() {
		// TODO Auto-generated method stub
		return new FileOutputDevice();
	}

	

}
