public class FrogSimulation
{
    private int goalDistance;
    private int maxHops;
    int total;
    int ratio = 0;
    int hopDistance;
    public FrogSimulation (int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;
    }
    private int hopDistance()
    {

            hopDistance = (int)Math.random()*10;
            return hopDistance;

    }
    public boolean simulate()
    {
        for(int i = 0; i<maxHops; i++)
        {
            total+= hopDistance;
        }
        if( total >= goalDistance)
        {
            ratio++;
            return true;
        }
        else
            return false;
    }
    public double runSimulation(int num)
    {
        return ratio/num;
    }
}
