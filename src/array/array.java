package src.array;

public class array {

	public static void main(String[] args) {
		// 数据类型[] 数组名 = {值1，值2，值3...} 数据内容初始化
		int[] arr= {1,2,3,4};
		System.out.println(arr);
		// 数据类型[] 数组名 = new 数据类型[数组长度] 数据内容是取默认值
		int[] arr2= new int[5];
		System.out.println("======");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		arr2[0]=11;
		arr2[1]=22;
		System.out.println(arr2[0]);
		System.out.println(arr2.length);
	}

}
