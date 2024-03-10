package movements;

import interfaz.ICommand;

public class Defense implements ICommand{
@Override
public void command(String movement) {
	System.out.println("Defensa con escudo del "+ movement);
}
}
