import java.util.ArrayList;
import java.util.Scanner;

public class MagicDuel {

	public static void createSpellBook(ArrayList<Spell> book) {
		for (int i = 0; i < 6; i++) {
			book.add(new Fireball());
		}
	}
	
	public static void createSpellBook(ArrayList<Spell> book, int fire, int lightning, int arcane) {
		for (int i = 0; i < fire; i++) {
			book.add(new Fireball());
		}
		
		for (int i = 0; i < lightning; i++) {
			book.add(new LightningBolt());
		}
		
		for (int i = 0; i < arcane; i++) {
			book.add(new ArcaneMissile());
		}
	}
	

	
	public static void main(String[] args) {
		Scanner usrInput = new Scanner(System.in);
		ArrayList<Spell> spellBook = new ArrayList<Spell>();
		int playerScore = 0;
		int computerScore = 0;
		
		System.out.println("Easy or Hard mode?");
		String difficulty = usrInput.nextLine();
		
		while (!difficulty.equalsIgnoreCase("easy") && !difficulty.equalsIgnoreCase("hard")) {
			System.out.println("Please enter a valid difficulty (easy/hard)");
			difficulty = usrInput.nextLine();
		}
		
		if (difficulty.equalsIgnoreCase("easy")) {
			createSpellBook(spellBook);
		}
		else
			createSpellBook(spellBook,2,2,2);
		
		boolean playerContinue = true;
		while (spellBook.size() > 1 && playerContinue) {
			Spell playerSpell = spellBook.remove(0);
			Spell computerSpell = spellBook.remove(0);
			
			playerSpell.cast();
			playerSpell.applyEffect();
			
			computerSpell.cast();
			computerSpell.applyEffect();
			
			if (playerSpell.getFinalDamage() > computerSpell.getFinalDamage()) {
				playerScore += 1;
				System.out.println("You hit for "+playerSpell.getFinalDamage()+" damage");
				System.out.println("You beat the dirty clanker! You now have "+playerScore+" points");
			}
		
			else if (playerSpell.getFinalDamage() < computerSpell.getFinalDamage()) {
				computerScore += 1;
				System.out.println("The clanker hit for "+computerSpell.getFinalDamage()+" damage");
				System.out.println("The clanker wins this round! It has "+computerScore+" points");
			}
			else
				System.out.println("You both got the same damage, no one gets a point");
			
			System.out.println("Do you wish to continue? (true/false)");
			playerContinue = usrInput.nextBoolean();
			
		}
		
		System.out.println("The clankers final score was "+computerScore);
		System.out.println("Your final score was "+playerScore);
		
	}

}
