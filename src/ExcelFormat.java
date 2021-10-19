import java.util.Scanner;

public class ExcelFormat {
    public void solve(){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            arr[i] = n;
        }
        StringBuilder name = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            int no = arr[i];
            while (no > 0) {
                int r = no % 26;
                if (r == 0) {
                    name.append("Z");
                    no = (no / 26) - 1;
                } else {
                    name.append((char) ((r - 1) + 'A'));
                    no = no / 26;
                }
            }
            System.out.println(name.reverse());
            name.setLength(0);
        }
    }
}
