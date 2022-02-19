/************************************************
 * Purpose : Gambler resigns for a day if he wins or loses 50% of his stack
 ***********************************************/
package gambbler1;
import java.util.Scanner;
public class Gambler_UC3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Initial stake gambler has");
		int initial_stake = sc.nextInt();
		System.out.println("bet gambler does every day");
		int bet = sc.nextInt();
		double played = 0;
		int temp = initial_stake;
		// input taken from user
		
		while(initial_stake != 0) { // loop will continue till gambler loses or win 50% of his stack
		
		played = Math.floor((Math.random() * 10) % 2);
		System.out.println(played);
		
		if (played == 0) {
			initial_stake = initial_stake - bet;
		}
		else {
			initial_stake = initial_stake + bet;
		}
		
		if(initial_stake == temp * 1.5) { // gambler resigns with profit
			System.out.println("gambler resigned for day and has stack " +initial_stake);
			break;
		}
		else if(initial_stake == temp/2) { // gambler resigns after lose
			System.out.println("gambler resigned for day and has stack "+initial_stake);
			break;
		}
		sc.close();
		
	}

  }
}
