import java.util.Scanner;

public class MonopolyRunner
	{
		
		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				int choose;
				
				System.out.println("Welcome to Monopoly!");
				System.out.println("To Play The Normal Edition press 1");
				System.out.println("To play The Star Wars Episode I Edition press 2");
				choose = userInput.nextInt();
				if (choose==1)
					{
						System.out.println("Welcome to Monopoly");
						Board.NormalBoardLoad();
						Play.NormalDicePlay();
					}
				else if(choose==2)
					{
						System.out.println("Welcome to Star Wars Episode I Monopoly");
						Board.StarWarsBoardLoad();
						Play.StarWarsDicePlay();
					}
			}

	}
