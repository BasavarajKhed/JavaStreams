package filterdemos;

import java.util.ArrayList;
import java.util.List;

class Product {

	int id;
	String productNme;
	double price;

	public Product(int id, String productNme, double price) {

		this.id = id;
		this.productNme = productNme;
		this.price = price;
	}

}

public class Filterdemo4 {

	public static void main(String[] args) {

		List<Product> productList = new ArrayList();
		productList.add(new Product(1, "HP Laptop", 25000));
		productList.add(new Product(2, "Lenovo", 30000));
		productList.add(new Product(3, "Apple", 28000));
		productList.add(new Product(4, "Thinkpad", 23000));
		productList.add(new Product(5, "Dell", 90000));

		productList.stream()
		.filter(p -> p.price > 25000)
		.forEach(pr -> System.out.println(pr.price));
	}

}
