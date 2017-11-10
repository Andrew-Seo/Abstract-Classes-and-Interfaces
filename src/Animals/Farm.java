package Animals;

import java.util.ArrayList;

public class Farm {

	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<>();
		farm.add(new Pig());
		farm.add(new Cow());
		farm.add(new Sheep());
		farm.add(new Horse());
		
		for (Animal a: farm) {
			a.makeNoise();
			a.eat();
		}
	}

}
