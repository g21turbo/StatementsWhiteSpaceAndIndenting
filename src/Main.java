public class Main {

    public static void main(String[] args) {

        // Statement = int myVar = 50;
        int myVar = 50;

        // Statement = myVar++;
        myVar++;

        // Statement = myVar--;
        myVar--;

        // Statement = System.out.println("This is a test");
        System.out.println("This is a test");

        /// Statement = System.out.println("This is " +
        //                "another " +
        //                "test");
        System.out.println("This is " +
                "another " +
                "test");

        // This code can be difficult to read
        int anotherVar=50;anotherVar++;System.out.println("anotherVar = " + anotherVar);

        // Adding whitespace makes code more readable
        int anotherVar2 = 50;
        anotherVar2++;
        System.out.println("anotherVar2 = " + anotherVar2);

        // Indentation
        if (anotherVar2 == 0) {
            System.out.println("It's now zero");
        }

    }
}