package chap13;

public class BoxEx1 {

	public static void main(String[] args) {

		Box b = new Box();
		b.set("홍길동"); //문자열들을 object로 가질 수 있다.
		System.out.println(b.get());
		String name = (String)b.get();
		System.out.println(name);
		b.set(new Apple());
		System.out.println(b.get());
		Apple a = (Apple)b.get();
		System.out.println(a);

	}

}
