//4.3

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дату в формате 'дд.мм.гггг'");
        String str = in.nextLine();
        String replstr = str.replace('.', '-');
        char[] dst = new char[10];
        replstr.getChars(6, 10, dst, 0);
        replstr.getChars(2, 6, dst, 4);
        replstr.getChars(0, 2, dst, 8);
        System.out.println(dst);
        in.close();
    }
}