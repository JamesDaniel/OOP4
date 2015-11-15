

public class IndexMain {
    
    public static void main(String[] args) {
         
        String fileName = "sample.txt";  //insert name of your txt file
        Index index = new Index();
         
        index.buildIndex(fileName);
        
        index.print();  //output index
        
        System.out.println("The height of this binary tree is: " + index.height());
                
        //TO DO: Profile the search method
        
    }   
}
