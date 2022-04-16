package Observer;

import Factory.*;


public class Dwarf implements Observer {

    WorkshopFactory dollFactory;
    WorkshopFactory bicycleFactory;

    public Dwarf() {
        this.dollFactory = new DollFactory();
        this.bicycleFactory = new BicycleFactory();
    }

    @Override
    public void update(String product) {
        if(product == "Doll") {
            this.dollFactory.createProduct("Doll");
            System.out.println("Doll was made");
        }
        else if(product == "Bicycle") {
            this.bicycleFactory.createProduct("Bicycle");
            System.out.println("Bicycle was made");
        }
    }
}
