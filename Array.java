package Array;

public interface BigNumber
{
    public static void main(String[] args)
    {
        int ar[]={7,9,63,69,55,41};
        int big=ar[0];
        for(int i=0;i<ar.length;i++)
        {
            if(big<ar[i])
            big=ar[i];
        }
        System.out.println("Big Number: "+big);
    }
}
