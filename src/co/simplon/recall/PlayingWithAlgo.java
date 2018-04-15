package co.simplon.recall;

import java.lang.reflect.Array;
import java.util.*;

public class PlayingWithAlgo {

	public static String helloWorld(String name) {
		String message;
		// message = name == "" ? "Hello World": "Hello "+name;
		if (name == "")
			message = "Hello World";
		else
			message = "Hello " + name;
		return message;
	}

	public static List<String> selectElementsStartingWithA(String array[]) {
		List<String> resultat = new ArrayList<String>();
		// condition recherche lettre
		for (int i = 0; i < array.length; i++) {
			if (array[i].charAt(0) == 'a') {
				resultat.add(array[i]);
			}

		}

		return resultat;
	}

	public static List<String> selectElementsStartingWithVowel(String array[]) {
		List<String> listePremiere = new ArrayList<String>();
		// List<String> listeFinale = new ArrayList<String>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null && (array[i].charAt(0) == 'a' || array[i].charAt(0) == 'e' || array[i].charAt(0) == 'o'
					|| array[i].charAt(0) == 'u' || array[i].charAt(0) == 'i')) {
				listePremiere.add(array[i]);
			}
		}
		return listePremiere;
	}

	public static String[] removeNullElements(String array[]) {
		ArrayList<String> resultat = new ArrayList<String>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				resultat.add(array[i]);
			}
		}
		return resultat.toArray(new String[resultat.size()]);

	}

	public static String[] reverseWordsInMyStringArray(String array[]) {
		ArrayList<String> tableau = new ArrayList<String>();
		String tableauNew[] = new String[tableau.size()];
		for (int i = 0; i < array.length; i++) {
			String reverse = new StringBuilder(array[i]).reverse().toString();
			tableau.add(reverse);
		}
		tableauNew = tableau.toArray(tableauNew);
		return tableauNew;
	}

	public static String[] reverseOrderInArray(String array[]) {
		String[] reverse = array;

		for (int i = 0; i < array.length / 2; i++) {
			String temp = array[i];
			reverse[i] = array[array.length - i - 1];
			reverse[array.length - i - 1] = temp;
		}
		return reverse;

	}

	public static String[][] everyPossiblePair(String array[]) {
		return null;
	}

	public static List<String> sortByLastLetter(String array[]) {
		ArrayList<String> resultat = new ArrayList<String>();
		String[] temp = new String[array.length];

		for (int i = 0; i < array.length; i++) {
			StringBuilder buffer = new StringBuilder(array[i]);
			String lettreInverse = buffer.reverse().toString();
			temp[i] = lettreInverse;
		}
		Arrays.sort(temp);

		for (int i = 0; i < array.length; i++) {
			StringBuilder buffer = new StringBuilder(temp[i]);
			String lettreInverse = buffer.reverse().toString();
			resultat.add(lettreInverse);
		}

		return resultat;

	}

	public static String getFirstHalf(String string) {
		String moitie = string;
		int resultat = string.length() / 2;
		if (resultat % 2 == 0)
			return moitie.substring(0, resultat + 1);
// pas besoin de else puisqu'on sort de la condition
		return moitie.substring(0, resultat);

	}

	public static String exportWordWithoutALetter(String array[], char letter) {
		boolean test = true;
		String retour = "Perdu !";
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null && i < array.length - 1)
				continue;
				//i++;
			else if (array[i] != null) {
				array[i] = array[i].toLowerCase();
				for (int j = 0; j < array[i].length(); j++) {
					System.out.println(array[i].charAt(j));
					if (letter == array[i].charAt(j)) {
						test = false;
						i++;
						j = -1;
						System.out.println(array[i] + test);

					} else if (test && j == (array[i].length() - 1)) {
						retour = array[i];
						System.out.println(retour);
						System.out.println(test);
						return retour;
					}
				}
			}
		}
		System.out.println(retour);
		return retour;
	}

	public static int numberOfPalindromeWord(String text) {
		String tableau[] = text.split("'");
		int compteur = 0;
		for (int i = 0; i < tableau.length; i++) {
			String origin = tableau[i];
			String reverse = new StringBuilder(origin).reverse().toString();
			if (origin.equals(reverse)) {
				compteur++;
			}
		}
		return compteur;
	}

	public static int numberOfPalindromeText(String text) {
		String tableau[] = text.split(",");
		int compteur = 0;
		for (int i = 0; i < tableau.length; i++) {
			String exclusion = tableau[i].replaceAll("\\p{Punct}", "").toLowerCase();
			String origin = exclusion.replace(" ", "");
			String reverse = new StringBuilder(origin).reverse().toString();
			if (reverse.equals(origin)) {
				compteur++;
			}
		}
		return compteur;
	}

	public static String shortestWord(String text) {
		String[] phrase = text.split(" ");
		String mot = phrase[0];
		for (int i = 1; i < phrase.length; i++) {
			if (mot.length() > phrase[i].length()) {
				mot = phrase[i];
			}
		}
		return mot;
	}

	public static String longestWord(String text) {
		String exclusion = text.replaceAll("\\p{Punct}", "");
		String[] phrase = exclusion.split(" ");
		String mot = phrase[0];
		for (int i = 1; i < phrase.length; i++) {
			if (mot.length() < phrase[i].length()) {
				mot = phrase[i];
			}
		}
		return mot;
	}

	public static String getAllLetters(String[] array) {
		ArrayList<Character> liste = new ArrayList<Character>();
		String lettre = Arrays.toString(array); // transforme le tableau d'entrée en String
		lettre = lettre.replaceAll("[^a-zA-Z]", ""); // Regex qui exclu les espaces
		char[] tabChar = lettre.toCharArray(); // fait un tableau de char
		Arrays.sort(tabChar); // tri un tableau de char
		String resultat = new String(tabChar); // String à partir du char[] trié

		// boucle ajouter les lettres à la liste
		for (int i = 0; i < resultat.length(); i++) {
			liste.add(resultat.charAt(i));
		}

		// refait la liste sans doublon
		Set<Character> listeSansDoublon = new TreeSet<Character>();
		listeSansDoublon.addAll(liste);
		List<Character> listeFinale = new ArrayList<Character>(listeSansDoublon);

		// on refait le String final
		String resultatFinal = new String();
		for (char c : listeFinale) {
			resultatFinal = resultatFinal + c;
		}
		return resultatFinal;
	}

	public static String removeCapitals(String text) {
		String exclusion = text.replaceAll("[A-Z]", "");
		return exclusion;
	}

	public static String formatDateNicely(String text) {
		return null;
	}

	public static String getDomainName(String email) {
		String domaine = email.replaceAll("^.+@(.+)\\..+$", "$1");
		return domaine;
	}

	public static String titleize(String title) {
		return null;
	}

	public static boolean checkForSpecialCharacters(String string) {
		if (string.matches("^.*\\p{Punct}.*$")) {
			return true;
		}
		return false;
	}

	public static String[] findAnagrams(String name) {
		return null;
	}

	public static int[] letterPosition(String name) {
		return null;
	}

	public static long addingTwoNumbers(long number1, long number2) {
		long somme = number1 + number2;
		return somme;
	}

	public static long addingThreeNumbers(long number1, long number2, long number3) {
		long somme = number1 + number2 + number3;
		return somme;
	}

	public static long addingSeveralNumbers(final long... numbers) {
		long sum = 0;
		for (long number : numbers) {
			sum = sum + number;
		}
		return sum;
	}

	public static int[] allElementsExceptFirstThree(int array[]) {
		return null;
	}

	public static int[] addElementToBeginning(int array[], int element) {
		return null;
	}

	public static Float makeNegative(Float number) {
		float reponse = 0;
		if (number > 0) {
			reponse = number * (-1);
		} else {
			reponse = number;
		}
		return reponse;
	}

	public static String[] getElementsLowerThanSix(String[] array) {
		return null;
	}

	public static int[] sortTabBySelection(int[] array) {
		return null;
	}

	public static int[] sortTabByInsertion(int[] array) {
		return null;
	}

	public static int[] sortTabByBubble(int[] array) {
		return null;
	}

	public static int findIndexByDichotomy(int elemet, int[] array) {
		return 0;
	}

	public static int roundUp(float number) {
		return 0;
	}

	public static int findLastDayOfMonth(int month, int year) {
		return 0;
	}

	public static int factorial(int number) {
		return 0;
	}

	public static int convertToCelsius(int temperature) {
		int reponse = (int) Math.round((temperature - 32) / 1.8);
		return reponse;
	}

	public static boolean checkIfPair(int number) {
		boolean verif = true;
		int pair = number % 2;
		if (pair == 0) {
			verif = true;
		} else {
			verif = false;
		}
		return verif;
	}

	public static boolean checkIfPairPairImpair(int number1, int number2, int number3) {
		int pair1 = number1 % 2;
		int pair2 = number2 % 2;
		int impair = number3 % 2;
		if (pair1 == 0 && pair2 == 0 && impair != 0) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean checkIfSumIsPair(int number1, int number2, int number3) {
		boolean verif = true;
		if ((number1 + number2 + number3) % 2 == 0) {
			verif = true;
		} else {
			verif = false;
		}
		return verif;
	}

	public static boolean checkIfAllElementsPair(int[] array) {
		boolean verif = true;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				verif = true;
			} else {
				verif = false;
			}
		}
		return verif;
	}

	public static ArrayList<Integer> exportAllElementsPair(int[] array) {
		ArrayList<Integer> pair = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {

			if (array[i] % 2 == 0) {
				pair.add(array[i]);
			}
		}
		return pair;
	}

	public static ArrayList<Integer> exportAllUniqueElementsPair(int[] array) {
		return null;
	}

	public static boolean checkIfTriangleRectangle(int number1, int number2, int number3) {
		boolean reponse = true;
		int cote1 = number1 * number1;
		int cote2 = number2 * number2;
		int cote3 = number3 * number3;
		if (cote1 + cote2 == cote3 || cote2 + cote3 == cote1 || cote1 + cote3 == cote2) {
			reponse = true;
		} else {
			reponse = false;
		}
		return reponse;
	}

	public static boolean checkSiTuPeuxAcheter(int prix) {
		// t'as 22 euros en monnaies de 2 euros, la machine ne rend pas de monnaie,
		// check si tu peux payer
		boolean reponse = true;
		if (prix % 2 == 0 && prix <= 22) {
			reponse = true;
		} else {
			reponse = false;
		}
		return reponse;
	}

	public static boolean checkCase1(double prix, int pourcentDeRemise) {
		// t'as 100 euros, verifie si tu peux acheter l'article solde
		boolean reponse = true;
		double prixSolde = 0;
		prixSolde = prix - (prix * pourcentDeRemise / 100);
		if (prixSolde <= 100) {
			reponse = true;
		} else {
			reponse = false;
		}
		return reponse;
	}

	public static boolean checkCase2(int number1, int number2) {
		// check si une de 2 chiffres, ou leur somme se divise par 7
		boolean reponse = true;
		int divisible1 = number1 % 7;
		int divisible2 = number2 % 7;
		int divisible3 = (number1 + number2) % 7;
		if (divisible1 == 0 || divisible2 == 0 || divisible3 == 0) {
			reponse = true;
		} else {
			reponse = false;
		}
		return reponse;
	}

	public static boolean checkCase2a(int number1, int number2) {
		// check si une de 2 chiffres mais pas leur somme se divise par 7
		boolean reponse = true;
		int divisible1 = number1 % 7;
		int divisible2 = number2 % 7;
		int somme = (number1 + number2) % 7;
		if ((divisible1 == 0 || divisible2 == 0) && somme != 0) {
			reponse = true;
		} else {
			reponse = false;
		}
		return reponse;
	}

	public static boolean checkCase3(int number1, int number2, int number3) {
		// check si les trois chiffres sont dans l'ordre, soit croissant ou decroissant
		boolean reponse = true;
		if (number1 > number2 && number2 > number3 || number1 < number2 && number2 < number3) {
			reponse = true;
		} else {
			reponse = false;
		}
		return reponse;
	}

	public static ArrayList<Integer> allElementsExceptFirstAndLast(int array[]) {

		return null;
	}

	public static int[] allElementsExceptFirstAndLastInt(int array[]) {
		return null;
	}

	public static ArrayList<Integer> allElementsWithIndexPair(int array[]) {
		return null;
	}

	public static ArrayList<Integer> reverseOrder(int array[]) {
		return null;
	}

	public static int[] reverseOrderInt(int array[]) {
		return null;
	}

	public static ArrayList<Integer> insertElementInTheMiddleOfAnArray(int array[], int element) {
		return null;
	}

	public static ArrayList<Integer> exportElementsPair(ArrayList<Integer> list) {

		return null;
	}

	public static ArrayList<Integer> exportElementsWithIndexPair(ArrayList<Integer> list) {
		return null;
	}

	public static int Addition(HashMap<String, Integer> addition) {
		
		return 0;
	}

	public static boolean checkIfStringStartsWithA(String word) {
		// boolean verif = true;
		if (word.charAt(0) == 'a' || word.charAt(0) == 'A') {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkIfStringStartsWithVowel(String word) {
		if (word.charAt(0) == 'a' || word.charAt(0) == 'A' || word.charAt(0) == 'e' || word.charAt(0) == 'E'
				|| word.charAt(0) == 'i' || word.charAt(0) == 'I' || word.charAt(0) == 'o' || word.charAt(0) == 'O'
				|| word.charAt(0) == 'u' || word.charAt(0) == 'U' || word.charAt(0) == 'y' || word.charAt(0) == 'Y') {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkIfStringEndsWithS(String word) {
		if (word.charAt(word.length() - 1) == 's' || word.charAt(word.length() - 1) == 'S') {
			return true;
		} else {
			return false;
		}
	}

	public static String findShortestWord(String[] array) {
		return null;
	}

	public static String swapFirstandLastLetter(String[] array) {
		String resultat = array;

		int taille = resultat.length() - 1;
		char premier = resultat.charAt(0);
		char dernier = resultat.charAt(taille);

		resultat = resultat.replaceAll("(^.)", Character.toString(dernier));
		resultat = resultat.replaceAll("(.$)", Character.toString(premier));

		return resultat;
	}

	public static int[] swapFirstandLastElement(int[] array) {
		return null;
	}

}
