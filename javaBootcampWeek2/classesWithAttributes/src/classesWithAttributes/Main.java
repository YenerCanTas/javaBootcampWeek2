package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "laptop", "Asus Laptop", 3000, 2);
		
//		Product product = new Product();
//		product.setName("Laptop");
//		product.setId(1);
//		System.out.println(product.getName());
	//  product.setPrice(5000);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
			
			
		}

	}
