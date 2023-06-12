class MyMultiThreading extends Thread{

    // synchronized Blocks
    // synchronized methods

    @Override
    public void run() {  //Mention All the task here, Overridding this Function();
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread 1 Running ");
            }
        }
    }
class MyMultiThreading2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 2 Running");
        }
    }
}
class HighPrioThreading extends Thread{
    public HighPrioThreading(String name) {
        super(name);
    }
    @Override
    public void run() {
        while(true){
        System.out.println("Thread: "+ this.getName());
    }
    }
}

class Controller {
    public static void main(String[] args){
        MyMultiThreading thread1  = new MyMultiThreading();
        MyMultiThreading2 thread2 = new MyMultiThreading2();

        thread1.start();
        thread2.start();

        HighPrioThreading high1 = new HighPrioThreading("normal");
        HighPrioThreading highfi = new HighPrioThreading("Antivirus");

        highfi.setPriority(Thread.MAX_PRIORITY);

        high1.start();

        try {
            high1.join(); //until it will completely executed another thread won't run
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        highfi.start();
    }
}