
public class Stage111 implements Stage {
	int option;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void executeRoutine() {
		System.out.print("On your way to the hunting grounds you watch Archie start to chase after a butterfly. You follow Archie through the"
				+ " woods into a clearing. Its filled with green grass with flowers of all colors. On the trees grow fresh \nfruits. You pick a few "
				+ "and place them into your bag. A small bird lands on your shoulder and starts to whistle a small tune your mother used to sing "
				+ "before you slept. The sun starts to set and you remembered \nthe day before you set some snare traps and if you don't check them today,"
				+ " they will be taken by animals. Do you (1) head home or (2) go check your snare traps for animals? \n>");
		
		option = Game.getGame().nextInt(1, 2);
		
		if(option == 1) 
		{
			System.out.println("You decide to head home. On your way Archie get tired and so you stop to get water by the lake again. You slash the water on"
					+ " your face as you watch Archie drink water as well. He seems to just grow more tired and \ntired. He starts to look ill as you continue to "
					+ "walk home. Once you enter your house, Archie goes to lay on his bed.\n");
			if(!Game.coinflip2()) {
				System.out.println("Something in your head starts to pound. You feel a sudden urge to throw up and run to the restroom. As you throw up and look"
						+ " into the toliet, you see just a pure black substance and a few maggots swimming in the \ntoliet. You need to clear your head and so "
						+ "go to get an apple from your bag. You open the bag to find every fruit you had just picked all rotten with more maggots crawling "
						+ "everywhere. You hear Archie cry out in pain and go to sit with him. You both stay there until you feel another urge to vomit."
						+ " Finally you close your eyes with Archie on your lap as you both fall asleep, never to wake again.");
				Game.getGame().die();
				System.exit(0);
			}
			System.out.println("You feel your stomach hurt and think that maybe the fresh fruit will help. You walk over to the fruit to find that they have"
					+ " all rotted with maggots sitting in your bag. You feel the urge to vomit from the sight \nand the pain from your stomach. You go to vomit outside"
					+ " and see its all black with bugs grawling around. You realise that the only thing that could be effecting you would be the orb. You go to"
					+ " get orb when \nand see despite being around the fruit and bugs, it still shines beautifully.\n");
			if (!Game.coinflip2()) {
				System.out.println("You can't bring yourself to get rid of the beautiful ord. You stare into it as you feel it draw in your eyes. You hear voices "
						+ "all around you but the sound far but so loud in your head. It over all the voices there's one that stands out more than all the"
						+ " others and tells you to kill all life around you. You don't know why but as you kill Archie, it feels so nice and helps that pain in "
						+ "your stomach ease. This goes on for days as anyone who comes to the forst never returns and only stories are left that anyone"
						+ " who enters the forest will be sacrificed to the demon that kills anything and everything.");
				Game.getGame().die();
				return;
			}
			System.out.println("You don't know if you should break it or what. You hear Archie start to growl from the other side of the room. He lunges at you, "
					+ "tearing off a chunk of flesh. He's eyes glow red with hunger, anger, bloodlust. Out of fear of your life you pull out your knife and hold "
					+ "it out before you for defence. You close your eyes and looks away. You feel Archies teeth dig into your shoulder and feel his body press "
					+ "agaist the knife. You feel the warm blood on your body. You go to burry his body and see the orb. Out of anger you throw it agaist the ground"
					+ " and shatter it. Your life is now forever cursed with the memories that play in your mind everyday, but despite that, you have great fortune in"
					+ " the years to come. Nothing can ever take place of your beloved friend.");
			System.exit(0);
		}
		else //option 2
		{
			System.out.println("You to check your snare trap. All the traps have been set off but not a single one has anything inside of them. Your stomache starts to "
					+ "turn as you fall the ground in pain. You start to run home as best as you could with Archie helping by pushung you. Both you and Archie collapse "
					+ "at the door steps of the house.");
			if (!Game.coinflip2()) {
				System.out.println("Your arm starts to burn as you see a red rash forming fast. your legs boil as they blister. You writhe in pain before everything "
						+ "goes quiet and white. Finally free from the curse, the only cure was death and it seems luck was not on your side.");
				Game.getGame().die();
				return;
			}
			System.out.println("You remember the orb and go reach into your bag to retreive the orb. The fruits in the bag are now rotten and you have to move the mushy"
					+ "fruit to find the ord. It shines and voices tell you to help it as bloodlust fills your head. You are able to push the orb out of your mind and "
					+ "you smash it on the ground. Suddenly all pain in your stomach subsides and Archie starts to bark. He starts to chew at his bone as he lays on his"
					+ " bed. You go back to your backpack to see that all the fruits have been restored back to their bright and ripe selves. You look back to the orb "
					+ "shattered on the ground and in the setting sun, you see the female ghost again. However this time she is wearing a beautiful white dress and her "
					+ "long hair flows and glistens in the setting sun. She thanks you for releasing her from the prison of the orb. You live your life with ease and for "
					+ "some reason extreme luck, is always on your side.");
			System.exit(0);
			
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

