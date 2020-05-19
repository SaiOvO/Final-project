
public class Stage111 implements Stage {
	int option;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void executeRoutine() {
		System.out.print("On your way to the hunting grounds you watch Archie start to chase after a butterfly. You follow Archie through the"
				+ " woods into a clearing. Its filled with green grass with flowers of all colors. On the trees grow fresh fruits. You pick a few "
				+ "and place them into your bag. A small bird lands on your shoulder and starts to whistle a small tune your mother used to sing "
				+ "before you slept. The sun starts to set and you remembered the day before you set some snare traps and if you don't check them today,"
				+ " they will be taken by animals. Do you (1) head home or (2) go check your snare traps for animals? \n>");
		
		option = Game.getGame().nextInt(1, 2);
		
		if(option == 1) 
		{
			System.out.println("You decide to head home. On your way Archie get tired and so you stop to get water by the lake again. You slash the water on"
					+ " your face as you watch Archie drink water as well. He seems to just grow more tired and tired. He starts to look ill as you continue to "
					+ "walk home. Once you enter your house, Archie goes to lay on his bed.");
			if(!Game.coinflip2()) {
				System.out.println("Something in your head starts to pound. You feel a sudden urge to throw up and run to the restroom. As you throw up and look"
						+ " into the toliet, you see just a pure black substance and a few maggots swimming in the toliet. You need to clear your head and so "
						+ "go to get an apple from your bag. You open the bag to find every fruit you had just picked all rotten with more maggots crawling "
						+ "everywhere. You hear Archie cry out in pain and go to sit with him. You both stay there until you feel another urge to vomit."
						+ " Finally you close your eyes with Archie on your lap as you both fall asleep, never to wake again.");
				Game.getGame().die();
			}
			System.out.println("You feel your stomach hurt and think that maybe teh fresh fruit will help. You walk over to the fruit to find that they have"
					+ " all rotted with maggots sitting in your bag. You feel the urge to vomit from the sight and teh pain from your stomach. You go to vomit outside"
					+ " and see its all black with bugs grawling around. You realise that the only thing that could be effecting you would be the orb. You go to"
					+ " get orb when and see despite being around the fruit and bugs, it still shines beautifully.\n");
			if (!Game.coinflip2()) {
				System.out.println("You can't bring your");
			}
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

