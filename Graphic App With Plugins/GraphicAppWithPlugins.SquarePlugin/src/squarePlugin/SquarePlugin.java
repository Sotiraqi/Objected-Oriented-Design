package squarePlugin;

import graphicappwithplugins.abstractions.IShape;
import graphicappwithplugins.abstractions.IShapePlugin;

public class SquarePlugin implements IShapePlugin {

	@Override
	public String getPluginName() {
		return "square";
	}

	@Override
	public IShape getShape() {
		return new Square();
	}

}
