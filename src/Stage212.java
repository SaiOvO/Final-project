
public class Stage212 implements Stage{
    int option;

    /**
     * {@inheritDoc}
     */
    @Override
    public void executeRoutine() {
        System.out.print("You can either attempt to (1) go back home or (2) look for shelter.\n>");// first msg here
        
        option = Game.getGame().nextInt(1, 2);
        
        if(option == 1) 
        {
            System.out.println("As you walk home it starts to rain. Lucky the walk only took you a few hours and you found a lighter in your pocket to help light "
            		+ "the way. You safely arrive home with the hare and Archie. You clean yourself and Archie adn prepare for a nights rest. In the morning you "
            		+ "find a letter from your motther inviting you back home in the big city. For lunch you hear the hare you caught and you and Archie eat the "
            		+ "best meal in a while. ");
        }
        else 
        {
        	System.out.println("You attempt to walk around to find a safe place to camp for shelter. With the lack of supplies you can't "
					+ "go far. You get so cold and your fingers turn blue. You try to sleep but its so cold you can't. Exhaustion takes over and you have no "
					+ "strength. The storm rages outside and you don't see light for many hours. You pass out and your eyes freeze shut. They never open again.");
			Game.getGame().die();
			return;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Stage getNextStage() {
        if (option == 1)
        {
        	System.exit(0);
        }
        else if (option == 2)
        {
        	System.exit(0);
        }
        return this;
    }
}

