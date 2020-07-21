import java.util.*;

public class Main {
    public static void main(String[] args) {
        //task 1
        TimeConverter.millisecondsToSeconds(500); //enter milliseconds here

        String strOne = ("Hello hello hello hello hello World!");        //task 2
        System.out.println("Task 2: \nOriginal string: Hello hello hello hello hello World! \nSpaces will be substituted with " + "-");
        System.out.println("New String: " + strOne.replace(' ', '-'));

        System.out.println("Task 3:");  //task 3
        ArrayList<String> objectives = new ArrayList<>();
        objectives.add("1) Catch all Pokemon!");
        objectives.add("2) Go to gym");
        objectives.add("3) Burn neighbour's car!");
        objectives.forEach(System.out::println);

        //Second Homework
        String text = "What's everyone think of SMD? It seems more and more boutique builds are going that route, and with more parts only be available in SMD form, I wonder how long before it'll be hard to get quality parts in through-hole packages. All that to say, here's a simple etch-able SMD layout of the AMZ Mini Booster.";
        String textMod = (text.replaceAll("[?!,-.']", ""));
        String[] words = textMod.split(" ");
        System.out.println("\nWord count is: " + words.length);
        System.out.println(textMod.toLowerCase());


        Map<String, Integer> UniqueWords = new HashMap<>();
        for (String word : words){
            int previous = 0;
            if (UniqueWords.get(word) != null)
            previous = UniqueWords.get(word);
            UniqueWords.put(word, previous + 1);
        }
        System.out.println(UniqueWords);




    }
}








