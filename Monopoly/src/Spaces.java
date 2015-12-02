
public abstract class Spaces
	{
				protected String name;
				protected int space;
				protected int price;
				protected boolean canBuy;
				protected boolean purchased;
				
				public abstract String getName();

				public int getSpace()
					{
						return space;
					}

				public void setSpace(int space)
					{
						this.space = space;
					}

				public int getPrice()
					{
						return price;
					}

				public void setPrice(int price)
					{
						this.price = price;
					}

				public boolean isCanBuy()
					{
						return canBuy;
					}

				public void setCanBuy(boolean canBuy)
					{
						this.canBuy = canBuy;
					}

				public boolean isPurchased()
					{
						return purchased;
					}

				public void setPurchased(boolean purchased)
					{
						this.purchased = purchased;
					}

				public void setName(String name)
					{
						this.name = name;
					}
				
				
	}
