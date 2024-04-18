package kadai_021;

public class DictionaryExec extends Dictionary_Chapter21{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Dictionary_Chapter21 jisyo = new Dictionary_Chapter21();
		String[] tango= {"apple","banana","grape","orange"};
		
		for(int i=0; i<tango.length; i++) {
			jisyo.Search(tango[i]);
		}
	}

}
