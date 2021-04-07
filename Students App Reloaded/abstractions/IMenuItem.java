package reutilisablemenu.abstractions;

public interface IMenuItem {
	
	String getText();
	int getShortcut();
	void render();
	void execute();

}
