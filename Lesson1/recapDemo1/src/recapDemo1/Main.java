package recapDemo1;

public class Main {

	public static void main(String[] args) {
	int number1 = 30;
	int number2 = 20;
	int number3 = 10;
	
	if (number1>=number2 && number1>=number3) {
		System.out.println("En buyuk sayi : "+ number1);
	} else if(number2>number1 && number2>number3) {
		System.out.println("En buyuk sayi : "+ number2);
	}else {
		System.out.println("En buyuk sayi : "+ number3);
	}
	

	}

}
