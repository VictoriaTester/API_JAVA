package src.object;

public class student {
    String name;
    int age;
    public student(){
        //无参构造
    }
    public student(String name,int age){
        //有参构造
        //就近原则：首先在方法内找，能找到就用方法里面的变量
        this.name=name;
        // 改完之后代表成员变量是
        this.age=age;
    }
    public void study(){
        System.out.println("学习");
    }
    public void sleep(){
        System.out.println("睡觉");
    }

}
