import java.util.ArrayList;
import java.util.Scanner;
public class Play
	{
		static ArrayList<String>ownedProp = new ArrayList<String>();
		static Scanner Player=new Scanner(System.in);
		public static boolean gameContinues=true;
		public static void StarWarsDicePlay()
			{
				int dice1;
				int dice2;
				int roll;
				int position = 0;
				int Credits=1500;
				while(true) 
					{
						System.out.println("\nHit Enter to Roll Dice");
						Player.nextLine();
						if(Player.hasNextLine()) 
							{	
								dice1 = (int)(Math.random()*6 + 1);
								dice2 = (int)(Math.random()*6 + 1);
								roll = dice1 + dice2;
								if((position + roll) >= 40) 
									{
										Credits += 200;
										System.out.println("You received $200 for passing/landing on go");
										System.out.println("Your balance is " + Credits+"Credits");
									}
									position = (position + roll)%40;
									System.out.println("You rolled " + roll + "\tYou landed on " + Board.SpacesLoad.get(position).getName());
									System.out.println();
									if(Board.SpacesLoad.get(position).isCanBuy() == true)
										{
											if(Board.SpacesLoad.get(position).isPurchased() == false) 
												{
													System.out.println("Buy " + Board.SpacesLoad.get(position).getName() + " for $" + Board.SpacesLoad.get(position).getPrice());
													System.out.println("Press 1 to buy, 2 to pass");
													if(Player.nextInt() == 1) 
														{
															if(Credits >= Board.SpacesLoad.get(position).getPrice())
																{
																	Board.SpacesLoad.get(position).setPurchased(true);
																	Credits -= Board.SpacesLoad.get(position).getPrice();
																	System.out.println("You bought " + Board.SpacesLoad.get(position).getName());
																	System.out.println("Your balance is " + Credits+" Credits");
																	System.out.println(" ");
																	System.out.println("Your Properties:");
																	ownedProp.add(new String(Board.SpacesLoad.get(position).getName()));
																	for(String fred: ownedProp) 
																		{
																			System.out.println(fred);
																		}
																} 
															else 
																{
																	System.out.println("You do not have enough money");	
																}
														} 
													else if(Player.nextInt()==2)
														{
															
														}
												}
											else if(position == 4) 
												{
													if(Credits >= 200) 
														{
															Credits -= 200;
															System.out.println("You paid 200 Credits for Trade Route Tax");
														} 
													else 
														{
															System.out.println("You do not have enough money to pay for Trade Route Tax");
														}
												} 
											else if(position == 38)
												{
													if(Credits >= 75)
														{
															Credits -= 75;
															System.out.println("You paid 75 Credits for Blockade");
														} 
													else 
														{
															System.out.println("You do not have enough money to pay for Blockade");
														}
												}
									}
							}			
					}
			}
		public static void NormalDicePlay()
			{
				int dice1;
				int dice2;
				int roll;
				int position = 0;
				int Money=1500; 
				while(true) 
					{
						System.out.println("\nHit Enter to Roll Dice");
						Player.nextLine();
						if(Player.hasNextLine()) 
							{
								dice1 = (int)(Math.random()*6 + 1);
								dice2 = (int)(Math.random()*6 + 1);
								roll = dice1 + dice2;
								if((position + roll) >= 40)
									{
									Money += 200;
									System.out.println("You received $200 for passing/landing on go");
									System.out.println("Your balance is " + Money);
									}
									position = (position + roll)%40;
									System.out.println("You rolled " + roll + "\tYou landed on " + Board.SpacesLoad.get(position).getName());
									System.out.println();
									if(Board.SpacesLoad.get(position).isCanBuy() == true)
										{
											if(Board.SpacesLoad.get(position).isPurchased() == false) 
												{
													System.out.println("Buy " + Board.SpacesLoad.get(position).getName() + " for $" + Board.SpacesLoad.get(position).getPrice());
													System.out.println("Press 1 to buy, 2 to pass");
													if(Player.nextInt() == 1) 
														{
															if(Money >= Board.SpacesLoad.get(position).getPrice())
																{
																	Board.SpacesLoad.get(position).setPurchased(true);
																	Money -= Board.SpacesLoad.get(position).getPrice();
																	System.out.println("You bought " + Board.SpacesLoad.get(position).getName());
																	System.out.println("Your balance is " + Money);
																	System.out.println(" ");
																	System.out.println("Your Properties:");
																	ownedProp.add(new String(Board.SpacesLoad.get(position).getName()));
																	for(String fred: ownedProp) 
																		{
																			System.out.println(fred);
																		}
																} 
															else 
																{
																	System.out.println("You do not have enough money");	
																}
														} 
													else if(Player.nextInt()==2)
														{
															
														}
												}
											else if(position == 4) 
												{
													if(Money >= 200) 
														{
															Money -= 200;
															System.out.println("You paid 200 Credits for Income Tax");
														} 
													else 
														{
															System.out.println("You do not have enough money to pay for Income Tax");
														}
												} 
											else if(position == 38)
												{
													if(Money >= 100)
														{
															Money -= 100;
															System.out.println("You paid 100 Credits for Luxary Tax");
														} 
													else 
														{
															System.out.println("You do not have enough money to pay for Luxary Tax");
														}
											}
									}
							}			
				}
			}
	}