package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	
		// 自分のじゃんけんの手を入力する
		public String getMyChoice() {
			Scanner scanner = new Scanner(System.in);
	while (true) { 
			System.out.println("自分のじゃんけんを入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			String rock = new String("r");
			String scissors = new String("s");
			String paper =new String("p");
			
			
			
			String input = scanner.next();
			
			System.out.println(input);
			
			
			
			if (rock.equals(input) || scissors.equals(input) || paper.equals(input) ) {
			      scanner.close();
			      return input;
			      } else {
			 System.out.println("入力が正しくありません");
			}
		}
	}
		
         // 対戦相手のじゃんけんの手を乱数で選ぶ
		public String  getRandom() {
			String[] challenger = {"r", "s", "p" };
			
			int random = (int)(Math.floor(Math.random() * 3));
			
			return challenger[random];
	}
		
		// じゃんけんを行う
		public void playGame() {
			HashMap<String,String> play = new HashMap<String,String>();
			
			play.put("r","グー");
			play.put("s","チョキ");
			play.put("p","パー");
			
			String me = this.getMyChoice();
			String you = this.getRandom();
			
			System.out.println("自分の手は," + play.get(me) + "相手の手は" +  play.get(you));
			
			if ((me.equals("r") && you.equals("s")) || (me.equals("s") && you.equals("p"))
					|| (me.equals("p") && you.equals("r"))) {
				System.out.println("あなたの勝ちです");
			}
		
			if ((me.equals("r") && you.equals("p")) || (me.equals("s") && you.equals("r"))
					|| (me.equals("p") && you.equals("s"))) {
				System.out.println("あなたの負けです");
			}
			if ((me.equals("r") && you.equals("r")) || (me.equals("s") && you.equals("s"))
					|| (me.equals("p") && you.equals("p"))) {
				System.err.println("あいこです");
			}

		}


}


