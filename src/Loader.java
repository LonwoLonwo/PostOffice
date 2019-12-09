import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Loader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TreeSet<String> mailSet = new TreeSet<>();

        while(true){
            System.out.println("Enter your e-mail address with \"ADD\": ");
            String str = reader.readLine();
            if(str.equals("EXIT")){
                break;
            }
            else if(str.matches("ADD\\s\\D+.+")){
                String mailAddress = str.substring(str.lastIndexOf("ADD")+4);
                if(mailAddress.matches("[a-zA-Z0-9_\\-.]+@[a-zA-Z0-9]+?\\.[a-zA-Z]{2,}")){
                    mailSet.add(mailAddress);
                }
                else{
                    System.out.println("The E-mail address is incorrect");
                }
            }
            else if(str.equals("LIST")){
                for(String s : mailSet){
                    System.out.println(s);
                }
            }
        }
        reader.close();
    }
}
