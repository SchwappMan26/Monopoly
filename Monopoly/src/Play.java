import java.util.Scanner;
public class Play
	{
		static Scanner Player=new Scanner(System.in);
		public static boolean gameContinues=true;
		public static void DicePlay()
			{
				int rollDice;
				int Dice1;
				int Dice2;
				int Position=1;
				Dice1=((int)(Math.random()*6)+1);
				Dice2=((int)(Math.random()*6)+1);
				rollDice=Dice1+Dice2;
				if (Dice1==Dice2)
					{
						System.out.println("Doubles!");
					}
				while(gameContinues)
					{
						System.out.println("\nRolling Dice");
						Object player;
						if(Player.hasNextLine())
							{
								Player.nextLine();
								Position=(Position+rollDice)%40;
								System.out.println("You Rolled "+rollDice+"\tYou Landed on "+Board.SpacesLoad.get(Position).getName());
								
							}
					}
			}
	}
