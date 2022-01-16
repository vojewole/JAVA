
public class Gorilla extends Mammal {

	public void throwThings() {
		System.out.println("The gorilla has thrown something.");
		super.energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("The gorilla is satisfied with the bananas it just ate.");
		super.energyLevel +=10;
	}
	
	public void climb() {
		System.out.println("The gorilla just climbed a tree.");
		super.energyLevel -= 10;
	}
}
