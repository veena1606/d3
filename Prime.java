public class Prime{
    public static void main(String[]args)
    {
        int n=10;
        System.out.println("prime numbers");
        for(int i=2;i<=n;i++)
        {
            boolean flag=true;
        for(int j=2;j<=Math.sqrt(i);j++)
        {
            if(i%j==0)
            {
                flag=false;
                break;
            }
        }
        if(flag)
        {
            System.out.println(i);
        }
        }
        System.out.println("prime");

    }
}
