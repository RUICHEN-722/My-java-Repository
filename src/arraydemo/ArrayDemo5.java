package arraydemo;

public class ArrayDemo5 {
    public static void main(String[] args) {
        String[][] arr = new String[3][2];
        arr[0][0] = "历史读物";
        arr[1][0] = "经济读物";
        arr[1][1] = "现代科学读物";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println( );
        }

    }
}
