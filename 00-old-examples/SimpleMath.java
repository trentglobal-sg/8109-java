class SimpleMath {
    // the main function is the starting point of all
    // Java programs
    // - String[] args = array of strings named `args`
    public static void main(String[] args) {
        // to define a variable, we must state
        // the data type of the variable then the name
        // i.e strongly typed
        int secretOfLife = 42;
        long bigNumber = 1000000000;
        float gstRate = 0.09f; // 32-bit floating point number
        double pi = 3.14; // 64-bit floating point number (default)

        // all the arth. operators are the same in JavaScript
        System.out.println(secretOfLife + 11);
        // Java is strict about data type and will try to prevent data loss
        int x = (int)(10 * gstRate);
        System.out.println(x);

        System.out.println(addTwo(3, 4));
        System.out.println(addTwo(1.1, 2));
    }

    public static int addTwo(int x, int y) {
        return x + y;
    }
}