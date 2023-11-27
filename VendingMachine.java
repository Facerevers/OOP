import java.util.list;
import java.util.ArrayList;

public interface VendingMachine{
	public void initProduct(List<Product> productList);
	public Product getProduct(String name);
}