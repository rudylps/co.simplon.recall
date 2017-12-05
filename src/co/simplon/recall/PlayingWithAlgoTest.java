package co.simplon.recall;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

public class PlayingWithAlgoTest {
	static PlayingWithAlgo playing;

	@Test
	public void helloWorld() {
		// TODO Auto-generated method stub
		assertEquals("Hello World",PlayingWithAlgo.helloWorld(""));
		assertEquals("Hello Manu",PlayingWithAlgo.helloWorld("Manu"));
		assertEquals("Hello Laetitia",PlayingWithAlgo.helloWorld("Laetitia"));
	}
	
	/**
	 * selects elements starting with a
	 */
	@Test
	public void selectElementsStartingWithA() {
		String arrayIn[] = { "bananas", "apples", "pears", "avocados" };
		ArrayList<String> resultat = new ArrayList<String>();
		resultat.add("apples");
		resultat.add("avocados");

		assertEquals(resultat, PlayingWithAlgo.selectElementsStartingWithA(arrayIn));
	}

	/**
	 * selects elements starting with a vowel
	 */
	@Test
	public void selectElementsStartingWithVowel() {
		String arrayIn[] = { "john", "david", "omar", "fred", null, "idris", "angela" };
		ArrayList<String> resultat = new ArrayList<String>();
		resultat.add("omar");
		resultat.add("idris");
		resultat.add("angela");

		assertEquals(resultat, PlayingWithAlgo.selectElementsStartingWithVowel(arrayIn));
	}

	/**
	 * removes null values from an array
	 */
	@Test
	public void removeNullElements() {
		String arrayIn[] = { "a", "b", null, null, "false", "null" };
		String arrayOut[] = { "a", "b", "false", "null" };
		assertArrayEquals(arrayOut, PlayingWithAlgo.removeNullElements(arrayIn));
	}

	/**
	 * reverses the letters of each element in an array
	 */
	@Test
	public void reverseWordsInMyStringArray() {
		String arrayIn[] = { "dog", "monkey", "elephant", "kayak" };
		String arrayOut[] = { "god", "yeknom", "tnahpele", "kayak" };
		assertArrayEquals(arrayOut, PlayingWithAlgo.reverseWordsInMyStringArray(arrayIn));
	}

	/**
	 * reverses the order of each element in an array
	 */
	@Test
	public void reverseOrderInArray() {
		String arrayIn[] = "dog,monkey,elephant,kayak".split(",");
		String arrayOut[] = { "kayak", "elephant", "monkey", "dog" };
				assertArrayEquals(arrayOut, PlayingWithAlgo.reverseOrderInArray(arrayIn));
	}

	/**
	 * makes every possible pairing of students
	 */
	@Test
	public void everyPossiblePair() {
		String arrayIn[] = { "Jon", "Tyrion", "Daenerys" };
		String arrayOut[][] = { { "Daenerys", "Jon" }, { "Daenerys", "Tyrion" }, { "Jon", "Tyrion" } };
		assertArrayEquals(arrayOut, PlayingWithAlgo.everyPossiblePair(arrayIn));
	}

	/**
	 * sorts an array by the last letter of each word
	 */
	@Test
	public void sortByLastLetter() {
		String arrayIn[] = { "Lannister", "Stark", "Greyjoy", "Targaryen" };
		ArrayList<String> resultat = new ArrayList<String>();
		resultat.add("Stark");
		resultat.add("Targaryen");
		resultat.add("Lannister");
		resultat.add("Greyjoy");

		assertEquals(resultat, PlayingWithAlgo.sortByLastLetter(arrayIn));
	}
	
	/**
	 * gets the first half of a string
	 */
	@Test
	public void  getFirstHalf() {
		assertEquals("dra", PlayingWithAlgo.getFirstHalf("dragon"));
		assertEquals("sna", PlayingWithAlgo.getFirstHalf("snake"));
	}
	
	/**
	 * get the word without a letter upper and lower (ex:"a" and "A")
	 */
	@Test
	public void  exportWordWithoutALetter() {
		String arrayIn[] = { "Lannister", "Stark", "Greyjoy", null, "Targaryen", "Arthur" };
		assertEquals("Greyjoy", PlayingWithAlgo.exportWordWithoutALetter(arrayIn, 'a'));
		assertEquals("Lannister, Stark, Greyjoy, Targaryen, Arthur", PlayingWithAlgo.exportWordWithoutALetter(arrayIn, 'z'));
	}	
	
	/**
	 * counts elements in an text that are palindrome word
	 */
	@Test
	public void  numberOfPalindromeWords() {
		String text = "search palindromes in this text : 'kayak', 'noon', 'khaleesi', 'hodor', 'racecar', 'a', 'tattarrattat', " ;
		assertEquals(5, PlayingWithAlgo.numberOfPalindromeWord(text));
	}	
	
	/**
	 * counts elements in an text that are palindrome text
	 */
	@Test
	public void  numberOfPalindromeText() {
		String text = "'All the world's a stage', 'rail at a liar', 'Tis the time's plague when madmen lead the blind', 'Did Hannah see bees ? Hannah did', 'Sums are not set as a test on Erasmus' " ;
		assertEquals(3, PlayingWithAlgo.numberOfPalindromeText(text));
	}	

	/**
	 * returns the shortest word
	 */
	@Test
	public void  shortestWord() {
		String text = "winter is coming";
		assertEquals("is", PlayingWithAlgo.shortestWord(text));
	}	

	/**
	 * returns the first longest word
	 */
	@Test
	public void  longestWord() {
		String text = "Hey birds, winter is coming with snow.";
		assertEquals("winter", PlayingWithAlgo.longestWord(text));
	}	
	
	/**
	 * 'gets all letters in an array of words
	 */
	@Test
	public void  getAllLetters() {
		String[] array = {"cat", "dog", "fish", "cat"};
		assertEquals("acdfghiost", PlayingWithAlgo.getAllLetters(array));
	}	
	
	/**
	 * removes capital letters from a string
	 */
	@Test
	public void  removeCapitals() {
		String text = "Hello Kitty";
		assertEquals("ello itty", PlayingWithAlgo.removeCapitals(text));
	}	
	
	/**
	 * formats a date nicely
	 */
	@Test
	public void  formatDateNicely() {
		String text = "2016-10-04";
		assertEquals("04/10/2016", PlayingWithAlgo.formatDateNicely(text));
	}	
	
	/**
	 * gets the domain name from an email address
	 */
	@Test
	public void  getDomainName() {
		assertEquals("makersacademy", PlayingWithAlgo.getDomainName("spike@makersacademy.com"));
		assertEquals("ssh.makersacademy", PlayingWithAlgo.getDomainName("spike@ssh.makersacademy.com"));
	}	

	/**
	 * titleizes a string
	 */
	@Test
	public void  titleize() {
		assertEquals("The Lion the Witch and the Wardrobe", PlayingWithAlgo.titleize("the lion the witch and the wardrobe"));
		assertEquals("The Lion the Witch. And the Wardrobe", PlayingWithAlgo.titleize("the lion the witch. and the wardrobe"));
	}	
	
	/**
	 * checks a string for special characters
	 */
	@Test
	public void  checkForSpecialCharacters() {
		assertFalse(PlayingWithAlgo.checkForSpecialCharacters("ABCdef123"));
		assertTrue(PlayingWithAlgo.checkForSpecialCharacters("ABC@dsklfj!"));
	}	
	
	/**
	 * finds all possible anagrams of a word
	 */
	@Test
	public void  findAnagrams() {
		String[] result1 = {"adm", "amd", "dam", "dma", "mad", "mda"};
		String[] result2 = {"am", "ma"};
		assertArrayEquals(result1, PlayingWithAlgo.findAnagrams("mad"));
		assertArrayEquals(result2, PlayingWithAlgo.findAnagrams("ma"));
	}	
	
	/**
	 * for each letter, find its position in the alphabet
	 */
	@Test
	public void  letterPosition() {
		int[] result = {8, 5, 12, 12, 15, 11, 9, 20, 20, 25};
		assertArrayEquals(result, PlayingWithAlgo.letterPosition("HelloKitty"));
	}	
	
	@Test
	public void addingTwoNumbers() {
		assertEquals(30, PlayingWithAlgo.addingTwoNumbers(10, 20));
	}

	@Test
	public void addingThreeNumbers() {
		assertEquals(60, PlayingWithAlgo.addingThreeNumbers(10, 20, 30));
	}

	@Test
	public void addingSeveralNumbers() {
		assertEquals(30, PlayingWithAlgo.addingSeveralNumbers(10, 20));
		assertEquals(60, PlayingWithAlgo.addingSeveralNumbers(10, 20, 30));
		assertEquals(7936, PlayingWithAlgo.addingSeveralNumbers(256, 512, 1024, 2048, 4096));
	}
	
	/**
	 * takes all elements except the first 3
	 */
	@Test
	public void allElementsExceptFirstThree() {
		int arrayIn[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int arrayOut[] = {4, 5, 6, 7, 8 };
		assertArrayEquals(arrayOut, PlayingWithAlgo.allElementsExceptFirstThree(arrayIn));
	}

	/**
	 * adds an element to the beginning of an array
	 */
	@Test
	public void addElementToBeginning() {
		int arrayIn[] = { 2, 3, 4, 5 };
		int arrayOut[] = {1, 2, 3, 4, 5 };
		assertArrayEquals(arrayOut, PlayingWithAlgo.addElementToBeginning(arrayIn,1));
	}
	/**
	 * makes numbers negative
	 */
	@Test
	public void makeNegative() {
		assertEquals(new Float(-4.52),PlayingWithAlgo.makeNegative(new Float(4.52)));
		assertEquals(new Float(-8),PlayingWithAlgo.makeNegative(new Float(-8)));
	}

	/*
	 * gets elements lower than six
	 */
	@Test
	public void getElementsLowerThanSix() {
		String[] arrayIn = {"1", "3", "50", "4", "1", "2", "6", "2", "10", "3", "7"};
		String[] arrayOut = {"1", "2", "3", "4", "6"};
		assertArrayEquals(arrayOut, PlayingWithAlgo.getElementsLowerThanSix(arrayIn));
	}
	
	/**
	 * ecrire l'algorithme du tri par selection
	 */
	@Test
	public void sortTabBySelection() {
		int[] arrayIn = new int[] {0,23,52,17,-5,17,15,9,16};
		int[] arrayOut = {-5,0,9,15,16,17,17,23,52};
		assertArrayEquals(arrayOut, PlayingWithAlgo.sortTabBySelection(arrayIn));
	}
	
	/**
	 * ecrire l'algorithme du tri par insertion
	 */
	@Test
	public void sortTabByInsertion() {
		int[] arrayIn = {0,23,52,17,-5,17,15,9,16};
		int[] arrayOut = {-5,0,9,15,16,17,17,23,52};
		assertArrayEquals(arrayOut, PlayingWithAlgo.sortTabByInsertion(arrayIn));
	}
	
	/**
	 * ecrire l'algorithme du tri bulle
	 */
	@Test
	public void sortTabByBubble() {
		int[] arrayIn = new int[] {0,23,52,17,-5,17,15,9,16};
		int[] arrayOut = {-5,0,9,15,16,17,17,23,52};
		assertArrayEquals(arrayOut, PlayingWithAlgo.sortTabByBubble(arrayIn));
	}
	
	/**
	 * ecrire l'algorithme d'une recherche dichotomique
	 */
	@Test
	public void findIndexByDichotomy() {
		int[] arrayIn = {-5,0,9,15,16,17,17,23,52};
		assertEquals(7, PlayingWithAlgo.findIndexByDichotomy(23,arrayIn));
		assertEquals(1, PlayingWithAlgo.findIndexByDichotomy(0,arrayIn));
		assertEquals(8, PlayingWithAlgo.findIndexByDichotomy(52,arrayIn));
		assertEquals(4, PlayingWithAlgo.findIndexByDichotomy(16,arrayIn));
		assertEquals(0, PlayingWithAlgo.findIndexByDichotomy(-5,arrayIn));
		assertEquals(-1, PlayingWithAlgo.findIndexByDichotomy(10,arrayIn));
	}
	
	/**
	 * rounds up a number
	 */
	@Test
	public void roundUp() {
		assertEquals(3, PlayingWithAlgo.roundUp(3.10f));
		assertEquals(24, PlayingWithAlgo.roundUp(23.76f));
		assertEquals(10, PlayingWithAlgo.roundUp(9.5f));
	}

	/**
	 * donner le dernier jour du mois
	 */
	@Test
	public void findAllLastDayMonth() {
		assertEquals(31, PlayingWithAlgo.findLastDayOfMonth(07, 2017));
		assertEquals(30, PlayingWithAlgo.findLastDayOfMonth(11, 2017));
		assertEquals(28, PlayingWithAlgo.findLastDayOfMonth(02, 2017));
		assertEquals(29, PlayingWithAlgo.findLastDayOfMonth(02, 2016));
		assertEquals(29, PlayingWithAlgo.findLastDayOfMonth(02, 2000));
		assertEquals(28, PlayingWithAlgo.findLastDayOfMonth(02, 2100));
	}
	
	/**
	 * finds the factorial of a number
	 */
	@Test
	public void factorial() {
		assertEquals(120, PlayingWithAlgo.factorial(5)); // = 5 * 4 * 3 * 2 * 1
	}
	
	/**
	 * converts Fahrenheit to Celsius rounding to the nearest integer
	 */
	@Test
	public void convertToCelsius() {
		assertEquals(0, PlayingWithAlgo.convertToCelsius(32));
		assertEquals(13, PlayingWithAlgo.convertToCelsius(55));
	}

	@Test
	public void checkIfPair() {
		assertEquals(true, PlayingWithAlgo.checkIfPair(10));
		assertEquals(false, PlayingWithAlgo.checkIfPair(21));
	}
	
	@Test
	public void checkIfPairPairImpair() {
		assertEquals(false, PlayingWithAlgo.checkIfPairPairImpair(10, 20, 10));
		assertEquals(false, PlayingWithAlgo.checkIfPairPairImpair(10, 21, 10));
		assertEquals(false, PlayingWithAlgo.checkIfPairPairImpair(10, 21, 11));
		assertEquals(false, PlayingWithAlgo.checkIfPairPairImpair(11, 20, 10));
		assertEquals(false, PlayingWithAlgo.checkIfPairPairImpair(11, 21, 10));
		assertEquals(false, PlayingWithAlgo.checkIfPairPairImpair(11, 21, 11));
		assertEquals(true, PlayingWithAlgo.checkIfPairPairImpair(10, 20, 11));
	}
	
	@Test
	public void checkIfSumIsPair() {
		assertEquals(true, PlayingWithAlgo.checkIfSumIsPair(10, 20, 10));
		assertEquals(false, PlayingWithAlgo.checkIfSumIsPair(10, 21, 10));
		assertEquals(true, PlayingWithAlgo.checkIfSumIsPair(10, 21, 11));
		assertEquals(false, PlayingWithAlgo.checkIfSumIsPair(11, 20, 10));
		assertEquals(true, PlayingWithAlgo.checkIfSumIsPair(11, 21, 10));
		assertEquals(false, PlayingWithAlgo.checkIfSumIsPair(11, 21, 11));
		assertEquals(false, PlayingWithAlgo.checkIfSumIsPair(10, 20, 11));
	}
	
	@Test
	public void checkIfAllElementsPair() {
		int[] arrayIn = {  2, 10,  4,  6,  8 };
		assertEquals(true, PlayingWithAlgo.checkIfAllElementsPair(arrayIn) );
		int[] arrayIn1 = {  2, 10, 4,  6,  8, 7 };
		assertEquals(false, PlayingWithAlgo.checkIfAllElementsPair(arrayIn1) );
	}
	
	@Test
	public void exportAllElementsPair() {
		int arrayIn[] = {  2, 3, 2, 0,  4, 11, 6,  8 };
		ArrayList<Integer> resultat = new ArrayList<Integer>();
		resultat.add(2);
		resultat.add(2);
		resultat.add(0);
		resultat.add(4);
		resultat.add(6);
		resultat.add(8);
		assertEquals(resultat, PlayingWithAlgo.exportAllElementsPair(arrayIn) );
		int arrayIn1[] = {  9, 3, 11 };
		ArrayList<Integer> resultat1 = new ArrayList<Integer>();
		assertEquals(resultat1, PlayingWithAlgo.exportAllElementsPair(arrayIn1) );
	}
	
	@Test
	public void exportAllUniqueElementsPair() {
		int arrayIn[] = {  2, 3, 2, 0,  4, 11, 6,  8 };
		ArrayList<Integer> resultat = new ArrayList<Integer>();
		resultat.add(2);
		resultat.add(0);
		resultat.add(4);
		resultat.add(6);
		resultat.add(8);
		assertEquals(resultat, PlayingWithAlgo.exportAllUniqueElementsPair(arrayIn) );
		int arrayIn1[] = {  9, 3, 11 };
		ArrayList<Integer> resultat1 = new ArrayList<Integer>();
		assertEquals(resultat1, PlayingWithAlgo.exportAllUniqueElementsPair(arrayIn1) );
		int arrayIn2[] = {  2, 3, 2, 0,  4, 4, 6,  6 };
		ArrayList<Integer> resultat2 = new ArrayList<Integer>();
		resultat2.add(2);
		resultat2.add(0);
		resultat2.add(4);
		resultat2.add(6);
		assertEquals(resultat2, PlayingWithAlgo.exportAllUniqueElementsPair(arrayIn2) );
	}
	
	@Test
	public void checkIfTriangleRectangle() {
		assertEquals(true, PlayingWithAlgo.checkIfTriangleRectangle(3, 4, 5));
		assertEquals(true, PlayingWithAlgo.checkIfTriangleRectangle(5, 4, 3));
		assertEquals(true, PlayingWithAlgo.checkIfTriangleRectangle(5, 3, 4));
		assertEquals(false, PlayingWithAlgo.checkIfTriangleRectangle(5, 3, 3));
		
	}
	
	@Test
	public void checkSiTuPeuxAcheter() {
		assertEquals(false, PlayingWithAlgo.checkSiTuPeuxAcheter(3));
		assertEquals(false, PlayingWithAlgo.checkSiTuPeuxAcheter(24));
		assertEquals(true, PlayingWithAlgo.checkSiTuPeuxAcheter(20));
		assertEquals(false, PlayingWithAlgo.checkSiTuPeuxAcheter(23));
		
	}
	
	@Test
	public void checkCase1() {
		assertEquals(true, PlayingWithAlgo.checkCase1(30.0, 44));
		assertEquals(true, PlayingWithAlgo.checkCase1(120.0, 30));
		assertEquals(true, PlayingWithAlgo.checkCase1(200, 55));
		assertEquals(false, PlayingWithAlgo.checkCase1(200, 10));
		
	}
	
	@Test
	public void checkCase2() {
		assertEquals(true, PlayingWithAlgo.checkCase2(13,14));
		assertEquals(true, PlayingWithAlgo.checkCase2(14,13));
		assertEquals(true, PlayingWithAlgo.checkCase2(21, 14));
		assertEquals(true, PlayingWithAlgo.checkCase2(13, 8));		
	}
	
	@Test
	public void checkCase2a() {
		assertEquals(true, PlayingWithAlgo.checkCase2a(13,14));
		assertEquals(true, PlayingWithAlgo.checkCase2a(14,13));
		assertEquals(false, PlayingWithAlgo.checkCase2a(21, 14));
		assertEquals(false, PlayingWithAlgo.checkCase2a(13, 8));		
	}
	

	@Test
	public void checkCase3() {
		assertEquals(true, PlayingWithAlgo.checkCase3(13,14,17));
		assertEquals(true, PlayingWithAlgo.checkCase3(14,13, 10));
		assertEquals(false, PlayingWithAlgo.checkCase3(21, 14, 15));
		assertEquals(false, PlayingWithAlgo.checkCase3(5, 13, 8));		
	}
	
	@Test
	public void allElementsExceptFirstAndLast() {
		int[] arrayIn = {  2, 3, 2, 0,  4, 11, 6,  8 };
		ArrayList<Integer> resultat = new ArrayList<Integer>();
		resultat.add(3);
		resultat.add(2);
		resultat.add(0);
		resultat.add(4);
		resultat.add(11);
		resultat.add(6);
		assertEquals(resultat, PlayingWithAlgo.allElementsExceptFirstAndLast(arrayIn) );
		int[] arrayIn1 = {  9, 3, 11 };
		ArrayList<Integer> resultat1 = new ArrayList<Integer>();
		resultat1.add(3);
		assertEquals(resultat1, PlayingWithAlgo.allElementsExceptFirstAndLast(arrayIn1) );
		int[] arrayIn2 = {  2, 3 };
		ArrayList<Integer> resultat2 = new ArrayList<Integer>();
		assertEquals(resultat2, PlayingWithAlgo.allElementsExceptFirstAndLast(arrayIn2) );
	}
	
	@Test
	public void allElementsExceptFirstAndLastInt() {
		int[] arrayIn = {2, 3, 2, 0, 4, 11, 6,  8 };
		int[] arrayOut = {  3, 2, 0, 4, 11, 6 };	
		assertArrayEquals(arrayOut, PlayingWithAlgo.allElementsExceptFirstAndLastInt(arrayIn) );
		int[] arrayIn1 = {9, 3, 11 };
		int[] arrayOut1 = { 3 };
		assertArrayEquals(arrayOut1, PlayingWithAlgo.allElementsExceptFirstAndLastInt(arrayIn1) );
		int[] arrayIn2 = { 2, 3 };
		int[] arrayOut2 = {};
		assertArrayEquals(arrayOut2, PlayingWithAlgo.allElementsExceptFirstAndLastInt(arrayIn2) );
	}
	
	@Test
	public void allElementsWithIndexPair() {
		int[] arrayIn = {  2, 3, 2, 0,  4, 11, 6,  8 };
		ArrayList<Integer> resultat = new ArrayList<Integer>();
		resultat.add(2);
		resultat.add(2);
		resultat.add(4);
		resultat.add(6);
		assertEquals(resultat, PlayingWithAlgo.allElementsWithIndexPair(arrayIn) );
		int[] arrayIn1 = {  9, 3, 11 };
		ArrayList<Integer> resultat1 = new ArrayList<Integer>();
		resultat1.add(9);
		resultat1.add(11);
		assertEquals(resultat1, PlayingWithAlgo.allElementsWithIndexPair(arrayIn1) );
		int[] arrayIn2 = {  2, 3 };
		ArrayList<Integer> resultat2 = new ArrayList<Integer>();
		resultat2.add(2);
		assertEquals(resultat2, PlayingWithAlgo.allElementsWithIndexPair(arrayIn2) );
	}
	
	@Test
	public void reverseOrder() {
		int[] arrayIn = {  2, 3, 2, 0,  4, 11, 6,  8 };
		ArrayList<Integer> resultat = new ArrayList<Integer>();
		resultat.add(8);
		resultat.add(6);
		resultat.add(11);
		resultat.add(4);
		resultat.add(0);
		resultat.add(2);
		resultat.add(3);
		resultat.add(2);
		assertEquals(resultat, PlayingWithAlgo.reverseOrder(arrayIn) );
		int[] arrayIn1 = {  9, 3, 11 };
		ArrayList<Integer> resultat1 = new ArrayList<Integer>();
		
		resultat1.add(11);
		resultat1.add(3);
		resultat1.add(9);
		assertEquals(resultat1, PlayingWithAlgo.reverseOrder(arrayIn1) );
		int[] arrayIn2 = {  2, 3 };
		ArrayList<Integer> resultat2 = new ArrayList<Integer>();
		resultat2.add(3);
		resultat2.add(2);
		assertEquals(resultat2, PlayingWithAlgo.reverseOrder(arrayIn2) );
	}
	
	@Test
	public void reverseOrderInt() {
		int[] arrayIn = {  2, 3, 2, 0,  4, 11, 6,  8 };
		int[] arrayOut = {  8,6,11,4,0,2,3,2 };
		
		assertArrayEquals(arrayOut, PlayingWithAlgo.reverseOrderInt(arrayIn) );
		int[] arrayIn1 = {  9, 3, 11 };
		int[] arrayOut1 = {  11,3,9 };
		assertArrayEquals(arrayOut1, PlayingWithAlgo.reverseOrderInt(arrayIn1) );
		int[] arrayIn2 = {  2, 3 };
		int[] arrayOut2 = {3,2};
		assertArrayEquals(arrayOut2, PlayingWithAlgo.reverseOrderInt(arrayIn2) );
	}
	
	@Test
	public void insertElementInTheMiddleOfAnArray() {
		int element = -7;
		int[] arrayIn = {  2, 3, 2, 0, 4, 11, 6,  8 };
		ArrayList<Integer> resultat = new ArrayList<Integer>();
		resultat.add(2);
		resultat.add(3);
		resultat.add(2);
		resultat.add(0);
		resultat.add(element);
		resultat.add(4);
		resultat.add(11);
		resultat.add(6);
		resultat.add(8);
		assertEquals(resultat, PlayingWithAlgo.insertElementInTheMiddleOfAnArray(arrayIn, element) );
		int[] arrayIn1 = {  9, 3, 11 };
		ArrayList<Integer> resultat1 = new ArrayList<Integer>();		
		resultat1.add(9);
		resultat1.add(element);
		resultat1.add(3);
		resultat1.add(11);
		assertEquals(resultat1, PlayingWithAlgo.insertElementInTheMiddleOfAnArray(arrayIn1, element) );
		int[] arrayIn2 = {  2, 3 };
		ArrayList<Integer> resultat2 = new ArrayList<Integer>();
		resultat2.add(2);
		resultat2.add(element);
		resultat2.add(3);
		assertEquals(resultat2, PlayingWithAlgo.insertElementInTheMiddleOfAnArray(arrayIn2, element) );
	}
	
	
	@Test
	public void exportElementsPair() {
		
		ArrayList<Integer> in = new ArrayList<Integer>();
		in.add(2);
		in.add(3);
		in.add(2);
		in.add(0);
		in.add(-7);
		in.add(4);
		in.add(11);
		in.add(6);
		in.add(8);
		ArrayList<Integer> out = new ArrayList<Integer>();
		out.add(2);
		out.add(2);
		out.add(0);
		out.add(4);
		out.add(6);
		out.add(8);
		assertEquals(out, PlayingWithAlgo.exportElementsPair(in) );
		ArrayList<Integer> in2 = new ArrayList<Integer>();
		in2.add(2);
		in2.add(3);
		ArrayList<Integer> out2 = new ArrayList<Integer>();
		out2.add(2);
		assertEquals(out2, PlayingWithAlgo.exportElementsPair(in2) );
	}
	
	@Test
	public void exportElementsWithIndexPair() {
		
		ArrayList<Integer> in = new ArrayList<Integer>();
		in.add(2);
		in.add(3);
		in.add(2);
		in.add(0);
		in.add(-7);
		in.add(4);
		in.add(11);
		in.add(6);
		in.add(8);
		ArrayList<Integer> out = new ArrayList<Integer>();
		out.add(2);
		out.add(2);
		out.add(-7);
		out.add(11);
		out.add(8);
		assertEquals(out, PlayingWithAlgo.exportElementsWithIndexPair(in) );
		ArrayList<Integer> in2 = new ArrayList<Integer>();
		in2.add(2);
		in2.add(3);
		ArrayList<Integer> out2 = new ArrayList<Integer>();
		out2.add(2);
		assertEquals(out2, PlayingWithAlgo.exportElementsWithIndexPair(in2) );
	}
	
	@Test
	public void Addition() {
		
		HashMap<String,Integer> in = new HashMap<String,Integer>();
		in.put("chicken", 22);
		in.put("curry", 18);
		in.put("coffee", 2);
		assertEquals(42, PlayingWithAlgo.Addition(in) );
	}
	
	@Test
	public void checkIfStringStartsWithA() {
		
		assertEquals(false, PlayingWithAlgo.checkIfStringStartsWithA( "kuku" ) );
		assertEquals(true, PlayingWithAlgo.checkIfStringStartsWithA( "assert" ) );
		assertEquals(true, PlayingWithAlgo.checkIfStringStartsWithA( "Amour" ) );
	}
	
	@Test
	public void checkIfStringStartsWithVowel() {

		assertEquals(false, PlayingWithAlgo.checkIfStringStartsWithVowel( "kuku" ) );
		assertEquals(true, PlayingWithAlgo.checkIfStringStartsWithVowel( "assert" ) );
		assertEquals(true, PlayingWithAlgo.checkIfStringStartsWithVowel( "Amour" ) );
		assertEquals(true, PlayingWithAlgo.checkIfStringStartsWithVowel( "ola" ) );
		assertEquals(true, PlayingWithAlgo.checkIfStringStartsWithVowel( "Ola" ) );
		assertEquals(true, PlayingWithAlgo.checkIfStringStartsWithVowel( "eoee" ) );
		assertEquals(true, PlayingWithAlgo.checkIfStringStartsWithVowel( "Ecran" ) );
		assertEquals(true, PlayingWithAlgo.checkIfStringStartsWithVowel( "ioee" ) );
		assertEquals(true, PlayingWithAlgo.checkIfStringStartsWithVowel( "Icran" ) );
		assertEquals(true, PlayingWithAlgo.checkIfStringStartsWithVowel( "ioee" ) );
		assertEquals(true, PlayingWithAlgo.checkIfStringStartsWithVowel( "Icran" ) );
		assertEquals(true, PlayingWithAlgo.checkIfStringStartsWithVowel( "utile" ) );
		assertEquals(true, PlayingWithAlgo.checkIfStringStartsWithVowel( "Utile" ) );
		assertEquals(true, PlayingWithAlgo.checkIfStringStartsWithVowel( "ygrek" ) );
		assertEquals(true, PlayingWithAlgo.checkIfStringStartsWithVowel( "YGY" ) );
	}
	
	@Test
	public void checkIfStringEndsWithS() {
		
		assertEquals(false, PlayingWithAlgo.checkIfStringEndsWithS( "kuku" ) );
		assertEquals(true, PlayingWithAlgo.checkIfStringEndsWithS( "asserts" ) );
		assertEquals(true, PlayingWithAlgo.checkIfStringEndsWithS( "AmourS" ) );
	}
	
	@Test
	public void findShortestWord() {
		String[] arrayIn = {  "grrr", "kuku", "la", "ouf",  "mu" };
		assertEquals("la", PlayingWithAlgo.findShortestWord(arrayIn) );
	}
	
	@Test
	public void swapFirstandLastLetter() {
		
		assertEquals("uukk",PlayingWithAlgo.swapFirstandLastLetter( "kuku" ) );
		assertEquals("uu",PlayingWithAlgo.swapFirstandLastLetter( "uu" ) );
		assertEquals("sa",PlayingWithAlgo.swapFirstandLastLetter( "as" ) );
		assertEquals("eoj",PlayingWithAlgo.swapFirstandLastLetter( "joe" ) );
	}
	
	@Test
	public void swapFirstandLastElement() {
		int[] arrayIn = {  2, 3, 2, 0,  4, 11, 6,  8 };
		int[] arrayOut = {  8, 3, 2, 0,  4, 11, 6,  2 };
		assertArrayEquals( arrayOut, PlayingWithAlgo.swapFirstandLastElement(arrayIn));
		int[] arrayIn1 = {  2, 3, 2, 0,  4, 11, 6,  2 };
		assertArrayEquals( arrayIn1, PlayingWithAlgo.swapFirstandLastElement(arrayIn1));
		int[] arrayIn2 = {  2 };
		assertArrayEquals( arrayIn2, PlayingWithAlgo.swapFirstandLastElement(arrayIn2));
	}

}
