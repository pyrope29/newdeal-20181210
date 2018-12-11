package lotto;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		Lotto lotto = new Lotto();

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
		TreeSet<Integer> lotto = new TreeSet<Integer>();

		for (int i = 0; lotto.size()<6; i++) {  
			int lottoNum = (int) ((Math.random() * 45) + 1);
			lotto.add(lottoNum);
		}
		return lotto.toString();
	}
}
