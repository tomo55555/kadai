import java.util.*;
public class Lesson5_8{
	public static void main(String[] args){
		int[] nums=new int[10];//10個の数値が入る配列を作る
		
		//配列の長さの分だけ、数値入力を要求
		for(int i=0;i<nums.length;i++){
			nums[i]=new Scanner(System.in).nextInt();
		}
		//変数iの右隣りを表す変数jを作り、もし変数iのの値の方が変数jの値より大きければ、お互いの順番を入れ替える
		for(int i=0;i<nums.length-1;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i]>nums[j]){
					int temp=nums[i];//いったん変数tempに変数iを代入し、
					nums[i]=nums[j];//からっぽになった変数iに変数jを代入し、
					nums[j]=temp;//最後に変数jに変数tempの値を代入すると、iとjの値が入れ替わる
				}
			}
		}
		System.out.println(Arrays.toString(nums));//配列の内容を文字列で出力する
	}
}
