package loop;
import java.util.Scanner;


public class MakeStarPyramid {
	 public static void main(String[] args) {
	        System.out.printf("별 갯수를 입력하세요");
	        int num = Integer.parseInt(new Scanner(System.in).next());
	        new MakeStarPyramid().getStar(num);
	    }
	 
	private void getStar(int num) {
		for(int i=0; i<=num; i++) {
			for(int j=0; j<i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}

	}
}
