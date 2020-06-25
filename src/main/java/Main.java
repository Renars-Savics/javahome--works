import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
                                                   //task 1
        TimeConverter.millisecondsToSeconds(500); //enter milliseconds here

        String str1 =("Hello hello hello hello hello World!");        //task 2
        System.out.println("Task 2: \nOriginal string: Hello hello hello hello hello World! \nSpaces will be substituted with " + "-");
        System.out.println("New String: " + str1.replace(' ', '-'));

        System.out.println("Task 3:");  //task 3
        ArrayList<String> objectives1 = new ArrayList<String>();
        objectives1.add("1) Catch all Pokemon!");
        objectives1.add("2) Go to gym");
        objectives1.add("3) Burn neighbour's car!");
        objectives1.forEach(System.out::println);


    }
}
