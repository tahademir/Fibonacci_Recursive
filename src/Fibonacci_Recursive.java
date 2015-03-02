import java.util.Scanner;


public class Fibonacci_Recursive {
	public static long Fibonacci(long sayi){
		if((sayi == 0) || (sayi == 1))
			return sayi;  	
		else
			return Fibonacci(sayi-1) + Fibonacci(sayi-2);
	}

	public static void main(String[] args) {
		System.out.println("Bulunması istediğiniz fibonacci sayısını giriniz : ");
		Scanner sayi = new Scanner(System.in);
		int girilenSayi=sayi.nextInt();
		long baslangicZamani = System.nanoTime();
		for(int i = 0 ; i<girilenSayi ; i++){
			System.out.println("\n"+Fibonacci(i));
		}
		long endTime = System.nanoTime();					//hesaplamayı bitiren kod
		long estimatedTime = endTime - baslangicZamani; 	// Geçen süreyi nanosaniye cinsinden elde ediyoruz
		double seconds = (double)estimatedTime/1000000000;  // saniyeye çevirmek için 1000000000'e bölüyoruz.
		System.out.println("\n"+seconds);

	}

}
