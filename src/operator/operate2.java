package src.operator;

public class operate2 {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		//& 是一个并且的关系，遇到false则为false
		System.out.println(a > b);
		System.out.println(a< b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println((a>b)&(a>b));
		System.out.println((a>b)&(a<b));
		// ｜或 或者的意思，只要有一个真结果就为真，
	}
}
