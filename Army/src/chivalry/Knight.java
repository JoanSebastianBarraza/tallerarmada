package chivalry;

import interfaz.ICommand;


public class Knight{
	private ICommand militaryStrategy;

    public Knight(ICommand militaryStrategy) {
        this.militaryStrategy = militaryStrategy;
    }

    public void setMilitaryStrategy(ICommand militaryStrategy) {
        this.militaryStrategy = militaryStrategy;
    }

    public void defend(String movement) {
        militaryStrategy.command(movement);
    }
}
