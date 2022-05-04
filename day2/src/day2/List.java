package day2;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		// 리스트는 배열과 비슷한 자바의 자료형으로 배열보다 편리한 기능을
		// 많이 가지고 있다.
		
		// 리스트와 배열의 가장 큰 차이는 크기가 정해져 있지 않고
		// 동적으로 변한다는 점이다. 배열은 크기가 정해져 있다.
		// 예를 들어 배열의 크기를 10개로 정했다면
		// 10개 이상의 값을 담을 수는 없다. 하지만 리스트는 크기가
		// 정해져 있지 않아 원하는 만큼의 값을 담을 수 있다.
		
		// 박찬호 선수의 투구스피드를 저장해야 한다고 가정해보자.
		// 배열을 이용하여 투구수를 정장할 수 있을까? 1회에 투구수가 3개도 될 수 있다.
		// 또는 100개도 될 수 있다.
		
		// 프로그래밍 시 크기를 알 수 있는 상황도 있지만 명확한 크기를
		// 알 수 없는 경우가 더 많다.
		// 이렇게 동적으로 자료형의 갯수가 가변하는 상황이라면
		// List를 사용하는 것이 유리하다.
		
		// *ArrayList
		
		// List 자료형 중 가장 간단한 형태의 자료형인 ArrayList에 대해서 알아보자.
		
		// List 자료형
		// List 자료형에는 ArrayList, Vector, LinkedList 등의
		// List 인터페이스를 구현한 자료형이 있다. 여기서 말하는 List 자료형은
		// 인터페이스인데 인터페이스에 대해서는 뒤에서 자세히 다루도록 한다.
		
		// * add
		// 박찬호 선수가 총 3번의 투구를 138, 129, 142(km)의 속도로 던졌다면
		// 다음과 같이 코드를 작성할 수 있다.
		
		ArrayList pitches = new ArrayList();
		pitches.add("138");
		pitches.add("129");
		pitches.add("142");
		
		// ArrayList 객체인 pitches에 add라는 메소드를 이용하여 투구 스피드를 저장했다.
		// 만약 첫번째 위치에 "133"이라는 투구 스피드를 삽입하고 싶다면
		// 아래와 같이 삽입할 위치를 파라미터로 넘겨주어야 한다.
		
		pitches.add(0, "133");
		
		// * get
		// 박찬호 선수의 2번째 투구 스피드를 출력하고 싶다면 다음과 같다.
		System.out.println(pitches.get(1));
		// ArrayList의 get메소드를 이용하면 특정 인덱스의 값을 추출할 수 있다.
		
		// * size
		// size 메소드는 ArrayList의 갯수를 리턴한다.
		System.out.println(pitches.size());
		// 위 코드로 pitches의 사이즈가 출력된다.
		
		// * contains
		// contains 메소드는 리스트 안에 해당 항목이 있는지를
		// 판별하여 그 결과를 boolean으로 리턴한다.
		System.out.println("142");
		// pitches 객체는 142 값을 포함하고 있으므로 true가 출력된다.
		
		// * remove
		// remove 메소드에는 2가지 방식이 있다.
		// 이름은 같지만 입력 파라미터가 다른 방식이다.
		// 1. remove(객체)
		// 2. remove(인덱스)
		
		// 첫번째 remove(객체)의 경우는 리스트에서 객체에 해당되는
		// 항목을 삭제하고 삭제한 결과 (true, false)를 리턴한다.
		
		System.out.println(pitches.remove("129"));
		
		// 수행 결과 == true
		
		// "129"라는 항목이 성공적으로 삭제되고 true를 리턴한다.
		// 
		
	}

}
