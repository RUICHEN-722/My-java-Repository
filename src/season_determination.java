import java.util.Scanner;
//switch 语句 判断季节
public class season_determination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入月份:");
        int month = sc.nextInt();

        //先判断月份是否合法
        if (month > 12 || month <= 0){
            System.out.println("输入的数字不合法");
        }else{
             switch (month){
                 case 3:
                 case 4:
                 case 5:
                     System.out.println(">>>"+ month +"月是春季");
                     break;
                 case 6:
                 case 7:
                 case 8:
                     System.out.println(">>>"+ month +"月是夏季");
                     break;
                 case 9:
                 case 10:
                 case 11:
                     System.out.println(">>>"+ month +"月是秋季");
                     break;
                 case 12:
                 case 1:
                 case 2:
                     System.out.println(">>>"+ month +"月是冬季");
                     break;
            }
        }
    }
}
