package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		
	    int  userAge = 30;
		int serviceCost = 0;
	
		switch(userAge) {
		case 10 -> serviceCost = 1000;
		case 20 -> serviceCost = 2000;
		case 30 -> serviceCost = 3000;
		case 40 -> serviceCost = 1000;
		case 50 -> serviceCost = 1000;
		case 60 -> serviceCost = 1000;
		case 70 -> serviceCost = 1000;
		case 80 -> serviceCost = 1000;
		default -> serviceCost = 500;
		}
		System.out.println(userAge + "代の料金は" + serviceCost + "円");
	}

}
