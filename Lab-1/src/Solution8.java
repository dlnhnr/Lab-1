import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Solution8 {

	public static void main(String[] args) throws IOException {

		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

		FileReader fr = new FileReader("C:\\\\Users\\\\DylanHenry\\\\OneDrive - Xpanxion\\\\Desktop\\\\the_prince_quotes.txt");
		BufferedReader br = new BufferedReader(fr);

		String str = br.readLine().toLowerCase();

		String[] words = str.split(" ");

		for (String word : words) {
			Integer num = hashMap.get(word);

			if (num == null) {
				hashMap.put(word, 1);
			} else {
				hashMap.put(word, num + 1);
			}
		}
		br.close();

		System.out.println(hashMap);
	}
}
