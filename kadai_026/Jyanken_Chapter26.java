package kadai_026;

import java.util.HashMap;

public class Jyanken_Chapter26 {
	String watasi="";
	String aite="";
	
	public String getMyChoice(String My) {
		return watasi=My;
	}
	public String getRandom(String Random) {
		return aite=Random;
	}
	public void playGame(String key1,String key2) {
		
		HashMap<String,String> jyankenMap=new HashMap<String,String>();
		jyankenMap.put("r","グー");
		jyankenMap.put("s", "チョキ");
		jyankenMap.put("p", "パー");
		
		System.out.println("自分の手は"+jyankenMap.get(watasi)+",対戦相手の手は"+jyankenMap.get(aite));
		if(key1.equals(key2)) {
				System.out.println("あいこ");
		}else if((key1.equals("r") && key2.equals("s")) || (key1.equals("s")
				&&key2.equals("p")) || (key1.equals("p") && key2.equals("r"))) {
				System.out.println("自分の勝ちです");
		}else {
				System.out.println("自分の負けです");
		}
	}
}
