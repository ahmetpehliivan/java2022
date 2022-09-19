package recapDemo2;

public class Main {

	public static void main(String[] args) {
		
		double[] myList = {5.2,6.8,27.2,89.18};
		double total = 0;
		double max = myList[0];
		
		for(double numbers:myList) {
			if(max<numbers) {
				max = numbers;
			}
			
			total = total+numbers;
			System.out.println(numbers);
		}
		
		System.out.println("Sayilarin toplamı = "+total);
		System.out.println("En büyük sayi = "+max);
	}
}
