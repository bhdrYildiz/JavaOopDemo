package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{

	//Sadece ve sadece db eri�im kodlar� buraya yaz�l�r..Sql
	public void add(Product product) {
		System.out.println("Jdbc ile Veri taban�na eklendi");
	}
	
}
