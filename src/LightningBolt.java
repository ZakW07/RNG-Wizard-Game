import java.util.Random;
public class LightningBolt extends Spell {
	Random rand = new Random();
	
	public LightningBolt() {
		super("Lightning Bolt");
	}
	
	public void cast() {
		finalDamage = rand.nextInt(100) + 1;
	}
	
	public void applyEffect() {
		if (finalDamage%2 == 0) {
			finalDamage /=2;
			System.out.println("The spell's power was halved!");
		}
		else
			System.out.println("The spell hits at full power!");
	}
	
	public int getFinalDamage() {
		return finalDamage;
	}
}
