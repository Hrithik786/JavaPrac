class MyMultiThreading extends Thread{

    // synchronized Blocks
    // synchronized methods

    @Override
    public void run() {  //Mention All the task here, Overridding this Function();
            for (int i = 0; i < 7000000; i++) {
                System.out.println("Thread 1 Running");
            }
        }
    }
class MyMultiThreading2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 7000000; i++) {
            System.out.println("Thread 2 Running");
        }
    }
}

class Controller {
    public static void main(String[] args)
    {
        MyMultiThreading thread1  = new MyMultiThreading();
        MyMultiThreading2 thread2 = new MyMultiThreading2();

        thread1.start();
        thread2.start();
    }
}