package test;
//比较两个长方形的面积
public class MethodTest2 {
    public static void main(String[] args) {
//     调用方法
        double a = getArea(2, 5);
        double b = getArea(2, 4);
        compare(a, b);

    }
//    计算面积
    public static double getArea(double num1, double num2){
        double result = num1*num2;
        return result;
    }
//    比较面积
    public static void compare(double num3, double num4){
        if (num3 > num4){
            System.out.println("a > b");
        }else {
            System.out.println("a < b");
        }
    }
}
