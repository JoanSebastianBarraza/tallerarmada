package movements;

import interfaz.ICommand;

public class Move implements ICommand {
	@Override
	public void command(String movement) {
		System.out.println("Desplazamiento oculto del" + movement);
	}
}
