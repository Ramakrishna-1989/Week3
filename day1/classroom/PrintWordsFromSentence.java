package week3.day1;

public class PrintWordsFromSentence {

	public static void main(String[] args) {

		String text = "TestLeaf is Located in Teynampet and above  taccobell";
		
		String text1 = text.toLowerCase();
		System.out.println(text1);
		
		String[] split = text1.split(" ");
		
		for(int i=0 ; i<split.length;i++) {
			if (split[i].startsWith("t") ) {
				System.out.println(split[i]);
			}
		}
		
		
		//boolean text2 = text1.startsWith("t");
		
		
	}

}
