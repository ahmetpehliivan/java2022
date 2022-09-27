public class Main {
    public static void main(String[] args){
        int sum = sum1(1,2,3,4,5,6,7,8,9);
        System.out.println(sum);
    }
    public static int sum1(int... numbers){
        int result = 0;
        for(int number:numbers){
            result += number;

        }
        return result;
    }
}
