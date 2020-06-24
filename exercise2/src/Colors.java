package exercise2;

import java.util.ArrayList;

public class Colors {

    static String[] colorful(String[] strings) {
        // For the given strings, keep all the strings that begin with a color ("red", "yellow", "green",
        // "blue", etc.) return an array of strings that start with a color.  discard all the other strings.
        // If no strings start with a color in the input array, return an empty array.
        String[] testColors = {"blue", "red", "yellow", "black", "green", "pink" };
        ArrayList<String> returnedArrayList = new ArrayList<String>();
        for (String word : strings) {
            for (String color : testColors) {
                if (word.contains(color)) {
                    returnedArrayList.add(word);
                }
            }
        }
        String[] returnedArray = new String[returnedArrayList.size()];
        for (int i = 0; i < returnedArrayList.size(); i++) {
            returnedArray[i] = returnedArrayList.get(i);
        }
        return returnedArray;
    }

    public static void main(String[] args) {
        Colors code = new Colors();
        String[] modifiedWordList = code.colorful(new String[]{"bluebird","red herring", "yellow bumblebee","black spider", "green monkey","pink","great gatsby","feeding frenzy","black bird","widowmaker","quran","bible","torah"});
        System.out.println("This is the Colors class");
        for (String word : modifiedWordList) {
            System.out.println(word);
        }
    }


}