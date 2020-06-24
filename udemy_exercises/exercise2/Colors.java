package exercise2;


import java.util.Arrays;

public class Colors {

    static String[] colorful(String[] strings) {
        // For the given strings, keep all the strings that begin with a color ("red", "yellow", "green", "blue", etc.) return an array of strings that start with a color.  discard all the other strings.  If no strings start with a color in the input array, return an empty array.
        return Arrays.stream(strings).filter(s -> s.startsWith("blue") || s.startsWith("red") || s.startsWith("yellow") || s.startsWith("green") ||
                s.startsWith("black") || s.startsWith("pink")).toArray(String[]::new);
//        return new String[]{};
    }

    public static void main(String[] args) {
        String[] colors = colorful(new String[]{"bluebird","red herring", "yellow bumblebee","black spider", "green monkey","pink","great gatsby","feeding frenzy","black bird","widowmaker","quran","bible","torah"});
        System.out.println("This is the Colors class");
        for(String i : colors)
            System.out.println(i);

    }

}