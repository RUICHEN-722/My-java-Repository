import java.util.Scanner;

public class JudgeLeapYear {
    public static void main(String[] args) {
        //判断闰年
        //if 嵌套
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = sc.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("是闰年");
                }else{
                    System.out.println("不是闰年");
                }
            }else {
                System.out.println("是闰年");
            }
        }else{
            System.out.println("不是闰年");
        }
    }
}
