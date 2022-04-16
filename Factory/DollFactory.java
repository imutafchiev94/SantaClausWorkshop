package Factory;

public class DollFactory extends WorkshopFactory{

    @Override
    public WorkshopProduct createProduct(String productName) {
        if(productName == "Doll") 
        {
            return new Doll();
        }
        else {
            return null;
        }
    }
    
}
