package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	
		public static void main(String[] args) {
			
		
		//2. create an array of 5 robots.
		
		Robot [] cookie = new Robot[5];
		
		
		//3. use a for loop to initialize the robots.
		
		
		for (int i = 0; i < cookie.length; i++) {
			
			cookie[i]= new Robot();
			cookie[i].moveTo(i*200, 250);
			
		}
		

		//4. make each robot start at the bottom of the screen, side by side, facing up
		
		
		
		
	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
		
		
		
		
		
    	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		
		Random ran = new Random();

		boolean race= true;
		
		while(race==true){
			
			for (int i = 0; i < cookie.length; i++) {
			
			cookie[i].move(ran.nextInt(50));
			
			
			if(cookie[i].getY()<0){
				
				JOptionPane.showMessageDialog(null, "The winner is robot # " + i);
				
				race=false;
						
				break;
						
			}
			
			
				
			}
				
			
			
		}

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
		
		Robot [] cake = new Robot [4];
		
		for (int i = 0; i < cake.length; i++) {
			
			cake[i]= new Robot();
			cake[i].moveTo(i*200, 250);
			
		}
		
		Random dom = new Random();
		
		boolean go = true;
		
		while(go==true) {
			
			for (int i = 0; i < cake.length; i++) {
				
				cake[i].move(dom.nextInt(50));
				
				if(cake[i].getY()<0) {
					
					JOptionPane.showMessageDialog(null, "The winner is Robot # " + i);
					
					go=false;
					break;
					
				}
				
			}
			
		}
		
		
    	
	    //9. make the robots race around a circular track.
		
		}
	
}
