
public class Stage212 implements Stage{
    int option;

    /**
     * {@inheritDoc}
     */
    @Override
    public void executeRoutine() {
        System.out.println();// first msg here
        
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

