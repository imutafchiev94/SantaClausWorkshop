package Factory;

public abstract class WorkshopFactory {

    public abstract WorkshopProduct createProduct(String ProductName);

    public WorkshopProduct produceProduct(String productName) {
		WorkshopProduct product = createProduct(productName);
		return product;
	}
}