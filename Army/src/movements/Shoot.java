package movements;

import interfaz.ICommand;

public class Shoot implements ICommand{
@Override
public void command(String movement) {
	System.out.println("Ataque de flecha del " + movement);
}
}
