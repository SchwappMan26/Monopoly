import java.util.ArrayList;
public class Board
	{
		static ArrayList <Spaces>SpacesLoad=new ArrayList<Spaces>();
		public static void BoardLoad()
			{
				SpacesLoad.add(new Corners("GO",1));
				SpacesLoad.add(new Brown("Mediteranean Avenue",2,60,false));
				SpacesLoad.add(new CommunityChestAndChance("Community Chest",3));
				SpacesLoad.add(new Brown("Baltic Avenue",4,60,false));
				SpacesLoad.add(new Taxes("Income Tax: Pay $200",5));
				SpacesLoad.add(new Railroads("Reading Railroad",6,200,false));
				SpacesLoad.add(new LightBlue("Oriental Avenue",7,100,false));
				SpacesLoad.add(new CommunityChestAndChance("Chance",8));
				SpacesLoad.add(new LightBlue("Vermont Avenue",9,100,false));
				SpacesLoad.add(new LightBlue("Conneticut Avenue",10,120,false));
				SpacesLoad.add(new Corners("In Jail/Just Visiting",11));
				SpacesLoad.add(new Pink("St. Charles Place",12,140,false));
				SpacesLoad.add(new Utilities("Electric Company",13,140,false));
				SpacesLoad.add(new Pink("States Avenue",14,140,false));
				SpacesLoad.add(new Pink("Virginia Avenue",15,160,false));
				SpacesLoad.add(new Railroads("Pennsylvania Railroad",16,200,false));
				SpacesLoad.add(new Orange("St. James Place",17,180,false));
				SpacesLoad.add(new CommunityChestAndChance("Community Chest",18));
				SpacesLoad.add(new Orange("Tennessee Avenue",19,180,false));
				SpacesLoad.add(new Orange("New York Avenue",20,200,false));
				SpacesLoad.add(new Corners("Free Parking",21));
				SpacesLoad.add(new Red("Kentucky Avenue",22,220,false));
				SpacesLoad.add(new CommunityChestAndChance("Chance",23,false));
				SpacesLoad.add(new Red("Indiana Avenue",24,220,false));
				SpacesLoad.add(new Red("Illinois Avenue",25,240,false));
				SpacesLoad.add(new Railroads("B. & O. Railroad",26,200,false));
				SpacesLoad.add(new Yellow("Atlantic Avenue",27,260,false));
				SpacesLoad.add(new Yellow("Ventnor Avenue",28,260,false));
				SpacesLoad.add(new Utilities("Water Works",29,150,false));
				SpacesLoad.add(new Yellow("Marvin Gardens",30,280,false));
				SpacesLoad.add(new Corners("Go To Jail",31));
				SpacesLoad.add(new Green("Pacific Avenue",32,300,false));
				SpacesLoad.add(new Green("North Carolina Avenue",33,300,false));
				SpacesLoad.add(new CommunityChestAndChance("Community Chest",34));
				SpacesLoad.add(new Green("Pennsylvania Avenue",35,320,false));
				SpacesLoad.add(new Railroads("Short Line",36,200,false));
				SpacesLoad.add(new CommunityChestAndChance("Chance",37));
				SpacesLoad.add(new Blue("Park Place",38,350,false));
				SpacesLoad.add(new Taxes("Luxury Tax",39));
				SpacesLoad.add(new Blue("Boardwalk",40,400,false));				
			}
	}
