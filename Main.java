import java.util.ArrayList;
import java.util.List;
public class Main{
	public static void main(String[] args){
		List<Product> productList = new ArrayList<>();
		productList.add(new BottleOfWater("qwe", 123, 100));
		productList.add(new BottleOfWater("ads", 200, 150));
		productList.add(new BottleOfWater("zxcg", 500, 1000));
		productList.add(new BottleOfWater("qaffwe", 123, 10));
		BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine();
		vendingMachine.initProduct(productList);
		System.out.println(vendingMachine.getProduct("qwe"));
		productList.add(new HotDrink("wert", 100, 200, 56));
		productList.add(new HotDrink("asdf", 200, 200, 60));
		productList.add(new HotDrink("zxcv", 300, 100, 75));
		productList.add(new HotDrink("yuio", 300, 150, 90));
		HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();
		vendingMachine.initProduct(productList);
		System.out.println(vendingMachine.getProduct("wert"));
	}
	
}