package weeks.week_07;

public class methodPassByValueExamples {
    public static void main(String[] args) {
        boolean degerPositifmi = false;
        isNumberPositive(10);
        System.out.println(degerPositifmi);


        if(true){
            int a = 20;
        }else{
            int a = 40;
        }
    }

    public static boolean isNumberPositive(int num){
        if(num > 0){
            return true;
        }else{
            return false;
        }
    }


}
