
public class Dice
	{
		public static void RollDie()
			{
				int rollDice;
				int rollDice1=((int)(Math.random()*6)+1);
				int rollDice2=((int)(Math.random()*6)+1);
				rollDice=rollDice1+rollDice2;
				if (rollDice1==rollDice2)
					{
						System.out.println("Doubles!");
					}
			}
	}
