public class Day3_3 {
//    判断回文数（正序倒序都一样的数字）
//    把数字从个位拆解，在倒起来组装，和原来的数字比较
public static void main(String[] args) {
    int a = 121;
//  temp 记录a的初始值，a进入循环后值会发生改变
    int temp = a;
    int num = 0;
    while(a != 0){
//      用%来获取个位数的值
       int ge = a % 10;
//       “/10”会自动忽略小数点后的数字，以获取后位数字
       a = a /10;
//       用“*10”来拓展个位数字
       num = num*10 + ge;
    }
    System.out.println("a:"+temp);
    System.out.println("num:"+num);
    System.out.println(" ");
    if(num == temp){
        System.out.println(temp + "是回文数");
    }
}
}
