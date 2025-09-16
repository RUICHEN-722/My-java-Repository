import java.util.Scanner;

public class Day3_1 {
//    求和1~100偶数和
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
//     输入两个数，查找范围内有效数字（既能被3整除又能被5整除）
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        int start = scanner.nextInt();
        System.out.println("请输入一个数字:");
        int end = scanner.nextInt();
        for (int i = start; i <= end ; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
