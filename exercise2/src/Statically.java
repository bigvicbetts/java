package exercise2;

public class Statically {
    //Once you have finished getting statistically.js to run, refactor the code here in Java.
    static private String glue = "Epoxy";
    String jello = "Jello";

    static String getGlue() {
        return glue;
    }

    static void moveAndShake() {
        System.out.println("Never stagnate in life.  Be agile, change, and improve...");
    }

    static void stubborn() {
        moveAndShake();
        System.out.println("Please don't make me change... I just don't like it...");
    }

    static void explain() {
        stubborn();
        System.out.println(getGlue());
    }

    public static void main(String[] args) {

        Statically stat = new Statically();

        // I know that all the explicit calls to the class are not necessary below.  I just put them
        // there to keep this file as similar to the the .js file as possible.

        Statically.moveAndShake();
        Statically.stubborn();
        Statically.explain();

        System.out.println(Statically.getGlue());
        System.out.println(stat.jello);

    }
}
