package prob1;

public class Sort {
	public static void main(String[] arg) {
		int array[] = { 5, 9, 3, 8, 60, 20, 1 };
		int temp = 0;
		int count = array.length;

		System.out.println("Before sort.");

		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}

		//
		// 선택 정렬 알고리즘이 적용된 코드를 여기에 작성합니다.
		//
		for (int i = count; i >= 0; i--) {
			for (int j = 0; j < i-1; j++) {
				temp = array[j];
				if (compare(array[j], array[j + 1]) > 0) {
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}

			}
		}

		System.out.println("\nAfter Sort.");

		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static int compare(int i, int j) {
		if (i > j) {
			return -1;
		} else {
			return 1; // swap 실행
		}
	}
}
