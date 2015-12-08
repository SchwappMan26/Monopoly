import java.util.ArrayList;
public class Board
	{
		static ArrayList <Spaces>SpacesLoad=new ArrayList<Spaces>();
		public static void NormalBoardLoad()
			{
				SpacesLoad.add(new Corners("GO",1,false));
				SpacesLoad.add(new Brown("Mediteranean Avenue",2,60,false,true));
				SpacesLoad.add(new CommunityChestAndChance("Community Chest",3,false));
				SpacesLoad.add(new Brown("Baltic Avenue",4,60,false,true));
				SpacesLoad.add(new Taxes("Income Tax Pay 200",5,false,200));
				SpacesLoad.add(new Railroads("Reading Railroad",6,200,false,true));
				SpacesLoad.add(new LightBlue("Oriental Avenue",7,100,false,true));
				SpacesLoad.add(new CommunityChestAndChance("Chance",8,false));
				SpacesLoad.add(new LightBlue("Vermont Avenue",9,100,false,true));
				SpacesLoad.add(new LightBlue("Connecticut Avenue",10,120,false,true));
				SpacesLoad.add(new Corners("In Jail/Just Visiting",11,false));
				SpacesLoad.add(new Pink("St. Charles Place",12,140,false,true));
				SpacesLoad.add(new Utilities("Electric Company",13,140,false,true));
				SpacesLoad.add(new Pink("States Avenue",14,140,false,true));
				SpacesLoad.add(new Pink("Virginia Avenue",15,160,false,true));
				SpacesLoad.add(new Railroads("Pennsylvania Railroad",16,200,false,true));
				SpacesLoad.add(new Orange("St. James Place",17,180,false,true));
				SpacesLoad.add(new CommunityChestAndChance("Community Chest",18,false));
				SpacesLoad.add(new Orange("Tennessee Avenue",19,180,false,true));
				SpacesLoad.add(new Orange("New York Avenue",20,200,false,true));
				SpacesLoad.add(new Corners("Free Parking",21,false));
				SpacesLoad.add(new Red("Kentucky Avenue",22,220,false,true));
				SpacesLoad.add(new CommunityChestAndChance("Chance",23,false));
				SpacesLoad.add(new Red("Indiana Avenue",24,220,false,true));
				SpacesLoad.add(new Red("Illinois Avenue",25,240,false,true));
				SpacesLoad.add(new Railroads("B. & O. Railroad",26,200,false,true));
				SpacesLoad.add(new Yellow("Atlantic Avenue",27,260,false,true));
				SpacesLoad.add(new Yellow("Ventnor Avenue",28,260,false,true));
				SpacesLoad.add(new Utilities("Water Works",29,150,false,true));
				SpacesLoad.add(new Yellow("Marvin Gardens",30,280,false,true));
				SpacesLoad.add(new Corners("Go To Jail",31,false));
				SpacesLoad.add(new Green("Pacific Avenue",32,300,false,true));
				SpacesLoad.add(new Green("North Carolina Avenue",33,300,false,true));
				SpacesLoad.add(new CommunityChestAndChance("Community Chest",34,false));
				SpacesLoad.add(new Green("Pennsylvania Avenue",35,320,false,true));
				SpacesLoad.add(new Railroads("Short Line",36,200,false,true));
				SpacesLoad.add(new CommunityChestAndChance("Chance",37,false));
				SpacesLoad.add(new Blue("Park Place",38,350,false,true));
				SpacesLoad.add(new Taxes("Luxury Tax Pay 100",39,false,100));
				SpacesLoad.add(new Blue("Boardwalk",40,400,false,true));				
			}
		public static void StarWarsBoardLoad()
			{
				SpacesLoad.add(new Corners("GO",1,false));
				SpacesLoad.add(new Brown("Naboo Swamps",2,60,false,true));
				SpacesLoad.add(new CommunityChestAndChance("Jedi",3,false));
				SpacesLoad.add(new Brown("Naboo Plains",4,60,false,true));
				SpacesLoad.add(new Taxes("Trade Route Tax   Pay 200 Credits ",5,false,200));
				SpacesLoad.add(new Railroads("Podracer Sebulba's",6,200,false,true));
				SpacesLoad.add(new LightBlue("Trade Federation Battle Ship Hanger Bay",7,100,false,true));
				SpacesLoad.add(new CommunityChestAndChance("Sith",8,false));
				SpacesLoad.add(new LightBlue("Trade Federation Battleship Conference Room",9,100,false,true));
				SpacesLoad.add(new LightBlue("Trade Federation Battleship Control Center",10,120,false,true));
				SpacesLoad.add(new Corners("In Jail/Just Visiting",11,false));
				SpacesLoad.add(new Pink("Mos Espa Anakin's Room",12,140,false,true));
				SpacesLoad.add(new Utilities("Theed Power Generator",13,140,false,true));
				SpacesLoad.add(new Pink("Mos Espa Watto's Junk Shop",14,140,false,true));
				SpacesLoad.add(new Pink("Mos Espa Street Market",15,160,false,true));
				SpacesLoad.add(new Railroads("Podracer Gasgano's",16,200,false,true));
				SpacesLoad.add(new Orange("Mos Espa Arena Watto's Box",17,180,false,true));
				SpacesLoad.add(new CommunityChestAndChance("Jedi",18,false));
				SpacesLoad.add(new Orange("Mos Espa Arena Jabba's Box",19,180,false,true));
				SpacesLoad.add(new Orange("Mos Espa Arena Starting Grid",20,200,false,true));
				SpacesLoad.add(new Corners("Free Parking",21,false));
				SpacesLoad.add(new Red("Otoh Gunga Plaza",22,220,false,true));
				SpacesLoad.add(new CommunityChestAndChance("Sith",23,false));
				SpacesLoad.add(new Red("Otoh Gunga High Tower Board Room",24,220,false,true));
				SpacesLoad.add(new Red("Otoh Gunga Gungan Sub",25,240,false,true));
				SpacesLoad.add(new Railroads("Podracer Anakin's",26,200,false,true));
				SpacesLoad.add(new Yellow("Theed Energy Beem Hallway",27,260,false,true));
				SpacesLoad.add(new Yellow("Theed Generator Core",28,260,false,true));
				SpacesLoad.add(new Utilities("Moisture Farm",29,150,false,true));
				SpacesLoad.add(new Yellow("Theed Main Hanger",30,280,false,true));
				SpacesLoad.add(new Corners("Go To Jail",31,false));
				SpacesLoad.add(new Green("Theed Palace Courtyard",32,300,false,true));
				SpacesLoad.add(new Green("Theed Palace Main Palace",33,300,false,true));
				SpacesLoad.add(new CommunityChestAndChance("Jedi",34,false));
				SpacesLoad.add(new Green("Theed Palace Throne Room",35,320,false,true));
				SpacesLoad.add(new Railroads("Podracer Cleggs's",36,200,false,true));
				SpacesLoad.add(new CommunityChestAndChance("Sith",37,false));
				SpacesLoad.add(new Blue("Coruscant Galactic Senate",38,350,false,true));
				SpacesLoad.add(new Taxes("Blockade   Pay 75 Credits",39,false,75));
				SpacesLoad.add(new Blue("Coruscant Jedi Council",40,400,false,true));				
			}
	}
