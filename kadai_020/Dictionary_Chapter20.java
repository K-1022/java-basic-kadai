package kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {
	
	public void seachArray(String[] words) {
		HashMap<String,String> fruitsDic = new HashMap<String,String>();
		fruitsDic.put("apple","りんご");
		fruitsDic.put("peach","桃");
		fruitsDic.put("banana","バナナ");
		fruitsDic.put("lemon","レモン");
		fruitsDic.put("pear","梨");
		fruitsDic.put("kiwi","キウイ");
		fruitsDic.put("strawberry","いちご");
		fruitsDic.put("grape","ぶどう");
		fruitsDic.put("muscat","マスカット");
		fruitsDic.put("cherry","さくらんぼ");

		for( int i = 0; i < words.length; i++) {
			 if (fruitsDic.containsKey(words[i])) {
				 System.out.println(words[i] + "の意味は" + fruitsDic.get(words[i]));
		        } else {
		            System.out.println(words[i] + "は辞書に存在しません");
		        }
			 }
		}
	}
	
		
		 