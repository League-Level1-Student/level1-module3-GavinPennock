package _01_intro_to_static;

	public class Athlete {
		 static int bibNumber;
		 static int lastBibNumber=bibNumber;
		static int nextBibNumber=lastBibNumber+1;
	    static String raceLocation = "New York";
	    static String raceStartTime = "9.00am";
	    static String name;
	    int speed;
	   

	    Athlete (String name, int speed){
	        this.name = name;
	        this.speed = speed;
	    }

	    public static void main(String[] args) {
	       Athlete athlete=new Athlete("bob", bibNumber); 
	     System.out.println(bibNumber);
	     System.out.println(raceLocation);
	     System.out.println(name);
	     Athlete athlet=new Athlete("joe", nextBibNumber); 
	     System.out.println(nextBibNumber);
	     System.out.println(raceLocation);
	     System.out.println(name);
	    }
	}


