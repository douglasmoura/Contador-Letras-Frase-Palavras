
public class App {
    public static void main(String[] args) throws Exception {
        String exampleString = "Na minha máquina tia";

        exampleString = exampleString.trim();
        String[] newStr = exampleString.split(" ");

           
        System.out.println(newStr[newStr.length-1].length());  
 

    }
}
