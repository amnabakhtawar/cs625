public class WaterSong{
public static void main (String[] args){
int waterNum=9;
String word="bottles";
while(waterNum>0){
	if(waterNum==1)
	{
	  word="bottle";
	}
	system.out.println(waterNum + " " + word + " of water on the wall");
	system.out.println(waterNum + " " + word + " of water");
	system.out.println("Take one down.");
	system.out.println("Pass it around");
	waterNum=waterNum-1;
	if(waterNum>0){
	  system.out.println(waterNum + " " + word +" of water on the wall");
	}
	else
	{
	system.out.println("No more bottles of water on the wall");
	}
   }
  }
 }
