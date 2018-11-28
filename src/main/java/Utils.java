
public class Utils {

    public String concatenateWords(String name, String name2){

        return name+name2;

    }

    public int computeFactorial(int n){

        int count = 1;

        if (n < 0){
            System.out.println("Чувак меньше нулья нельзя ");
        }
        if (n == 0) {
            System.out.println("Ну зачем ты так а ? ");
        }
        if (n > 1){
            for (int i = 1; i<=n; i ++) {
                count = count * i;
            }
        }
        return count;
    }
}
