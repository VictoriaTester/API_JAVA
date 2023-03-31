package src.object;
//创建对象：格式 类名 对象名 = new 类名();
//调用属性：对象.属性名称=值
//调用方法：对象.方法名(参数）
//输出对象 打印的是地址值


public class demo {
    public static void main(String[] args) {
        // 创建对象，调用属性和方法
        student s1 = new student();
        s1.name="victoria";
        s1.age=23;
        System.out.println(s1.name);
        System.out.println(s1.age);
        s1.study();
        s1.sleep();
        System.out.println("=========");
        student s2 = new student();
        s2.name="rocky";
        s2.age=18;
        System.out.println(s2.name);
        System.out.println(s2.age);
        s2.study();
        s2.sleep();
    }
}
