package kadai_014;

public class Car_Chapter14 {

		// フィールド　
	    private int gear = 1;  // 1速から5速のギアを表す
		private int speed = 10; // ギアチェンジ後の速度を表す
		private int previousGear = 1; // 切り替え前のギアの値
		
	   // コンストラクタ
		public Car_Chapter14( int gear, int speed) {
			this.gear = gear;
			this.speed = speed;
			
		}
		
		public int getGear() {
	        return this.gear;
		}
		
		public int getSpeed() {
	        return this.speed;
	    }
		
		
	// メソッド
	public void gearChange (int afterGear) {
			this.gear=afterGear;
			// ギアの値により速度を変える
			this.speed = switch(this.gear) {
			case 1 -> 10;
			case 2 -> 20;
			case 3 -> 30;
			case 4 -> 40;
			case 5 -> 50;
			default -> 10;
			};
	}
	// ギアチェンジ後の速度を表示する
	public void run() {
		System.out.println("ギア" + this.previousGear + "から" + this.getGear() + "に切り替えました");
		System.out.println("速度は時速" + this.getSpeed() + "kmです");
		
	}
}
		


	


