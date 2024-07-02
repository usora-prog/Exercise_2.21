//4.1.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = in.nextLine();
        System.out.println("Введите подстроку");
        String podstr = in.nextLine();
        int count = 0;
        int i = 0;
        while (i < str.length()){
            if(str.regionMatches(i, podstr, 0, podstr.length())){
                count += 1;
            }
            i += 1;
        }
        System.out.println("Подстрока '" + podstr + "' встречается " + count + " раза");
        in.close();
    }
}