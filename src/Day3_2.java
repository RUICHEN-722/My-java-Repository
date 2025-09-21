public class Day3_2 {
//    计算0.1毫米的纸张折叠多少次能达到珠峰高度（8844.43m）
    public static void main(String[] args) {
        double i = 0.1;
        int count =0;
        int height = 8844430;
        while(i <= height){
            i *= 2;
            count++;
        }
        System.out.println(count);
    }
}
