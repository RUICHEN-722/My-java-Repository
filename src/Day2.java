import java.util.Scanner;

public class Day2 {
    /*键盘录入两个数
    如果其中一个为6，最终结果输出true
    如果它们的和为6的倍数，最终结果输出true
    其他情况则为false*/
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入整数:");
        int a = sc.nextInt();
        System.out.print("请再次输入整数:");
        int b = sc.nextInt();
//短路逻辑运算符 “||”。用变量 result 接收判断值
boolean result = a == 6 || b == 6 || (a + b)%6 ==0 ;
        System.out.println(result);
//用 if-else 判断语句来输出值，拓展性更强
        if (a == 6 || b == 6 || (a + b)%6 ==0){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
