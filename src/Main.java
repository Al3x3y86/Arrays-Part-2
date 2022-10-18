public class Main {
    public static void main(String[] args) {
        int[] arr=new int[30];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100_000 + 100_000);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int total = 0;
        for (int x : arr) total += x;
        System.out.println("Сумма трат за месяц составила " + total +" рублей.");
    }
}