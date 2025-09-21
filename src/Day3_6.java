import java.util.Scanner;
//判断一个数字平方根区间
public class Day3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数(>=2):");
        int x = scanner.nextInt();
        if (x >= 2){
            int i = 1;
            while(true){
                if (i*i > x){
                    System.out.println("x的平方根在"+(i-1)+"和"+i+"之间");
                    break;
                }else if (i*i == x){
                    System.out.println(x+"的平方更"+"是"+i);
                    break;
                }else{
                    i++;
                }
            }
        }else {
            System.out.println("您输入的数字不合法!");
        }

    }
}
