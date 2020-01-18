package Chapter9;

public class Demo {

	public static void main(String[] args) {
		IPlayable child = new Child();
			child.play();
		IPlayable music = new Musician();
		music.play();
		IPlayable actor = new Actor();
		actor.play();
	}

}
