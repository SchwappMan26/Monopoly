
public class Taxes extends Other
	{
		public Taxes(String n, int i, boolean cb, int t) 
			{
				name = n;
				space = i;
				canBuy = cb;
				taxes=t;
			}
		public String getName()
			{
				return name;
			}
	}
