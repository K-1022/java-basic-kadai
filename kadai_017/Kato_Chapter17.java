package kadai_017;

abstract public class Kato_Chapter17 {
	

	String familyName; // 姓を表す
	String givenName;  // 名を表す
	String address;  // 住所を表す
    	
   //共通の紹介を出力する
	public void commonIntroduce() {
    	 familyName = "名前は加藤";
    	 address = "東京都中野区〇×です";
     }
     
	//個別の紹介を出力する
     abstract public void eachIntroduce();
     
     //紹介を実行する
     public void execIntroduce() {
    	 commonIntroduce();
    	 setGivenName();
    	 eachIntroduce();
     }
     
     public abstract void setGivenName();
    }
