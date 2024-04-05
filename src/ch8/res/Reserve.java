package ch8.res;

public class Reserve {
	String resNumber;
	String resCarNumber;
	String resDate;
	String useBeginDate;
	String useEndDate;
	
	//생성자
	public Reserve() {
		
	}
	public Reserve(String _resNumber,String _resCarNumber,String _resDate,String _useBeginDate,String _useEndDate) {
		resNumber = _resNumber;
		resCarNumber = _resCarNumber;
		resDate = _resDate;
		useBeginDate = _useBeginDate;
		useEndDate = _useEndDate;	
	}
	
	//차 예약 정보 조회 기능
	public String checkResInfo() {
		System.out.println("\n차 예약 정보를 조회합니다");
		System.out.println("-----------------------------------");
		String resInfo = "예약 번호: " + resNumber
				+"\n예약 차 번호: " + resCarNumber 
				+"\n예약 일자: " + resDate 
				+"\n차 사용 시작 일자: " + useBeginDate 
				+"\n차 반납 예정 일자: " + useEndDate;
		
		return resInfo;
	}
	
	//차 예약 기능
	public void resCar(String _resNumber,String _resCarNumber,String _resDate,String _useBeginDate,String _useEndDate) {
		System.out.println("차 예약 정보를 등록합니다.");
		resCarNumber = _resCarNumber;
		resDate = _resDate;
		useBeginDate = _useBeginDate;
		useEndDate = _useEndDate;

	}
	
	//차 예약 정보 수정 기능
	public void modResInfo() {
		System.out.println("\n차 예약 정보를 수정합니다.");
	}
	
	//차 예약 취소 기능
	public void cancelResInfo() {
		System.out.println("\nck 예약을 취소합니다.");
	}
}
