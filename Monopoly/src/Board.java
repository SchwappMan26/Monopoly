import java.util.ArrayList;
public class Board
	{
		public static void BoardLoad()
			{
				Spaces c=new Corners("GO",1);
				Spaces br=new Brown("Mediteranean Avenue",2);
				Spaces br1=new Brown("Baltic Avenue",3);
				Spaces t=new Taxes("Income Tax: Pay $200",4);
				Spaces rr=new Railroads("Reading Railroad",5);
				Spaces lb=new LightBlue("Oriental Avenue",6);
				Spaces ccc=new CommunityChestAndChance("Chance",7);
				Spaces lb1=new LightBlue("Vermont Avenue",8);
				Spaces lb11=new LightBlue("Conneticut Avenue",9);
				Spaces c1=new Corners("In Jail/Just Visiting",10);
				Spaces p=new Pink("St. Charles Place",11);
				Spaces u=new Utilities("Electric Company",12);
				Spaces p1=new Pink("States Avenue",13);
				Spaces p11=new Pink("Virginia Avenue",14);
				Spaces rr1=new Railroads("Pennsylvania Railroad",15);
				Spaces o=new Orange("St. James Place",16);
				Spaces ccc1=new CommunityChestAndChance("Community Chest",17);
				Spaces o1=new Orange("Tennessee Avenue",18);
				Spaces o11=new Orange("New York Avenue",19);
				Spaces c11=new Corners("Free Parking",20);
				Spaces r=new Red("Kentucky Avenue",21);
				
				
				ArrayList <Spaces>SpacesLoad=new ArrayList<Spaces>();
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
