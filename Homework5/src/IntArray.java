public class IntArray {
    private int[] array;

    public void IntArray(){
        array = new int[10];
    }

    public void IntArray (int a){
        array = new int[a];
    }

    public void IntArray (int[] array){
        setArray(array);
    }

    public void sort (int i){
        if (i > 0){
            sort1();
        } else sort2();
    }

    private void sort1(){
        for (int i = 0; i < getArray().length; i++) {
            for ( int j = 0; j < getArray().length - i - 1; j++){
                if (array[j] > array[j+1]){
                    int t = array [j];
                    array[j] = array[j+1];
                    array [j+1] = t;
                }
            }
        }
    }

    private void sort2(){
        for (int i = getArray().length - 1; i > 0; i--) {
            for ( int j = getArray().length - i - 1; j > 0; j--){
                if (array[j] < array[j-1]){
                    int t = array [j];
                    array[j] = array[j-1];
                    array [j-1] = t;
                }
            }
        }
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
