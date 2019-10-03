import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int count = 1;
        String st = "";
        int k = 1;
        System.out.print("Enter Initial String : ");
        String str = s.nextLine();
        char[] c =new char[str.length()];
        c = str.toCharArray();
        for (int i = 0 ; i<str.length();i++){
            if ((c[i] == 'a') || (c[i] == 'e') || (c[i] == 'i') || (c[i] == 'o') || (c[i] == 'u') || (c[i] == 'A') || (c[i] == 'E') || (c[i] == 'I') || (c[i] == 'O') || (c[i] == 'U')) {
                if ((count-(3*i)-k)%3 == 0){
                    c[i]='*';
                    count++;
                    k=0;
                }
                else if ((count%3 != 0) && (count%2 == 0 || (count-2)%3 == 0)){
                    c[i]='^';
                    count++;
                }
                else if (count%3 == 0){
                    c[i]='!';
                    count++;
                }
                k = 1;
            }
        }
        for (int i = 0;i<str.length(); i++){
            st += c[i];
        }
        System.out.println(st);
    }
}
