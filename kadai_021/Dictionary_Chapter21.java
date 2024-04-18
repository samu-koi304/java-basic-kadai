package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	HashMap<String,String> dictionary = new HashMap<String,String>();
	public  void Dictionary() {
		dictionary.put("apple","りんご");
		dictionary.put("peach","桃");
		dictionary.put("banana","バナナ");
		dictionary.put("lemon","レモン");
		dictionary.put("pear","梨");
		dictionary.put("kiwi","キウィ");
		dictionary.put("strawberry","いちご");
		dictionary.put("grape","ぶどう");
		dictionary.put("muscat","マスカット");
		dictionary.put("cherry","さくらんぼ");
	}
	public void Search(String name) {
		Dictionary();
		if(dictionary.get(name)!=null) {
			System.out.println(name+"の意味は"+dictionary.get(name));
		}else{
			System.out.println(name+"は辞書に存在しません");
		}
	}
}
