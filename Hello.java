public class Hello {


    // fields/properties

    // methods/ behaviors


    // Your application will start from teh "entrypoint"
    // which defaults to the main methods

    public static void main(String[] args){
        // We Have to begin with a hello world, it's a necessity, not a choice.
        System.out.println("Hello world");
        IO.println("Hello Again!");


        //numerical types
        // declare a varaible by type and name.
        // Initialize a variable by assigning a value

        // assignment operator: =
        int myint = 3; // Integer values
        double myDouble; //decimal values
        myDouble = 34.5;

        myint = 35;

        // Operators (mathematical: -, +, *, /, %)
        myint = 34 - 35;


        // Logical / comparison operators: >, <, ==, >=, <=, !=
        boolean myBool = myDouble > myint;
        // boolean can store true, False, and Null(?)

        myBool = true;
        myBool = false;

        /*
        float; //floating point decimal
        long; // BIG Integer value
        short; // small Integer values
        byte; // REALLY small integer values

        // non-numerical types
        char; // characters (letters, numbers, punctuation etc)
        String; // an Array of characters ie words, sentences, etc)
        boolean; // True/false values
        void; // seen mostly as a return type, denotes a nothing.
        null; // It's not a zero, it's an absence of value
        */

        // Control flow covers all of the keywords and functionality that allow an application
        // to make a decision, and act on it without us providing additional input

        // if, else if, else
        // switch, case
        // for, while, do-while
        // "exception handling" try, catch


        // pseudo-code - describe the logic of your plan, don't worry about the exact syntax

        // initialize a boolean

        myBool = false;

        // make a choice based on the boolean
        // If it's true
        if(myBool != true){
            IO.println("MyBool was true");
        }else{
            // if it's false, do B
            IO.println("MyBool was false");
        }

        String newString;
        newString = "Hello Everyone!";

        IO.println(newString);
        //for (iterator, expression, increment)
        for(int i = 0; i < newString.length(); i++){
            System.out.println(newString.charAt(i));
        }

    }
}
