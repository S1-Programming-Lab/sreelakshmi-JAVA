public class even implements Runnable
{
	int n1,n2;
	even(int x, int y)
	{
		n1=x;
		n2=y;
	}
	@Override
	public void run()
	{
		for(int i-n1;i<=n2;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even ="+i);
			}
		}
	}
}
Footer

