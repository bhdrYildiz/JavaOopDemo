package oopDemos;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(1,"laptop","huawei laptop",8999.99,50,"gri");
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		System.out.println("�r�n�n kodu : "+product.getKod());

	}

}
