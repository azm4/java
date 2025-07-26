// "Player" Class
class Player {
	int number = 0;

	public void guess () {
		number = (int) (Math.random() * 10);
		System.out.println("Guess: " + number);
	}
}

//GameLauncher Class
public class Game {
	public static void main (String[] args) {
		GuessGame game = new GuessGame();
		game.Start();
	}
}


// Game
class GuessGame {
	// Creating 3 instance variable for 3 Player objects
	Player p1;
	Player p2;
	Player p3;
	
	public void Start() {
		// creating 3 Player objects and assigning them to 3 instance variables
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		// variables for storing guess
		int gp1 = 0;
		int gp2 = 0;
		int gp3 = 0;
		
		// holding true or false value for guess
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		// Generating a random number that players have to guess
		int target = (int) (Math.random() * 10);
		System.out.println("I am thinking of a number between 0 and 9!!!");

		while (true) {
			// call each players guess method
			p1.guess();
			p2.guess();
			p3.guess();
			
			// get each players guess
			gp1 = p1.number;
			System.out.println("Player-1: " + gp1);
			gp2 = p2.number;
			System.out.println("Player-2: " + gp2);
			gp3 = p3.number;
			System.out.println("Player-3: " + gp3);
			
			// check each player guess
			if (gp1 == target) {
				p1isRight = true;
			}
			if (gp2 == target) {
				p2isRight = true;
			}
			if (gp3 == target) {
				p3isRight = true;
			}
			
			// if players are right
			if (p1isRight || p2isRight || p3isRight) {

				System.out.println("Player-1?" + p1isRight);
				System.out.println("Player-2?" + p2isRight);
				System.out.println("Player-3?" + p3isRight);
				System.out.println("We have a winner!!!");
				break;
			}
			else {
				System.out.println("Try again!!");
			}
		}
	}
}

