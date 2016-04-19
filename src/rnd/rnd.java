
package rnd;

import java.util.Random;

public class rnd {
   
	public void randommain() {
            
		Random rand = new Random();
 
		//случайное целое число из области значений типа int
//		int n = rand.nextInt();
//		System.out.println("Cлучайное целое число из области значений типа int: " + n);
 
		//Случайное целое число от 0 до 14
//		int n = rand.nextInt(15);
//		System.out.println("Случайное целое число от 0 до 14: " + n);
 
		//Случайное логическое значение
	//	boolean bool = rand.nextBoolean();
	//	System.out.println("Случайное логическое значение: " + bool);
 
		//Случайное число из диапазона 0.0 <= f < 1.0
	//	float f = rand.nextFloat();
	//	System.out.println("Случайное число из диапазона [0;1): " + f );
 
		//Случайное число из диапазона 0.0 <= f < 1.0
	//	double d = rand.nextDouble();
	//	System.out.println("Случайное число из диапазона [0.0;1.0): " + d );
 
		//Случайное число из диапазона 0.0 <= f < 10.0
	//	double d1 = rand.nextDouble()*10;
	//	System.out.println("Случайное число из диапазона [0.0;10.0): " + d1 );
 
//----------------------------------------------------------------------
 // Генератор случайных целых чисел в диапазоне [0 ; 100]
 //int ball = (int) (Math.random()*45+1);
 int t = (int) (Math.random()*45+1);
 //return t;
 //ball = t;
 //System.out.println("Генератор случайных целых чисел в диапазоне [0 ; 45]: " + t);
 
 // Генератор случайных чисел в диапазоне [-10.0 ; 5.0]
// double dd = Math.floor(Math.random() * 16 - 10);
// System.out.println("Генератор случайных чисел в диапазоне [-10.0 ; 5.0]: " + dd);
 
 // Генератор случайных целых чисел в диапазоне [-10 ; 5]
// int tt = (int) Math.floor(Math.random() * 16 - 10);
 // System.out.println("Генератор случайных целых чисел в диапазоне [-10 ; 5]: " + tt);
 
	}

    
}
