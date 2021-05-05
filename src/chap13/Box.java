package chap13;

class Apple {
}

public class Box {
	private Object obj; // 어떤 데이터가 올 지 모르니깐 object로 변수 선언

	public void set(Object obj) {
		this.obj = obj;
	}

	public Object get() {
		return obj;
	}
}
