import java.util.Arrays;

class Search {
    public static  int binarySearch(int[] arr,int target){
            //The Condition of Binary is The Array always remains Sorted
            int left = 0 , right = arr.length-1;
            int mid;
            int count=0;
            while(left <= right){
                count++;
                mid = ( left + right ) / 2;
                if (arr[mid] == target){
                    System.out.println("Occurance: "+count);
                    return arr[mid];
                }
                if (target > arr[mid])
                    left = mid+1;
                else if (target < arr[mid])
                    right = mid-1;
            }
            System.out.println("Occurance: "+count);
            return -1;
    }
}
class Sorting{
    synchronized public static void bubbleSort(int[] arr){
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
                if (arr[j] < arr[min])
                    min=j;
            }
            if (min!=i){
                int temp=arr[i];
                arr[i] = arr[min];
                arr[min]=temp;
            }
        }
    }
    public static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;
                }
                else
                    break;
            }
        }
    }
}
class UseSearch{
    public static void main(String[] args) {

        int[] arr = new int[5000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length-i;
        }
        System.out.println(Arrays.toString(arr));
        Sorting.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Search.binarySearch(arr,45000));
    }
    }