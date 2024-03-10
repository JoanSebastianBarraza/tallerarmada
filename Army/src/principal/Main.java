package principal;


import chivalry.Archer;
import chivalry.Knight;
import chivalry.Soldier;
import movements.Ambush;
import movements.Attack;
import movements.Defense;
import movements.Move;
import movements.Shoot;

public class Main {

	public static void main(String[] args) {
		Soldier soldado = new Soldier(new Attack());
		soldado.defend("Soldado");
		
		soldado.setMilitaryStrategy(new Defense());
		soldado.defend("Soldado");
		
		Archer arquero = new Archer(new Shoot());
		arquero.defend("Arquero");
		
		arquero.setMilitaryStrategy(new Move());
		arquero.defend("Arquero");
		
		Knight caballero = new Knight(new Attack());
		caballero.defend("Caballero");
		
		caballero.setMilitaryStrategy(new Ambush());
		caballero.defend("Caballero");
	}

}
