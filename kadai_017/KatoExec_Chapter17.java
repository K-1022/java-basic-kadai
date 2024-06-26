package kadai_017;

public class KatoExec_Chapter17 {

	public static void main(String[] args) {
		
		//各子クラスのインスタンス作成
		KatoTaro_Chapter17 taro = new KatoTaro_Chapter17();
		KatoIchiro_Chapter17 ichiro = new KatoIchiro_Chapter17();
		KatoHanako_Chapter17 hanako = new KatoHanako_Chapter17();
		
		//呼び出し
		taro.setGivenName();  
		ichiro.setGivenName();
		hanako.setGivenName();
		
		var katoFamily = new Kato_Chapter17[] {taro, ichiro, hanako};
		for (var kato: katoFamily) {
			kato.execIntroduce();
		}
	}

}
