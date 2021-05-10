package circlePlugin;

import graphicappwithplugins.abstractions.IShape;
import graphicappwithplugins.abstractions.IShapePlugin;

public class CirclePlugin implements IShapePlugin {

	@Override
	public String getPluginName() {
		return "circle";
	}

	@Override
	public IShape getShape() {
		return new Circle();
	}

}
