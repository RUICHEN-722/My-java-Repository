import java.util.Scanner;

//for循环，判断质数
public class Day4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int number = sc.nextInt();
        boolean a = true;
        for (int i = 2;i < number;i++){
            if (number % i == 0){
              a=false;
              break;
            }
        }
        System.out.println(a);
        if (a){
            System.out.println("质数");
        }else {
            System.out.println("合数");
        }
    }
}
