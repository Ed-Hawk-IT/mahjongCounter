public class Driver {
    public static void main(String[] args) throws InterruptedException{
        int steps = 100;
        //Simulation s = new Simulation(4,10,100,5);
        for(int i = 0; i < steps; i++){
            System.out.print("\033[2J\033[;H");
            //s.step();
            //System.out.println(s);
            Thread.sleep(300);
        }
        System.out.println("");
        System.out.println("Run through finished!");
    }
}
