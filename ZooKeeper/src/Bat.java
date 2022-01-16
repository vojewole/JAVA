
public class Bat extends Mammal{
	public int energyLevel;
	
	public Bat() {
		this.energyLevel = 300;
	}
	
	public int displayEnergy() {
		System.out.println(this.energyLevel);
		return this.energyLevel;
	}
	
	public void fly() {
		System.out.println("Swooooo!");
		this.energyLevel -= 50;
	}
	
	public void eatHumans() {
		this.energyLevel += 25;	
	}
	
	public void attackTown() {
		System.out.println("Brrwwww!");
		this.energyLevel -= 100;
	}
	
}
