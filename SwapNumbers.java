public class SwapNumbers {

    public static void main(String[] args) {

        // set some demo numbers
        float first = 1.20f, second = 2.45f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        float temporary = first;
        first = second;

        // Value of temporary (which contains the initial value of first) is assigned to second
        second = temporary;

        // print out the results
        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}
