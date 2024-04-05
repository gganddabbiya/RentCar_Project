package ch8.main;

import ch8.car.Car;
import ch8.member.Member;
import ch8.res.Reserve;

public class RentCarApp {
	public static void main(String[] args) {
		//회원, 차, 예약 인스턴스 생성
		Member member = new Member();
		Car car = new Car();
		Reserve reserve = new Reserve();
		
		//회원, 차 예약 정보 등록
		member.regMember("a123","1234", "gaeun", "서울시 성동구", "010-5432-1234");
		car.regCar("58오 5585", "소나타", "검정", 2000, "현대");
		reserve.resCar("20240404-001", "58오 5585", "2024-04-04", "2024-04-05", "2024-04-09");
		
		//회원정보 조회
		String memberInfo = member.viewMember();
		System.out.println(memberInfo);
		
		//렌터카 정보 조회
		String carInfo = car.checkResInfo();
		System.out.println(carInfo);
		
		//예약 정보 조회
		String resInfo = reserve.checkResInfo();
		System.out.println(resInfo);
	}

}
