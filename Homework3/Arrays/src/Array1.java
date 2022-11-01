public class Array1 {
    public static void main(String[] args) {
        int [] arr = new int [4];
        for (int i: arr) {
            arr[i] = (int) ((Math.random() * (100 - 10)) + 10);
            System.out.print(arr[i] + ", ");
        }
        System.out.println("");
        boolean vozr = true;
        for (int i=0; i< arr.length-1; i++) {
            if (arr[i] > arr [i+1]) {
                vozr = false;
                break;
            }
        }
        if (vozr) System.out.println("Массив является строго возрастающей последовательностью");
        else System.out.println("Массив не является строго возрастающей последовательностью");
    }
}
