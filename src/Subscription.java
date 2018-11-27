public class Subscription {
	private int price ; // subscription total price in euro-cent
	private int length ; // length of subscription in months
	
	/**
	* A constructor to create a subsription.
	*/
	public Subscription(int p, int n) {
		price = p ;
		length = n ;
	}
	/**
	* Calculate the monthly subscription price in euro,
	* rounded up to the nearest cent.
	*/
	public double pricePerMonth() {
		if (length<=0 || price<=0) return 0 ;
		double r = (double) price / (double) length ;
		double fraction = Math.IEEEremainder(r,1.0) ;
		//System.out.println("fraction= "+fraction);
		if (fraction > 0)return Math.floor(r) + 1 ;
		else return Math.floor(r) ;
	}
	
	/**
	* Call this to cancel/nulify this subscription.
	*/
	public void cancel() { length = 0 ; 
	}
	
}