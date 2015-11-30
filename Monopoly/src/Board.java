import java.util.ArrayList;
public class Board
	{
		static ArrayList <Spaces>SpacesLoad=new ArrayList<Spaces>();
		public static void BoardLoad()
			{
				Spaces c=new Corners("GO",1);
				Spaces br=new Brown("Mediteranean Avenue",2);
				Spaces ccc=new CommunityChestAndChance("Community Chest",3);
				Spaces br1=new Brown("Baltic Avenue",4);
				Spaces t=new Taxes("Income Tax: Pay $200",5);
				Spaces rr=new Railroads("Reading Railroad",6);
				Spaces lb=new LightBlue("Oriental Avenue",7);
				Spaces ccc1=new CommunityChestAndChance("Chance",8);
				Spaces lb1=new LightBlue("Vermont Avenue",9);
				Spaces lb11=new LightBlue("Conneticut Avenue",10);
				Spaces c1=new Corners("In Jail/Just Visiting",11);
				Spaces p=new Pink("St. Charles Place",12);
				Spaces u=new Utilities("Electric Company",13);
				Spaces p1=new Pink("States Avenue",14);
				Spaces p11=new Pink("Virginia Avenue",15);
				Spaces rr1=new Railroads("Pennsylvania Railroad",16);
				Spaces o=new Orange("St. James Place",17);
				Spaces ccc11=new CommunityChestAndChance("Community Chest",18);
				Spaces o1=new Orange("Tennessee Avenue",19);
				Spaces o11=new Orange("New York Avenue",20);
				Spaces c11=new Corners("Free Parking",21);
				Spaces r=new Red("Kentucky Avenue",22);
				Spaces ccc111=new CommunityChestAndChance("Chance",23);
				Spaces r1=new Red("Indiana Avenue",24);
				Spaces r11=new Red("Illinois Avenue",25);
				Spaces rr11=new Railroads("B. & O. Railroad",26);
				Spaces y=new Yellow("Atlantic Avenue",27);
				Spaces y1=new Yellow("Ventnor Avenue",28);
				Spaces u1=new Utilities("Water Works",29);
				Spaces y11=new Yellow("Marvin Gardens",30);
				Spaces c111=new Corners("Go To Jail",31);
				Spaces g=new Green("Pacific Avenue",32);
				Spaces g1=new Green("North Carolina Avenue",33);
				Spaces ccc1111=new CommunityChestAndChance("Community Chest",34);
				Spaces g11=new Green("Pennsylvania Avenue",35);
				Spaces rr111=new Railroads("Short Line",36);
				Spaces ccc11111=new CommunityChestAndChance("Chance",37);
				Spaces b=new Blue("Park Place",38);
				Spaces t1=new Taxes("Luxury Tax",39);
				Spaces b1=new Blue("Boardwalk",40); 
				
				
				SpacesLoad.add(br1);
				SpacesLoad.add(lb11);
				SpacesLoad.add(p11);
				SpacesLoad.add(o11);
				SpacesLoad.add(r11);
				SpacesLoad.add(y11);
				SpacesLoad.add(g11);
				SpacesLoad.add(b1);
				SpacesLoad.add(rr111);
				SpacesLoad.add(u1);
				SpacesLoad.add(c111);
				SpacesLoad.add(t1);
				SpacesLoad.add(ccc11111);
				
				
			}
	}
