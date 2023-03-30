package src.operator;

public class operator5 {

	public static void main(String[] args) {
		// 三元运算
		//当？前面的表达式结果为true时，返回：前面的表达式，当为false时返回：后面的表达式
		int a=10;
		int b=5;
		int max = a> 10 ?a:b;
		System.out.println(max);
		float c= 3.14f;
		float d= 3.12f;
		float e = c>d ? c*d:c+d;
		System.out.println(e);
		String i= a>b ? a + "是最大值":b+"是最大值";
		System.out.println(i);
	}

}
