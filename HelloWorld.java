public class HelloWorld {
    public static void main(String[] args) {
        int x = 3;
        int y = 2;
        float w = 2F;
        float z = 1F;
        float q;

        q = w / z; // Uniform mode expression

        z = x / y; // Mixed mode expression
        System.out.println("\n" + z);

        z = x / w; // Another mixed mode expression
        System.out.println(z);
    }
}