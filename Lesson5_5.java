import java.util.*;
public class Lesson5_5{
	public static void main(String[] args){
		int num=new Scanner(System.in).nextInt();
		int[] binary=new int[16];
		for(int i=15;i>=0;i--,num/=2){
			binary[i]=num%2;
		}
		System.out.print("[");
		for(int i:binary){
			System.out.print(i);
		}
		System.out.println("]");
	}
}
