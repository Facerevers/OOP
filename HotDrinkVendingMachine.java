import java.util.List;
import java.util.ArrayList;
public class HotDrinkVendingMachine implements VendingMachine{
	private List<Product> productList = new ArrayList<>();
	@Override
	public void initProduct(List<Product> productList){
		this.productList = productList;
	}
	@Override
	public Product getProduct(String name, int volume, int temperature){
		for(Product item : productList)
			if(item.getName().equals(name) && ((HotDrink) item).getVolume() == volume && ((HotDrink) item).getTemperature() == temperature)
				return item;
		return null;
	}
}