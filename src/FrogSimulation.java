public class FrogSimulation
{
    private int goalDistance;
    private int maxHops;
    int total;
    double ratio;
    public FrogSimulation (int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;
    }
    private int hopDistance()
    {
        return (int)(Math.random()*30)-1;
    }
    public boolean simulate()
    {
        for(int i = 0; i<maxHops; i++)
        {
            hopDistance();
            System.out.println(hopDistance());
            total =  total + hopDistance();
        }
        if( total >= goalDistance)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public double runSimulation(int num)
    {
        for( int i = 0; i < num; i++)
        {
            simulate();
            if( simulate() == true)
            {
                ratio++;
            }
        }
        return ratio/num;
    }
}
