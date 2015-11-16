import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
 * Class to build an index.
*/
public class Index {

    // Properties
    /** Map for storing the index. */
    private BinarySearchTreeMap<String, List<Integer>> treeMapIndex;
    //private Map<String, List<Integer>> treeMapIndex;
           
    // Methods
    public Index() {
        treeMapIndex = new BinarySearchTreeMap<>();
        //treeMapIndex = new TreeMap<>();
    }

    public void buildIndex(String fileName) {
        int lineNum = 0;
        try {
            File inputFile = new File(fileName);
            Scanner in = new Scanner(inputFile);

            String line;
            String words[];

            while (in.hasNextLine()) {
                lineNum++; 
                //read a line
                line = in.nextLine();

                // parse line into words
                // the character pattern that separates words is any sequence of
                // characters other than letters, numbers and apostrophe
                // This strips off punctuation marks
                words = line.split("[^A-Za-z0-9']+");

                //add words and line number to index
                for (String word : words) {
                    List list = treeMapIndex.get(word);
                    if (list == null) {
                        list = new LinkedList<>();
                        list.add(lineNum);
                        treeMapIndex.put(word, list);
                    } else {
                        list.add(lineNum);
                    }
                }
            }
            //System.out.println(treeMapIndex.size());
        } catch (IOException exc) {
            System.out.println("File does not exist");
            exc.printStackTrace();
            System.exit(1);
        }
    }
        
    /** For TreeMap implementation : Displays the index, one word per line. */
//    public void print() {
//        // iterate through all entries
//        Set<Map.Entry<String, List<Integer>>> entries = treeMapIndex.entrySet();
//        Iterator iter = entries.iterator();
//        while (iter.hasNext()) {
//            Map.Entry<String, List<Integer>> entry = (Map.Entry<String, List<Integer>>) (iter.next());  //Map.Entry is an inner interface
//            String key = entry.getKey();
//            List value = entry.getValue();
//            System.out.println("key: " + key + ",value: " + value);
//        }
//    }
    
    /** For BinarySearchTreeMap implementation : Displays the index, one word per line. */
    public void print (){
        treeMapIndex.print();
    }
    
    public int height(){
        return treeMapIndex.height();
    }
            
    public List search(String s){
        
        List value = treeMapIndex.get(s);
        return value;
    }
}