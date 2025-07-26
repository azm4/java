public class Beer {
	public static void main (String[] args) {
		int bottleNum = 99;
		String word = "bottles";	
		if (bottleNum == 1) {
			word = "bottle";
		}
		while (bottleNum > 0) {
			System.out.println (bottleNum + " " + word + " of beer on the wall");
			System.out.println (bottleNum + " " + word + " of beer");
			System.out.println ("Take on down");
			System.out.println ("Pass it around");
			bottleNum--;
		}
		
		if (bottleNum > 0) {
			System.out.println (bottleNum + " " + word + " of beer on the wall");
		}
		else {
			System.out.println ("No more bottles of beer on the wall");
		}
	}
}// There is an out put error here. 	
