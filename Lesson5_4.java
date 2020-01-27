import java.util.*;
public class Lesson5_4{
	public static void main(String[] args){
		int[] nums=new int[10];
		for(int i=0,sum=0;i<nums.length && sum<=100;i++){
			nums[i]=new Scanner(System.in).nextInt();
			sum+=nums[i];
		}
		for(int j:nums){
			if(j !=0){
				System.out.println(j);
			}
		}
	}
}
