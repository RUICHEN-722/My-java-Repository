public class Day3_5 {
//    循环语句练习，逢“7”过（数字中如果含有7则跳过，是7的倍数也要跳过）
     public static void main(String[] args) {
/*while循环
          int i = 1;
          int count = 0;
          while(i <= 100){
               int ge = i%10;
               int shi = i/10%10;
               if(ge == 7 || shi == 7 || i%7 == 0){
                    count++;
                    System.out.println(i);
               }
               i++;
          }
          System.out.println("符合条件的数有:"+count);

*/
//for循环
         for (int i = 1; i <= 100; i++) {
             if (i % 10 == 7 || i /10%10 == 7 || i%7 == 0){
                 System.out.println("pass:"+i);
                  continue;
             }
             System.out.println(i);
         }
     }
}
