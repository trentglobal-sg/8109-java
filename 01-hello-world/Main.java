public class Main {
    public void sayHello() {
        System.out.println("Hello World");
    }

    // the starting point of all Java programs is the main function
    public static void main(String[] args) {
        // create an object from the Main class
        Main main1 = new Main();
        // call sayHello methond on the main1 (the object)
        main1.sayHello();
    }
}