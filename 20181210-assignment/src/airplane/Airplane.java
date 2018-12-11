package airplane;


public class Airplane {
	int count;
	
	public static void main(String[] args) {
		
		/*우리 회사는 비행기를 주문 제작 판매 하는 회사입니다
		우리 회사는 비행기를 생산하는 설계도를 작성하려고 합니다
		요구사항
		1. 비행기를 생산하고 비행기의 이름과 번호를 부여해야 합니다
		2. 비행기가 생산되면 정보(비행기이름, 번호)를 확인할수 있어여 합니다
		3. 생산자는  현재까지 만들어진 비행기를 총 대수 (누적) 를 확인 할수 있습니다*/
		
		Airplane airplain = new Airplane();
		System.out.println(airplain.makeAirplaneName() + " 번호 : "+ airplain.makeAirplaneNum());
	}
	
	private String makeAirplaneName(){
		
		return "호 비행기";
	}
	
	private int makeAirplaneNum(){
		return 0;
	}

	private int count() {
		return count++;
	}

}
