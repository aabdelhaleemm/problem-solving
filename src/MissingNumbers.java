public class MissingNumbers {
    public void count() {
        int[] array = new int[]{18, 22, 23, 31, 29, 30, 25, 33};
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        int diff = (max - min) + 1;
        System.out.println(diff - array.length);
    }
}
