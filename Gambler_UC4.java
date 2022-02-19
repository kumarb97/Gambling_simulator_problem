/*
 * Purpose : gambler total stake after gambling 20 days
 * 
 */
package gambbler1;
import java.util.Scanner;

public class Gambler_UC4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Initial stake gambler has");
		int initial_stake = sc.nextInt();
		System.out.println("bet gambler does every day");
		int bet = sc.nextInt();
		double played = 0;
		int n=1;
		int temp = initial_stake;
		// input taken from user
		
		while(n<=20) { // loop will continue till 20 days
			    temp = initial_stake;
				played = Math.floor((Math.random() * 10) % 2);
				System.out.println(played);
				
				if (played == 0) {
					initial_stake = initial_stake - bet;
				}
				else {
					initial_stake = initial_stake + bet;
				}
				
				if(initial_stake == temp * 1.5) { // gambler resigns with profit for a day
					System.out.println("gambler resigned for day and has stack " +initial_stake);
				}
				else if(initial_stake == temp/2) { // gambler resigns after lose for a day
					System.out.println("gambler resigned for day and has stack "+initial_stake);
				}
					
				if (initial_stake == 0) {
					System.out.println("gambler lost everything");
					break;
				}
				n++;
		}
		System.out.println("Gambler has total stack after 20 days " +initial_stake);
        sc.close();
	}

}
