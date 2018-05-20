import java.util.*;

public class InOut {

    public static String in(String quest){
        out(quest);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static void out(String str){
        System.out.print(str);
    }

}
