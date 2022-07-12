public class fibannoci implements Runnable
{
	int n1,n2,num=0,x=0,y=1;
	fibannoci(int l, int u)
	{
		n1=l;
		n2=u;
	}
	@Override
	public void run()
	{
		System.out.println("Fibannoci ="+0);
		System.out.println("Fibannoci ="+1);
		while(num<n2-1)
		{
			num=x+y;
			if((num>=n1)&&(num<=n2))
			{
				System.out.println("Fibannoci ="+num);
			}
			x=y;
			y=num;
		}
	}
}
