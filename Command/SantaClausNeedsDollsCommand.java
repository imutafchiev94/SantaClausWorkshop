package Command;

public class SantaClausNeedsDollsCommand implements Command {

    private SantaClaus santaClaus;

    public SantaClausNeedsDollsCommand() {
        this.santaClaus = new SantaClaus();
    }

    @Override
    public String execute() {
       return this.santaClaus.needDolls();
    }
    
}
