package FreeSpaces;

public class Example5_3 {

    public static  void main(String [] args){
        String str = "COMPUTER SIENCE IS DYNAMIC SIENCE";
        String substr = "IS";
        int count;
        count = countSpace(str);
        System.out.println("String is " + str);
        System.out.println("Number of blanks is " + count);
        count = substringCount(str,substr);
        System.out.println("******");
        System.out.println("String is " + str);
        System.out.println("SubString is " + substr);
        System.out.println("subSTring " + count  + "times ins str");

    }

    public static int countSpace(String s){
        int count = 0 ;
        int index = s.indexOf(' ');
        while (index >= 0){
            count++;
            index = s.indexOf(' ', index + 1);
        }
        return count;
    }
    public static int substringCount(String s , String substring){
        int count = 0 ;
        int index = s.indexOf(substring);
        while(index >= 0 ){
            count++;
            index = s.indexOf(substring , index + 1);
        }
        return count;
    }
}
