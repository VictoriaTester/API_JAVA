package src.loop;

public class loop5 {
    public static void main(String[] args) {
        //循环控制语句
//        for(int i=1;i<=10;i++){
//            if(i==3){
//                //遇到本次循环跳过，继续下次循环
//                continue;
//            }
//        System.out.println(i);}
                for(int i=1;i<=10;i++){
            if(i==3){
                //遇到本次循环终止
                break;
            }
        System.out.println(i);}
    }
}
