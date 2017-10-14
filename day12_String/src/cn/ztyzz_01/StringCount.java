package cn.ztyzz_01;
/**
 * 需求：统计给出的字符串中包含的小串的个数、
 *
 *例如 ：输入
 *		woaijavaznemuangjavaejdajavalljejava
 *		java
 *		输出
 *		4
 *
 *注意:在这里我卡了好久，这么短的程序我竟然写的很罪
 *1.注意用的是search的length()，我刚开始用的竟然是s的
 *2.index的更新问题，我刚开始竟然写成了 index += search.length()
 *这虽然对，但是按照这个程序是不对的，因为index值每次只加了length()，
 *这样一定是有重复的。
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
