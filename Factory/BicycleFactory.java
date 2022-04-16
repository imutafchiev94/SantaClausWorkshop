package Factory;

public class BicycleFactory extends WorkshopFactory{

    @Override
    public WorkshopProduct createProduct(String productName) {
        if(productName == "Bicycle")
        {
            return new Bicycle();
        }
        else
        {

            return null;
        }
    }
    
}
