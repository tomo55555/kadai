import java.util.*;
public class Lesson5_3{
	public static void main(String[] args){
		int[] nums=new int[10];
		for(int i=0;i<nums.length;i++){
			nums[i]=new Scanner(System.in).nextInt();
		}
		System.out.print("偶数は");
		for(int i=0;i<nums.length;i++){
			if(nums[i] %2==0){
				System.out.print(nums[i]+" ");
			}
		}
		System.out.println();
		System.out.print("奇数は");
		for(int i=0;i<nums.length;i++){
			if(nums[i] %2!=0){
				System.out.print(nums[i]+" ");
			}
		}
		System.out.println();
	}
}
