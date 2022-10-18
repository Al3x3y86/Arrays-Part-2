import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr=new int[30];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100_000 + 100_000);
            }
        int min, max = min = arr[0];

        System.out.println(Arrays.toString(arr));

        for (int i : arr) {
            min = Math.min(min,i);
            max = Math.max(max,i);
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
    }
}