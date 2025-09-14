import java.util.Scanner;
/*练习一
用三元运算符比较两只老虎的体重*/

public class Day2_1 {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一只老虎的体重:");
        int weight1 = sc.nextInt();
        System.out.print("请输入第二只老虎的体重:");
        int weight2 = sc.nextInt();
        //三元运算
        String result = weight1 == weight2 ? "相同" : "不同" ;
        System.out.println(result);
        System.out.println(weight1 == weight2 ? "相同" : "不同" );
    }
}

