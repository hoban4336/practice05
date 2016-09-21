package prob2;

public class Sparrow extends Bird {
	@Override
	void fly() {
		System.out.println("참새("+name+")는 날지 않습니다.");
		super.fly();
	}
	
	@Override
	void sing() {
		System.out.println("참새"+name+")가 소리내어 웁니다.");
		super.sing();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "참새의 이름은 "+name+"입니다.";
	}
	

}
