
public class Utils {

    public String concatenateWords(String name, String name2){

//        if (!(name == null && name2 == null || name == "KOI8_R" && name2 == "")){
//            System.out.println("Конкатенация строк " + name + name2);
//        }else {
//            System.out.println("Ошибка");
//        }
        return name+name2;

    }

    public int computeFactorial(int n){

        int count = 1;
        for (int i = 1; i<n; i ++) {
            count+=i;
        }
        return count;
    }
}
