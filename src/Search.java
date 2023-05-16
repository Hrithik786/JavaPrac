class Search {
    public static int BinarySearch(int[] arr,int target){
            //The Condition of Binary is The Array always remains Sorted
            int left = 0 , right = arr.length-1;
            int mid;
            int count=0;
            while(left <= right){
                count++;
                mid = ( left + right ) / 2;
                if (arr[mid] == target){
                    System.out.println("Occurance: "+count);
                    return mid;
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
class UseSearch{
    public static void main(String[] args) {

        int[] arr;
        arr=new int[50000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        System.out.println(Search.BinarySearch(arr,500000));

    }
}