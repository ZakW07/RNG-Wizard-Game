import java.util.Random;
public class ArcaneMissile extends Spell{
	Random rand = new Random();
	private int missileCount;
	
	public ArcaneMissile() {
		super("Arcane Missile");
	}
	
	public void cast() {
		missileCount = rand.nextInt(5) +1;
	}
	
	public void applyEffect() {
		finalDamage = 0;
		for (int i =1; i <= missileCount; i++) {
			finalDamage += rand.nextInt(10) +1;
		}
		System.out.println(missileCount+" missiles hit!");
	}
	
	public int getFinalDamage() {
		return finalDamage;
	}
}
