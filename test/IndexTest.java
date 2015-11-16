/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import org.junit.Test;

/**
 *
 * @author SoftwareDev
 */
public class IndexTest {
    

    @Test
    public void profileSearch() {
        List<String> listOfWords = new ArrayList<>();
        try {
            File file = new File("words.txt");
            Scanner in = new Scanner(file);

            while (in.hasNextLine()) {
                listOfWords.add(in.nextLine().trim());
            }

        } catch (IOException exc) {
            System.out.println("File does not exist");
            exc.printStackTrace();
            System.exit(1);
        }
        
        Index index = new Index();
        index.buildIndex("pg10.txt");
        List<String> value = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            for (int j=0; j<listOfWords.size(); j++)
                value = index.search(listOfWords.get(j));
            
        }
    }
    
    
}
