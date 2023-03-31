package src.function;

public class function2 {
    public static void main(String[] args) {
        //方法重载
        int a=10;
        int b=5;
        int sum1=add(a,b);
        System.out.println(sum1);
        double c =1.0;
        double d =3.1;
        double sum2=add(c,d);
        System.out.println(sum2);
    }

    public static int add(int a,int b){
        return a+b;
    }
    public static double add(double a,double b){
        return a+b;
    }
}
