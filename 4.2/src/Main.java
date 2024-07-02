//4.2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = in.nextLine();
        String replstr1 = str.replace("кака", "вырезано цензурой");
        String replstr2 = replstr1.replace("бяка", "вырезано цензурой");

        System.out.println(replstr2);
        in.close();
    }
}