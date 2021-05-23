package caffeeShopDemo;

public class ProductManager {
	
	public Product[] createProducts(Product[] products) {
		int i;
		for(i=0;i<products.length;i++) {
			products[i]=new Product("",0,false);
		}
		return products;
	}
	public void addProduct(Product[] products,String name,double price,boolean coffee) {
		int i=0;
		int productId=0;
		for(i=0;i<products.length;i++) {
			if(products[i].getId()==-1) {
				productId=i;
				break;
			}
		}
		
		Product product=new Product(name,price,coffee);
		product.setId(productId);
			products[productId]=product;
		
	}
	public void listProducts(Product[] products) {
		System.out.println("Ürünler :");
		for(Product product:products) {
			if(product.getId()>-1) {
				System.out.println("         "+product.getId()+" -> "+product.getName()+"( "+product.getPrice()+"TL )");
			}
		}
	}

}
