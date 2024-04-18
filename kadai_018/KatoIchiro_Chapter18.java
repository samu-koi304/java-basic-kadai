package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18{

	public void setGivenName(String name) {
		givenName=name;
	}
	void eachIntroduce() {
		System.out.println("名前は"+familyName+givenName+"です");
		super.commonIntroduce();
		System.out.println("好きな食べ物はリンゴです");
		System.out.println();
	}
}
