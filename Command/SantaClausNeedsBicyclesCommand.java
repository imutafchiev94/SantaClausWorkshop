package Command;

public class SantaClausNeedsBicyclesCommand implements Command {

    private SantaClaus santaClaus;

    public SantaClausNeedsBicyclesCommand() {
        this.santaClaus = new SantaClaus();
    }

    @Override
    public String execute() {
        return this.santaClaus.needBicycles();
    }
    
}
