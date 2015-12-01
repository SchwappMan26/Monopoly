
public abstract class Spaces
	{
		protected static  String name;
		protected static int space;
		protected boolean buyable;
		protected boolean isBought=false;
	
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		public int getSpace()
			{
				return space;
			}
		public void setSpace(int space)
			{
				this.space = space;
			}
		public boolean isBuyable()
			{
				return buyable;
			}
		public void setBuyable(boolean buyable)
			{
				this.buyable = buyable;
			}
		public boolean isBought()
			{
				return isBought;
			}
		public void setBought(boolean isBought)
			{
				this.isBought = isBought;
			}
	}
