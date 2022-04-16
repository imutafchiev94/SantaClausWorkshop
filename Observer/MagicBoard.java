package Observer;

import java.util.ArrayList;

public class MagicBoard implements Observable {
    

    private ArrayList<Observer> observers;
    private String productToCreate;

    public MagicBoard() {
        observers = new ArrayList<Observer>();
    }

    

    @Override
    public void Attach(Observer o) {
        observers.add(o);
        
    }

    @Override
    public void Detach(Observer o) {
        observers.remove(o);
        
    }

    @Override
    public void Notify() {
       for (int i = 0; i < observers.size(); i++) {
           observers.get(i).update(this.productToCreate);
       }
        
    }

    public void Command (String command) {
        if(command == "I need dolls")
        {
            productToCreate = "Doll";
            this.Notify();
        }
        else if(command == "I need bicycles")
        {
            productToCreate = "Bicycle";
            this.Notify();
        }

        else {
            productToCreate = "Nothing";
            this.Notify();
        }
    }

}
