package shoppingcar;
import java.util.ArrayList;
import java.util.Iterator;

public class ShoppingCart {
	
	private ArrayList items;    
	
	public ShoppingCart() {
		items = new ArrayList();
	}   
	
	//計算購物車中目前物品價錢
	public double getBalance() {
		double balance = 0.00;
		for (Iterator i = items.iterator(); i.hasNext();) {
			Product item = (Product)i.next();
			balance += item.getPrice();
		} 	
		return balance;
	}
	
	//在購物車加入購買物品
	public void addItem(Product item) {
		items.add(item);
	}  
	
	//在購物車移出物品
	public void removeItem(Product item) throws ProductNotFoundException {
		if (!items.remove(item)) {
			throw new ProductNotFoundException();
		}
	} 
	
	//取得目前購物車中物品的數量
	public int getItemCount() {
		return items.size();
	}
	
	//清空購物車
	public void empty() {
		items.clear();
	}    


}
