package chivalry;


import interfaz.ICommand;

public class Soldier{
	private ICommand militaryStrategy;

    public Soldier(ICommand militaryStrategy) {
        this.militaryStrategy = militaryStrategy;
    }

    public void setMilitaryStrategy(ICommand militaryStrategy) {
        this.militaryStrategy = militaryStrategy;
    }

    public void defend(String movement) {
        militaryStrategy.command(movement);
    }

}



