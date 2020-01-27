import java.util.*;
public class Lesson5_3{
	public static void main(String[] args){
		int[] nums=new int[10];//10個数値が入る配列を作る
		
		//配列の長さ分の数値入力を求める
		for(int i=0;i<nums.length;i++){
			nums[i]=new Scanner(System.in).nextInt();
		}
		
		//偶数を求める計算式
		System.out.print("偶数は");
		for(int i=0;i<nums.length;i++){
			if(nums[i]%2==0){//2で割り切れたら偶数である
				System.out.print(nums[i]+" ");//スペース
			}
		}
		System.out.println();//改行する
		
		//奇数を求める計算式
		System.out.print("奇数は");
		for(int i=0;i<nums.length;i++){
			if(nums[i]%2!=0){//2で割り切れなかったら奇数である
				System.out.print(nums[i]+" ");//スペース
			}
		}
		System.out.println();//改行する
	}
}
