import java.util.*;
public class Lesson5_2{
	public static void main(String[] args){
		int[] nums=new int[10];
		for(int i=0;i<nums.length;i++){
			nums[i]=new Scanner(System.in).nextInt();
		}
		for(int i=nums.length-1;i>=0;i--){
			System.out.println(nums[i]);
		}
	}
}
