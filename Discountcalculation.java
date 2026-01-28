package quvitaskfor;

public class Discountcalculation {
	
	public static void main(String[] args) {
		
		double purchaseamount =1200;
		double discount;
		double finalamount;
		
		if(purchaseamount<500) {
			discount=0;
		}else if(purchaseamount >= 500 && purchaseamount <= 1000) {
			discount= purchaseamount * 0.10;
		}else {
			discount = purchaseamount *0.20;
		}
	
	  finalamount = purchaseamount-discount;
	
	  System.out.println("Purchase Amount :" +purchaseamount);
	  System.out.println("Discount        :" +discount);
	  System.out.println("Final Amount    :" +finalamount);
	  
	}
	
	

}
