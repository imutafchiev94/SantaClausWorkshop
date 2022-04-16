import Command.*;
import Observer.*;

public class Main {
    public static void main(String[] args) {
        Command needDollsCommand = new SantaClausNeedsDollsCommand();
        Command needsBicyclesCommand = new SantaClausNeedsBicyclesCommand();
        MagicBoard board = new MagicBoard();
        Observer dwarf1 = new Dwarf();
        Observer dwarf2 = new Dwarf();
        Observer dwarf3 = new Dwarf();


        board.Attach(dwarf1);
        board.Command(needDollsCommand.execute());
        board.Attach(dwarf2);
        board.Command(needsBicyclesCommand.execute());
        board.Detach(dwarf1);
        board.Command(needDollsCommand.execute());
        board.Attach(dwarf3);
        board.Command(needsBicyclesCommand.execute());
    }
}
