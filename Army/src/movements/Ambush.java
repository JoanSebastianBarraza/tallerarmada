package movements;

import interfaz.ICommand;

public class Ambush implements ICommand{
	@Override
	public void command(String movement) {
		System.out.println("Emboscada con lanza " + movement);
	}
}
