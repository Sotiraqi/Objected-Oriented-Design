package trianglePlugin;

import graphicappwithplugins.abstractions.IShape;
import graphicappwithplugins.abstractions.IShapePlugin;

public class TrianglePlugin implements IShapePlugin {

	@Override
	public String getPluginName() {
		return "triangle";
	}

	@Override
	public IShape getShape() {
		return new Triangle();
	}

}
