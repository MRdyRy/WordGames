package WordGames;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class WordGenerator {

    public WordGenerator() {
    }
    
    public static List<WordModel> createQuestionInCollection() {
        List<WordModel> bankSoal = new ArrayList<>();
        try {
            Scanner scan = new Scanner(new File("E:/SoalWordGame.txt"));
            while (scan.hasNextLine()) {
                String datas = scan.nextLine();
                String[] result = datas.split(",");
                String soal = result[0].trim();
                String hint = result[1].trim();
                bankSoal.add(new WordModel(soal, hint));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return bankSoal;
    }

}
