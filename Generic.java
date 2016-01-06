
public class Generic {
//하나로 다양한 타입을 다루는 것 (Int, String, Double 등) => 상속과 다형성으로 
/* 상속
 * Computer (man,proc,ram,disk,procSeed) 이고, Notebook이 Computer를 상속
 * -> Notebook extends Computer & 생성자에 super(man,proc,ram,disk,procSeed) //생성자내 첫 문장
 *                                -> 생성자가 있으면 자동으로 빈 생성자 생성 안함
 *                                -> super명시 되지도, 빈 생성자도 없으면 에러 (주의!)
 * if(Computer tmp = new Notebook()) 이면, tmp.toString() 시, Notebook의 toString이 실행 (동적바인딩)
*/
	
	public static void main(String[] args) {
		
		//autoboxing : 정수 -> Integer 객체로
		//Stack theStack = new Stack();
 		//theStack.push(10);
 		
 		//unboxing : Integer 객체 -> 정수
 		//int a = (Integer)theStack.pop();
	}

	//equals 오버라이딩 틀  => 내용은 내가 사용할 것에 맞춰서
	@Override
	public boolean equals(Object obj){
		//같은 객체다
		if(this.getClass() == obj.getClass())
			return true;
		return false;
	}
}
