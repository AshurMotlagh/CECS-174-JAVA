package Week03;

public class word_count {
    public static void main(String[] args){
        countWords("Mary had a little lamb");
    }
    static void countWords(String test){
        String [] testList = test.split(" ");
        System.out.println(testList.length);

    }
}
