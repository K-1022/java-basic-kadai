package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		
		int userAge = 30;
		int serviceCost = 0;
		if (userAge < 20) {
			serviceCost = 1000;
		} else if (userAge < 30) {
			serviceCost = 2000;
		}  else if (userAge < 50) {
			serviceCost = 3000;
		}  else if (userAge < 80) {
			serviceCost = 4000;
		} else if (userAge < 90) {
			serviceCost = 5000;
		} else {
			serviceCost = 500;
		}
		System.out.println(userAge + "代の年代は" + serviceCost + "円");
	}

}
