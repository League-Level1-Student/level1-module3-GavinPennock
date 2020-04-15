package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class gridworld {
public static void main(String[] args) {
	World world=new World();
	world.show();
	Bug bug=new Bug();
	Bug bug1=new Bug();
	bug1.setColor(Color.blue);
	bug1.turn();
	bug1.turn();
	Location location=new Location(5,7);
	Random ran=new Random();
	int random=ran.nextInt(10);
	int random1=ran.nextInt(10);
	Location location1=new Location(random,random1);
	Location location2=new Location(random-1,random1);
	Location location3=new Location(random+1,random1);
	Flower flower=new Flower();
	Flower flower1=new Flower();
	for(int i=0;i<10;i++) {
		for(int j=0;j<10;j++) {
		Flower flower5=new Flower();
		Location location5=new Location(j,i);
		world.add(location5, flower5);
		}
	}
	world.add(location2, flower);
	world.add(location3, flower1);
	world.add(location, bug);
	world.add(location1, bug1);
}
}
