public class Main {
    public static void main(String[] args) {
        int[] arr = new int[30];
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100_000 + 100_000);
            average += arr[i] / arr.length;
            }

        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");

        }
    }
