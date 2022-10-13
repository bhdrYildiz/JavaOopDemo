package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{

	//Sadece ve sadece db eriþim kodlarý buraya yazýlýr..Sql
	public void add(Product product) {
		System.out.println("Jdbc ile Veri tabanýna eklendi");
	}
	
}
