import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class lab8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть текст : ");
        String[] text = new String[70];
        String[] result = new String[70];

        for (int i = 0; i < 70; i++) {
            text[i] = sc.next();
            result[i] = new
                    StringBuffer(text[i]).reverse().toString();
            if ((text[i].compareTo(result[i])) == 0)
                System.out.println(result[i]);
        }
    }}