public class Day3 {
//    for循环练习1
    public static void main(String[] args) {
//     1.  循环的变量不能定义在循环里面，变量只在所属的大括号中生效果
//     2。 如果定义在里面只在本次循环中生效
//         第二次循环开始时又会重新定义一个新的变量
        int  a = 0;
        for (int i = 1; i < 6; i++) {
            System.out.println("正在重连"+i+"/5");
            a = a + i;
        }
        System.out.println(a);
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
    }
}

