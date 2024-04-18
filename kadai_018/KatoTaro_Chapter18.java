package kadai_018;

public  class KatoTaro_Chapter18 extends Kato_Chapter18{
	
	public void setGivenName(String name) {
		super.givenName=name;
	}
	void eachIntroduce() {
		System.out.println("名前は"+super.familyName+super.givenName+"です");
		super.commonIntroduce();
		System.out.println("Javaが得意です");
		System.out.println();
	}
}
