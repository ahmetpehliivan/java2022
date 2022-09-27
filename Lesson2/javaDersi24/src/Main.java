public class Main {
    public static void main(String[] args){
        sayiBulmaca();
        sayiBulmaca();
    }
    public static void sayiBulmaca(){
        int[] numbers = new int[]{1,2,5,7,9,0};
        int numberToCall = 8;
        boolean isNumber = false;

        for (int number:numbers){
            if (number == numberToCall) {
                isNumber = true;
                break;
            }
        }
        if (isNumber) {
            mesajVer("Sayi mevcuttur : "+numberToCall);
        }else{
            mesajVer("Sayi mevcut değildir : "+numberToCall);
        }
    }

    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}
