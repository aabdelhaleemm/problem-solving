import java.util.Scanner;

public class infinitesequare {
    public void cal(){
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int[] arr = new int[q];
        for (int i = 0; i < q; i++) {
            int z = scan.nextInt();
            arr[i] = z;
        }
        int[] result = new int[q];
        for (int k = 0; k < arr.length; k++) {
            int current = arr[k];
            int sum = current * current;
            int counter = 1;
            for (int i = current - 1; i > 0; i--) {
                sum += i * (current - counter);
                counter += 1;
            }
            result[k] = sum;
        }
        for (int i : result) {
            System.out.println(i);
        }
    }
}
