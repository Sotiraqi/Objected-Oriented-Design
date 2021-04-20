package fileiowithplugins.abstractions;

public interface IFileIOPlugin {
	String getPluginName();
	IOutputDevice getOutputDevice();
	IInputDevice getInputDevice();
}
