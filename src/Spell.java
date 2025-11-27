
public abstract class Spell {
	protected String name;
	protected int finalDamage;
	
	public Spell (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract int getFinalDamage();
	public abstract void cast();
	public abstract void applyEffect();
	
}
