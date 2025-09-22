package test;
//方法的重载
public class MethodTest3 {
    public static void main(String[] args) {
        /*需求：使用方法重载的思想，设计比较两个整数是否相同的方法
        要求：兼容全整数类型（byte， short, int, long）
         */

//        调用
//        compare(10, 20);

//        compare((byte)10,(byte)20);
          byte b1 = 10;
          byte b2 = 20;
          compare(b1, b2);
    }

    public static void compare(byte b1, byte b2){
        System.out.println("byte");
        System.out.println(b1 == b2);
    }
    public static void compare(short s1, short s2){
        System.out.println("short");
        System.out.println(s1 == s2);
    }
    public static void compare(int n1, int n2){
        System.out.println("int");
        System.out.println(n1 == n2);
    }
    public static void compare(long g1, long g2){
        System.out.println("long");
        System.out.println(g1 == g2);
    }


}
