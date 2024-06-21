package kadai_017;

public class KatoTaro_Chapter17 extends Kato_Chapter17 {
	
	//名を表すフィールドの値をセットする
	public void setGivenName() {
		System.out.println(familyName + givenName + "です");
		System.out.println(address);
	}
	
	String givenName = "太郎";
	
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です");
	}
}