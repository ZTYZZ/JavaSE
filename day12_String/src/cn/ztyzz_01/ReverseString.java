package cn.ztyzz_01;

import java.util.Scanner;

/*
 * 需求:反转字符串
 * 例:
 * 输入:abc
 * 输出:cba
 * 
 * 相关知识:char[] toCharArray() 是产生一个新的数组，包含String的所有字符
 * 			getBytes(),有多个重载的版本，有byte[] getBytes():将String编码为byte序列，将结果存到新的byte数组里。
 * 				还有byte[] getBytes(Charset charset)上一个是使用平台默认的字符集。而这一个是指定的字符集
 * 				还有void getBytes(int begin ,int end , byte[] bys,int bysBegin)//该方法已经过时，从JDK1.1开始
 * 
 *          getChars()只有一个版本，void getChars(int begin ,int end ,byte[] bys,int bysBegin);
 *          						该方法是 从字符串的begin开始，到end-1结束，复制到bys数组的bysBegin后面去。
 *          
 *          += 和 + 是 Java中仅有的两个重载过的操作符。Java并不允许程序重载任何操作符。
 *          
 *          **1.数组类型，没有重写toString()方法,所以直接打印不会打印元素。
 */
public class ReverseString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		// 倒序遍历的两种方法
		// 第一种方法charAt()
//		for(int i = s.length()-1;i>=0;i--) {
//			System.out.print(s.charAt(i));
//		}
		//第二种方法,toCharArray();
		
//		char[] chars = s.toCharArray();
//		for(int i = chars.length-1;i>=0;i--) {
//			System.out.print(chars[i]);
//		}
		//第三种方法，拼接起来，直接输出拼接后的字符串
		String newString = "";
		for(int x = s.length()-1;x>=0;x--) {
			newString += s.charAt(x);
		}
		System.out.println(newString);
	}
}
