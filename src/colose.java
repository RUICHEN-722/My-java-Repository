import java.util.Scanner;

//辅助挑选衣服的小程序
public class colose {
    public static void main(String[] args) {
        //键盘录入身高&肩宽
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您的身高 (cm):");
        double height = sc.nextFloat();
        System.out.print("请输入您的肩宽 (cm):");
        double shoulder_width = sc.nextFloat();
        System.out.println(" \n ");
        //输出衣长的参数175
        double yichang = height*0.41;
        System.out.print("最适合您的衣长是\n\t"
                +">"+"合身:"+yichang+"  cm\n\t"
                +">"+"宽松:"+(yichang+3)+"~"+(yichang+4)+"  cm");
        System.out.println(" \n ");
        //输出衣服肩宽参数
        System.out.print("最适合您的肩宽是\n\t"
                +">"+"正肩:"+(shoulder_width+2)+"~"+(shoulder_width+3)+"  cm \n\t"
                +">"+"落肩:"+(shoulder_width+6)+"~"+(shoulder_width+8)+"  cm"  );
        System.out.println(" \n ");
        //输出胸围参数
        System.out.print("最适合您的胸围是\n\t"
                +">"+"合身:"+(shoulder_width+6)+"~"+(shoulder_width+8)+"  cm \n\t"
                +">"+"宽松:"+">"+(shoulder_width+10)+"  cm"  );
        System.out.println(" \n ");
        //输出裤长参数
        double kuchang = height * 0.55;
        System.out.println("最适合您的裤长是\n\t"
                +">"+"九分:"+kuchang+"  cm \n\t"
                +">"+"盖住鞋面:"+(kuchang+5)+"  cm\n\t"
                +">"+"拖地:"+(kuchang+10)+"  cm"  );
    }
}
