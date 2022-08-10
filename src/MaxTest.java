import java.util.LinkedList;
import java.util.Scanner;

public class MaxTest {
    public static void string1(){
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();
        
        for (int i = 0; i < string1.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string1.charAt(i));
            for (int j = i +1; j < string1.length(); j++) {
                if (string1.charAt(j) > list.getLast()) {
                    list.add(string1.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for(char chuoi : max){
            System.out.print(chuoi);
        }
        System.out.println();
    }
}
