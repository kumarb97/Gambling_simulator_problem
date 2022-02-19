package gambbler1;
import java.util.Scanner;
public class Gambler_UC2 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Initial stake gambler has");
		int initial_stake = sc.nextInt();
		System.out.println("bet gambler does every day");
		int bet = sc.nextInt();
		
		double played =Math.floor((Math.random() * 10) % 2);
		System.out.println(played);
		
		if (played == 0) {
			initial_stake = initial_stake - bet;
			System.out.println("gambler lost and has now " +initial_stake);
		}
		else {
			initial_stake = initial_stake + bet;
			System.out.println("gambler won and has now " +initial_stake);
		}
		sc.close();

	}

}
