public class Phrase {
	public static void main (String[] args) {
		String[] set1 = {"My" , "I" , "He", "His" , "Him", "Her", "Their" , "Them", "Mine", "Hers"};
		String[] set2 = {"name", "am", "love", "eat", "cry", "say", "play", "tell", "kill", "steal"};
		String[] set3 = {"is", "you", "dear", "sad", "alone", "today", "die", "dies", "killed", "hangs"};
		
		int a = set1.length;
		int b = set2.length;
		int c = set3.length;
		
		int rand1 = (int) (Math.random() * a);
		int rand2 = (int) (Math.random() * b);
		int rand3 = (int) (Math.random() * c);

		String phrase = set1[rand1] + " " + set2[rand2] + " " + set3[rand3];

		System.out.println("He said \"" + phrase + "\"");
	}
}
