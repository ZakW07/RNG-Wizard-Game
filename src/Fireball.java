import java.util.Random;
public class Fireball extends Spell {
	Random rand = new Random();
	
	public Fireball() {
		super("Fireball");
	}
	
	public void cast() {
		finalDamage = rand.nextInt(40-10+1) + 10;
	}
	
	public void applyEffect() {}
	
	public int getFinalDamage() {
		return finalDamage;
	}
}
