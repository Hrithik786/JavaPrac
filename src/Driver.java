public class Driver {
    public static  void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void selectionSort(int[] arr){
        int min;
        for (int i = 0; i < arr.length-1; i++) {
            min = i;
            for (int j = i+1 ; j < arr.length; j++) {
                if (arr[j] < arr[min]){
                    min=j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp; //swapping
        }
    }
    public static void insertionSort(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1 ; j > 0 ; j--) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={66,65,6,3,25,15,14,25,445,6,5,65};
        insertionSort(arr);
        for (int data:arr) {
            System.out.println(data);
        }
    }
}
