package chivalry;

import interfaz.ICommand;


public class Archer{
	private ICommand militaryStrategy;

    public Archer(ICommand militaryStrategy) {
        this.militaryStrategy = militaryStrategy;
    }

    public void setMilitaryStrategy(ICommand militaryStrategy) {
        this.militaryStrategy = militaryStrategy;
    }

    public void defend(String movement) {
        militaryStrategy.command(movement);
    }
}
