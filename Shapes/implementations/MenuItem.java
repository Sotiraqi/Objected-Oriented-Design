package shapes.implementations;


import shapes.abstractions.IExecutableAction;
import shapes.abstractions.IMenuItem;

public class MenuItem implements IMenuItem {
	
	private final String text;
	private final int shortcut;
	private final IExecutableAction actionToExec;
	
	public IExecutableAction getActionToExecute() {
        return actionToExec;
    }
    
    public MenuItem(String text, int shortCut, IExecutableAction option)
    {
        this.text = text;
        this.shortcut = shortCut;
        this.actionToExec = option;
    }

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return text;
	}

	@Override
	public int getShortcut() {
		// TODO Auto-generated method stub
		return shortcut;
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		System.out.println(""+ shortcut + ". " + text);

	}

	@Override
	public void execute() {
		if(actionToExec != null)
        {
            actionToExec.execute(new Object[]{this});
        }

	}
}
