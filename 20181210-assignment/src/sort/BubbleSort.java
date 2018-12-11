package sort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		BubbleSort bs = new BubbleSort();
		bs.input();
	}

	private void input() {
		Scanner scan = new Scanner(System.in);

		int[] list= new int[10];
		System.out.printf("1부터 10까지 중복되지 않는 정수를 입력하세요");
		for(int i=0; i<10; i++) {	

			list[i]=Integer.parseInt(scan.nextLine());

			if(1>list[i] || list[i]>10) {

				System.out.println("잘못 입력하셨습니다");
				return;
			} else {

				for(int j=0; j<i; j++) {
					if(list[j]==list[i]) {
						System.out.println("중복된 값을 입력하셨습니다");
						return;
					}
				}
			} 
		}
		for(int i = 0; i < list.length; i++) {
			for(int j=i+1; j < list.length; j++) {
				if(list[i]>list[j]) {
					int temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(list));
	}
}
