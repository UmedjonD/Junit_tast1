public class App {

    public static void main(String[] args) {

        System.out.println("Метод №1");
        Utils utils1 = new Utils();
        String str = utils1.concatenateWords("Umedjon","Davlatov");
        System.out.println(str);

        System.out.println("Метод №2");
        Utils utils2 = new Utils();
        int fac = utils2.computeFactorial(4);
        System.out.println(fac);

    }
}
