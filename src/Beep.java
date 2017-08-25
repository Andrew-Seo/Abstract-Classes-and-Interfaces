
public class Beep implements Honk {

	soundPlayer a = new soundPlayer("Beep.mp3");
	@Override
	public void honk() {
		// TODO Auto-generated method stub
		a.run();
	}

}
