package src.loop;

public class loop4 {
    public static void main(String[] args) {
        //嵌套循环打印4行5列的星星
//        for(int i=1; i<=4;i++ ){
//            System.out.println("*****");
//        }
//        System.out.print("*");
        //外层循环，外层循环执行一次，里层循环执行全部
                for(int i=1; i<=4;i++ ){
                    for(int j=1; j<=5;j++ ){
                        System.out.print("*");
                    }
                    System.out.println();
        }
    }
}
