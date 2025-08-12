public class TestVariables {
    public static void main(String[] args) {
        String name = "Chris";
        int age = 46;
        int m = 1;
        float x = 0.5f;
        int c = 15;
        float y;
        y = m * x + c;
        boolean isRaining = true;
        boolean happy = true;

        System.out.println(m + " * " + x + " + " + c + " = " + y);
        System.out.println(name + " age is " + age);

        System.out.println(isRaining || happy);
        System.out.println(isRaining || !happy);
        System.out.println(!isRaining || happy);
        System.out.println(!isRaining || !happy);
    }
}
