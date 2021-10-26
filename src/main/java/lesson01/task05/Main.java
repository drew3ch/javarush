package lesson01.task05;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String amigo = "Меня зовут Амиго.";
        String thankYou = "Спасибо за щедрость, друг Риша!";
        String[] numMonth = {"первый","второй","третий","четвертый","пятый"};
        Integer salary = 0;

        System.out.println(amigo);

        for (int i = 1; i <= numMonth.length; i++){
            switch (i) {
                case 1:
                    salary = 10;
                    break;
                case 2:
                    salary = 20;
                    break;
                case 3:
                    salary = 30;
                    break;
                case 4:
                    salary = 40;
                    break;
                case 5:
                    salary = 50;
                    break;
                default:
                    break;
            };
            System.out.println("Я согласен на зарплату $" + salary + "/месяц в " + numMonth[i-1] + " год.");
        }

        System.out.println(thankYou);

        thankYou = "Поцелуй мой блестящий металлический зад!";

        System.out.println(amigo);

        for (int i = 1; i <= numMonth.length; i++){
            switch (i) {
                case 1:
                    salary = 800;
                    break;
                case 2:
                    salary = 1500;
                    break;
                case 3:
                    salary = 2200;
                    break;
                case 4:
                    salary = 2700;
                    break;
                case 5:
                    salary = 3200;
                    break;
                default:
                    break;
            };
            System.out.println("Я согласен на зарплату $" + salary + "/месяц в " + numMonth[i-1] + " год.");
        }

        System.out.println(thankYou);
    }
}
