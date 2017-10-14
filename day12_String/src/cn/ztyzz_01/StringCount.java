package cn.ztyzz_01;
/**
 * 需求：统计给出的字符串中包含的小串的个数、
 *
 *例如 ：输入
 *		woaijavaznemuangjavaejdajavalljejava
 *		java
 *		输出
 *		4
 */
import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String search = in.nextLine();
		int index = s.indexOf(search);
		int count = 0;
//		System.out.println(s);
	

		while(s.indexOf(search,index)!=-1) {
				count++;
				index = s.indexOf(search,index) + search.length();
		}
		
		
		System.out.println(count);
		
		

	}

}
