import java.io.File;
import java.io.FileWriter;
import java.util.HashSet;

public class Lotto {

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		// lotto.number(); 번호추출
		// lotto.writeNumber(); 파일

		String fileName = "C:\\devTool\\lotto.txt";

		System.out.println("로또번호"+lotto.number());

		try {
			File file = new File(fileName);
			FileWriter fw = new FileWriter(file, true);

			fw.write(lotto.number());
			fw.flush();
			fw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private String number() {


		HashSet<Integer> lotto = new HashSet<Integer>();

		for (int i = 0; lotto.size()<6; i++) {
			lotto.add((int) (Math.random() * 45) + 1);

			/*
			 * for(int j=0; i<j; j++) { if(lotto[j] == lotto[i]) { i--; break; }
			 */

			/*	for (int j = 0; j < lotto.length - 1; j++) {
				if (lotto[j] > lotto[j + 1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j + 1];
					lotto[j + 1] = temp;
				}
			}*/
		}

		return lotto.toString();
	}

}
