package kadai_026;

import java.util.Scanner;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		
		Jyanken_Chapter26 jyanken=new Jyanken_Chapter26();
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner scanner=new Scanner(System.in);
		String input=scanner.next();
		jyanken.getMyChoice(input);
		
		String[] Choice= {"r","s","p"};
		int Random=(int) (Math.floor(Math.random()*3));  
		jyanken.getRandom(Choice[Random]);
		
		jyanken.playGame(jyanken.watasi, jyanken.aite);
	}

}
