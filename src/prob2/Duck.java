package prob2;

public class Duck extends Bird {
	@Override
	void fly() {
		System.out.println("오리("+name+")는 날지 않습니다.");
		super.fly();
		
	}
	
	@Override
	void sing() {
		System.out.println("오리"+name+")가 소리내어 웁니다.");
		super.sing();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "오리의 이름은 "+name+"입니다.";
	}

	
}
