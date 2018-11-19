public class Runner
{
    public static void main(String[] args)
    {
        FrogSimulation frog1 = new FrogSimulation(20, 6);
        System.out.println("Frog 1 Success Rate : " + frog1.runSimulation(3));

    }
}
