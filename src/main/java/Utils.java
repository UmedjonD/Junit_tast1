
public class Utils {

    public String concatenateWords(String name, String name2){

        return name+name2;

    }

    public int computeFactorial(int n){

        int count = 1;
        for (int i = 1; i<=n; i ++) {
            count = count * i;
        }
        return count;
    }

}
