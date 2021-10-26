package lesson01.task01;

import java.util.ArrayList;

public class names {

    private String name1 = "Виталий";
    private String name2 = "Петр";
    private String name3 = "Максим";
    private ArrayList<String> arrayNames = new ArrayList<>();

    private void addNames(){
        arrayNames.add(name1);
        arrayNames.add(name2);
        arrayNames.add(name3);
    }

    void getNames(){
        addNames();
        for (String name: arrayNames){
            System.out.println(name);
        }
    }
}