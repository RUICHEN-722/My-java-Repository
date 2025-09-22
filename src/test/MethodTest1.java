package test;

public class MethodTest1 {
    public static void main(String[] args) {
       getLength(1.2, 3.5);
       getArea(3.5);
    }
    //求长方形的周长
    public static void getLength(double len, double width){
        double length = (len + width)*2;
        System.out.println("长方形的面积为:"+ length);
    }
    //求圆的面积
    public static void getArea(double r){
        double result = r*r*3.14;
        System.out.println("圆的面积为:" + result);
    }
}
