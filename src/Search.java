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
                else right = mid-1;
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
            if (min!=i){        //preventing from unnecessary swapping
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
    public static void mergeSort(int[] arr, int start, int end){

        if ( start < end ){
            int mid = (start+end)/2;      //  (log n)

            mergeSort(arr, start, mid);   //half left array
            mergeSort(arr,mid+1,end);   //half right array
            merge(arr,start,end);
        }
    }
    public static void merge(int[] arr, int start, int end){
        int mid = (start + end)/2;
        int first = start;
        int sec = mid+1;

        int pos = 0;
        int[] brr = new int[end-start+1];

        while (first <= mid && sec <= end){

            if (arr[first] <= arr[sec]){
                brr[pos] = arr[first];
                first++;
            }else {
                brr[pos]=arr[sec];
                sec++;
            }
            pos++;
        }
        while (first <= mid){
            brr[pos] = arr[first];
            first++;
            pos++;
        }
        while (sec <= end){
            brr[pos] = arr[sec];
            sec++;
            pos++;
        }
        for (int j = 0, k = start ; j < brr.length; j++,k++) {
            arr[k] = brr[j];
        }
    }
}
class UseSearch{
    public static void main(String[] args) {

        int[] arr = new int[502500];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length-i;  //init in reverse order for testing
        }
        Sorting.mergeSort(arr,0, arr.length-1);
        for (int data : arr) {
            System.out.println(data);
        }
    }
}