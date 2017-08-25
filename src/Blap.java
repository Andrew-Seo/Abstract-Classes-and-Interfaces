
public class Blap implements Honk{

	soundPlayer s = new soundPlayer("Blap.wav");
	@Override
	public void honk() {
		// TODO Auto-generated method stub
		s.run();
	}

}
