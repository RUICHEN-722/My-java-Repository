//练习二
// 运用三元运算，选出三人中最高的身高
public class Day2_2 {
    public static void main(String[] args) {
         int height1 = 150;
         int height2 = 210;
         int height3 = 165;
         //三元运算
        int result = height1 > height2 ? height1 : height2;
        int result1 = result > height3 ? result : height3;
        //打印结果
        System.out.println(result);
        System.out.println(result1);

        
    }
}
