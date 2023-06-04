import java.util.Arrays;

class MutliThreading extends Thread{
public void run() {  //Mention All the task here, Overridding this FUnction();
    System.out.println("Threading running");
    int[] arr={9,8,7,6,5,4,3,2,1};
    Sorting.bubbleSort(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println("STill Thread Running");
}
}
class Driver1{
        public static void main(String[] args){
        MutliThreading thread = new MutliThreading();
        thread.start();
            System.out.println(thread.isAlive());
            System.out.println(Math.pow(5,5));
        System.out.println(thread.isAlive());
        MutliThreading thread2 =new MutliThreading();
        thread2.start();
        System.out.println(thread2.isAlive());
}
}