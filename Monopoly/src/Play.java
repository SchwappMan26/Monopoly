import java.util.Scanner;
public class Play
	{
		static Scanner Player=new Scanner(System.in);
		public static boolean gameContinues=true;
		public static void DicePlay()
			{
				int dice1;
				int dice2;
				int roll;
				int position = 1;
				while(gameContinues=true) 
					{
						System.out.println("\nHit Enter to Roll Dice");
						if(Player.hasNextLine()) 
							{
								Player.nextLine();
								dice1 = (int)(Math.random()*6 + 1);
								dice2 = (int)(Math.random()*6 + 1);
								roll = dice1 + dice2;
								position = (position + roll)%40;
								System.out.println("You rolled " + roll + "\tYou landed on " + Board.SpacesLoad.get(position).getName());
									
							}
						
					}
			}
		public static void player()
			{
				
			}
	}
