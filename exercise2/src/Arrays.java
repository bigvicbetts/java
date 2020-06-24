package exercise2;

class Arrays {
    //Take the arrays.js file, and refactor the code into Java in this file.
    static int[] nums = {10,23,3,4,5,2,1};
    static String[] greetings = {"hello","howdy","hallo","hola","bonjour","ciao","أهلا"};;
    static int[] binaries = {0,1,1,1,0,0,0,1,1,1,1,1,0,1,0,0,1,0};

    static void printNums() {
        for (int num : nums) {
            System.out.println(num);
        }
    };

    static void printGreetings() {
        for (String greeting : greetings) {
            System.out.println(greeting);
        }
    };

    static void printBinaries() {
        boolean[] newBoolean = new boolean[binaries.length];
        for (int i = 0; i < binaries.length; i++) {
            if (binaries[i] == 0) {
                newBoolean[i] = false;
            }
            else {
                newBoolean[i] = true;
            }
        }
        for (boolean bool : newBoolean) {
            System.out.println(bool);
        }
    };

    public static void main(String[] args) {
        printNums();
        printGreetings();
        printBinaries();
    }
}







