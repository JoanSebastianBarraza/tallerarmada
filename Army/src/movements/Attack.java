package movements;

import interfaz.ICommand;

public class Attack implements ICommand{
@Override
public void command(String movement) {
	System.out.println("Ataque con espada del " + movement);
}
}
