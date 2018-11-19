public class Runner
{
    public static void main(String[] args)
    {
        FrogSimulation frog1 = new FrogSimulation(5, 3);
        FrogSimulation frog2 = new FrogSimulation(5, 3);
        FrogSimulation frog3 = new FrogSimulation(15, 3);
        System.out.println("Frog 1 Success Rate : " + frog1.runSimulation(2));
        System.out.println("Frog 2 Success Rate : " + frog2.runSimulation(2));
        System.out.println("Frog 3 Success Rate : " + frog3.runSimulation(2));

    }
}
