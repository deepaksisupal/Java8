package boilerplate.implementations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import boilerplate.interfaces.BufferedReaderProcessor;

public class ReadData {
	public static void main(String[] args) throws IOException {
		String oneLine = processFile((BufferedReader br) -> br.readLine());
		System.out.println(oneLine);

		String everything = processFile((BufferedReader br) -> {
			StringBuilder everythingBuilder = new StringBuilder();
			String line;
			while ((line = br.readLine()) != null) {
				everythingBuilder.append(line);
				everythingBuilder.append(" ");
			}
			return everythingBuilder.toString();
		});
		System.out.println(everything);
	}

	public static String processFile(BufferedReaderProcessor brp) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new FileReader("D:/Java/Java8Git/Java8Fearures/src/boilerplate/data/data.txt"))) {
			return brp.process(br);
		}
	}

}
