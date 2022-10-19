public class Main {
    public static void main(String[] args) {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (char c : reverseFullName) {
            System.out.print(c);
        }
            System.out.println();

        int n = reverseFullName.length;
        char turn;

        for (int i = 0; i < n/2; i++) {
            turn = reverseFullName[n-i-1];
            reverseFullName[n-i-1] = reverseFullName[i];
            reverseFullName[i] = turn;
        }
        for (char c : reverseFullName) {
            System.out.print(c);
        }
    }
}
