package kadai_017;

public class KatoIchiro_Chapter17 extends Kato_Chapter17 {
	
	//名を表すフィールドの値をセットする
	public void setGivenName() {
		System.out.println(familyName + givenName + "です");
		System.out.println(address);
	}
	
	String givenName = "一郎";
	
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}
}