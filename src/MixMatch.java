public class MixMatch {
    public static void main(String[] args){
        // Data types and descriptions
        //string
        String varString = "Hello"; 
        System.out.println(varString + " <-String, stores a collection of characters such as words or sentences.");

        //char
        char varChar = 'A';
        System.out.println( varChar + " <-Char, stores a single character or an ASCII value.");

        //short
        short varShort = 20000;
        System.out.println( varShort + " <-Short, stores whole numbers between -32,768 to +32,767.");

        //int
        int varInt = 75;

        //long
        long varLong = 850000;
        //two variables in a single line
        System.out.printf("%s <-Integer, stores whole numbers from -2,147,483,648 to 2,147,483,647. \n%s <-Long, stores whole numbers -26^63 and +26^63 -1.\n", varInt, varLong);

        //float
        float varFloat = 1.85f;

        //double
        double varDouble = 3.33333;

        //boolean
        boolean varBoolean = true;
        System.out.printf("%s <-Float, stores floating-point numbers +-3.4*10^-38 and +-3.4*10^38 and is accurate to 7 decimal places. \n%s <-Double, stores floating-point numbers +-1.7*10^-308 and +-1.7*10^308. \n%s <-Boolean, store either one of the following two values (true or false).\n", varFloat, varDouble, varBoolean);

    }
}