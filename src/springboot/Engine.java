package springboot;

class Engine {
    private int start = 1;

    // public Engine(Brake b, Fuel f){

    // }

    public void start() {
        if (start>=1) {
            System.out.println("Engine started");
        }
    }

}