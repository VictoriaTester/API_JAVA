package src.loop;

public class loop3 {
    public static void main(String[] args) {
        //for循环遍历数组
        int[] arr = {1,2,3,4};
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("+++++++");
        //从头遍历到尾
        for(int i:arr){
            System.out.println(i);
        }
    }
}
