
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class IndexMain {

    public static void main(String[] args) {

        String fileName = "sample.txt";  //insert name of your txt file
        Index index = new Index();

        index.buildIndex(fileName);

        index.print();  //output index
//
//        System.out.println("The height of this binary tree is: " + index.height());

        //TO DO: Profile the search method
        
    }
    public static void profileSearchOnXwithY(List<String> listOfWords, String wordsToIndex, int reps) {
        Index index = new Index();
        index.buildIndex(wordsToIndex);
        List<String> value = new ArrayList<>();
        for (int i = 0; i < reps; i++) {
            for (int j=0; j<listOfWords.size(); j++)
                value = index.search(listOfWords.get(j));
            
        }

    }

}
