
public abstract class Properties extends Spaces
	{
		protected static int price;
		protected String owner;
		protected boolean purchased;
		
		public static int getPrice()
			{
				return price;
			}

		public static void setPrice(int price)
			{
				Properties.price = price;
			}
		
		public String getOwner()
			{
				return owner;
			}

		public void setOwner(String owner)
			{
				this.owner = owner;
			}

		public boolean isPurchased()
			{
				return purchased;
			}

		public void setPurchased(boolean purchased)
			{
				this.purchased = purchased;
			}

		
	}
