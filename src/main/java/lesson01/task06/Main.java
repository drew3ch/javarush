package lesson01.task06;

public class Main {
    public static void main(String[] args) {
        String str = "Nothing";
        str = str + " ";
        str = str + "personal";
        str = str + ",";
        str = str + " ";
        str = str + "it's";
        str = str + " ";
        str = str + "just";
        str = str + " ";
        str = str + "business";
        str = str + ".";

        System.out.println(str);

        String str1 = "Число ";
        //String two = "2";
        Integer five = 5;

        System.out.println(str1 + five);

        for (int i = 1; i <= 16; i++) {
            System.out.println(i + ": Слава Роботам! Убить всех человеков!");
        }
    }
}
