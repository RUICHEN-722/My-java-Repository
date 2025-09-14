import java.util.Scanner;

public class Level_Division {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入你的得分(取整):");
        int grad = sc.nextInt();
        if (grad >= 90){
            System.out.println("优秀");
        } else if (grad >= 80 ) {
            System.out.println("良好");
        } else if (grad >= 60 ) {
            System.out.println("合格");
        }else {
            System.out.println("不合格");
        }
    }
}
