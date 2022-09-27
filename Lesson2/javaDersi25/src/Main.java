public class Main {
    public static void main(String[] args){
        String message = "Bugün hava çok güzel.";
        String newMessage = getCity();
        System.out.println(newMessage);
        //int sayi = sum(5,7);
        System.out.println(sum(5,7));
    }

    public static String getCity(){
        return "Ankara";
    }
    public static int sum(int a,int b){
        return a+b;
    }
}
