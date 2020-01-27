import java.util.*;
public class Lesson5_7{
	public static void main(String[] args){
		int kuku[][]=new int[9][];
		for(int i=0;i<9;i++){
			kuku[i]=new int[9];
			for(int j=0;j<9;j++){
				kuku[i][j]=(i+1)*(j+1);
			}
		}
		int row=new Scanner(System.in).nextInt();
		int col=new Scanner(System.in).nextInt();
		System.out.println(kuku[row-1][col-1]);
	}
}
