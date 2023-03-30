package src.operator;

public class operator3 {
	public static void main(String[] args) {
		int a=10;
		int b=5;
		System.out.println((a>b)&(a>b));
		System.out.println((a>b)&(a<b));
		System.out.println("=======");
		System.out.println((a>b)&&(a>b));
		System.out.println((a>b)&&(a<b));
		//使用单与或者双与最终的结果并不会发生变化，&&是短路与，会有一个短路效果
		//短路与或者短路或，当左边的表达式已经决定了整个逻辑运算符的结果时，那么右边不会执行，提高效率。
		System.out.println((a<b)&&(a++<b));
		System.out.println(a);
		System.out.println(b);
	}

}
