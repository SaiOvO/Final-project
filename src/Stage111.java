
public class Stage111 implements Stage {
	int option;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void executeRoutine() {
		System.out.println("On your way to the hunting grounds you watch Archie start to chase after a butterfly. You follow Archie through the"
				+ " woods into a clearing. Its filled with green grass with flowers of all colors. On the trees grow fresh fruits. You pick a few "
				+ "and place them into your bag. A small bird lands on your shoulder and starts to whistle a small tune your mother used to sing "
				+ "before you selpt. The sun starts to set adn you remembered the day before you set some snare traps and if you don't check them today,"
				+ " they will be taken by animals. Do you (1) head home or (2) go check your snare traps for animals? ");// first msg here
		
		option = Game.getGame().nextInt(1, 2);
		
		if(option == 1) 
		{
			System.out.println("no");
		}
		else 
		{
			// option 2 stuff
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Stage getNextStage() {
		if (option == 1)
		{
			
		}
		else if (option == 2)
		{
			
		}
		return this;
	}
}

