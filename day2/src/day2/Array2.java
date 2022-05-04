package day2;

public class Array2 {
	public static void main(String[] args) {
		
		// * 배열의 값은 어떻게 접근할 수 있을까?
		
		// 위에서 만든 요일의 배열 중 "목"에 해당되는 값을 얻으려면 다음과 같이
		// 인덱싱을 이용해야 한다.
		
		String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
		System.out.println(weeks[3]);
		
		// weeks[3]은 wekks 배열의 4번째 항목을 의미한다.(자바는 배열의 숫자를 0부터 센다.)
		
		// * 배열의 길이
		// 배열은 보통 for문과 함께 사용된다. for문에 배열이 사용될 경우 
		// 배열의 길이만큼 for문을 돌리는 것이 중요한데 배열의 길이는 다음과 같이
		// length를 이용하여 구한다.
		
		for (int i = 0; i<weeks.length; i++) {
			System.out.println(weeks[i]);
		}
		
		// weeks 배열을 순서대로 출력하는 프로그램이다. length를 어떻게 사용했는지
		// 눈여겨 보도록 하자.
		
		// * 빈번한 배열의 오류
		
		// 아마 여러분이 자바 코드를 작성하면서 보게 될 가장 많은 오류 중의 하나는 바로
		// 다음의 오류일 것이다.
		
		// ArrayIndexOutOfBoundsException
		
		// 다음의 예처럼 요일 배열의 길이는 총 7개인데
		// 만약 8번째 값을 얻으려고 시도하면 이와같은 오류가 발생한다.
		
		System.out.println(weeks[7]);
	}

}
