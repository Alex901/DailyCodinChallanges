import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static java.util.Comparator.comparing;

import javax.jws.Oneway;

public class dcMain {

	public static void main(String[] args) {
		twoHundredAndThirtyFive();
	}

	// Problem 1
	public static void One() {
		int k;
		int[] a = { 1, 9, 3, 12, 4, 8, 13 };
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter k:");
		k = scan.nextInt();

		findK(a, k);
	}

	private static boolean findK(int[] a, int k) {
		if (a.length > 0) {
			for (int i = 0; i < a.length; i++) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] + a[j] == k) {
						System.out.println("MATCH FOUND");
						System.out.println(a[i] + "+" + a[j] + "=" + k);
						return true;
					}
				}
			}
			System.out.println("No match for k found in a.");
			return false;
		} else {
			System.out.println("Error in input, a is empty");
			return false;
		}
	}

	// Problem2
	public static void Two() {
		int a[] = { 1, 1, 2, 2, 4, 4, 1, 1, 2, 2, 2, 1, 1, 3, 5, 5, 5 };
		int b[] = a.clone(); // result Array

		if (a.length > 0) {

			for (int i = 0; i < a.length; i++) {
				b[i] = 1;
				for (int j = 0; j < a.length; j++) {
					if (i != j) {
						b[i] = b[i] * a[j];
					}
				}
			}

		} else {
			System.err.append("Plis, no numbers in array");
		}

		// Print result
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

	public static void Four() {
		int a[] = { 1, 2, 0 };

		printArray(a);
		System.out.println();
		System.out.println("smallest missing positive integer in a is " + " "
				+ smallestMissingPositive(a));
	}

	private static int smallestMissingPositive(int[] x) {
		Arrays.sort(x);
		int smallest = 0;

		if (x.length <= 0) {
			System.err.append("Empty array");
		} else if (x.length == 1) {
			if (x[0] == 1) {
				return 2;
			} else {
				return 1;
			}
		} else {
			for (int i = 0; i < x.length; i++) {
				if (smallest == 0) { // Find base smallest
					if (x[i] > 0) {
						smallest = x[i];
					}
				} else {
					if (x[i] == (smallest + 1)) {
						smallest = x[i];
					} else {
						return smallest + 1;
					}
				}
			}
		}
		return smallest + 1;

	}

	public static void Nine() {
		int[] a = { 2, 4, 6, 2, 5 };
		int[] b = { 5, 1, 1, 5 };
		int[] c = { 1, 2, 5, -19, 13, -2 };

		System.out.println("Largest sum derived from a is " + maxSum(a));
		System.out.println("Largest sum derived from a is " + maxSum(b));
		System.out.println("Largest sum derived from a is " + maxSum(c));

	}

	public static void Fourty() {

		int[] a = { 9, 9, 3, 9 };
		int[] b = { 1, 1, 1, 2, 3, 3, 3, 4, 4, 4 };
		int[] c = { 1, 2, 3, 2, 3, 1, 1, 2, 3, 5, 4, 8, 8, 4, 4, 8 };
		int[] d = { 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 7, 4, 5, 5, 5, 6, 6, 6, 8,
				8, 8, 9, 9, 9 };

		long startx = System.nanoTime();
		System.out.println("The number that only occurs once in a is "
				+ findTheOneTakeThree(a));
		long stopx = System.nanoTime();
		long runtimex = stopx - startx;
		System.out.println("runtime = " + runtimex + " ns");

		long start = System.nanoTime();
		System.out.println("The number that only occurs once in a is "
				+ findTheOneTakeThree(a));
		long stop = System.nanoTime();
		long runtime = stop - start;
		System.out.println("runtime = " + runtime + " ns");

		long start1 = System.nanoTime();
		System.out.println("The number that only occurs once in b is "
				+ findTheOneTakeThree(b));
		long stop1 = System.nanoTime();
		long runtime1 = stop1 - start1;
		System.out.println("runtime = " + runtime1 + " ns");

		long start2 = System.nanoTime();
		System.out.println("The number that only occurs once in c is "
				+ findTheOneTakeThree(c));
		long stop2 = System.nanoTime();
		long runtime2 = stop2 - start2;
		System.out.println("runtime = " + runtime2 + " ns");

		long start3 = System.nanoTime();
		System.out.println("The number that only occurs once in d is "
				+ findTheOneTakeTwo(d));
		long stop3 = System.nanoTime();
		long runtime3 = stop3 - start3;
		System.out.println("runtime = " + runtime3 + " ns");
	}

	public static void fourtyFour() {
		int[] a = { 1, 2, 3, 4, 5 }; // 0
		int[] b = { 5, 4, 3, 2, 1 }; // 10
		int[] c = { 2, 4, 1, 3, 5 }; // 3

		System.out.println("Out of order index for a is " + outOfOrder(a));
		System.out.println("Out of order index for a is  " + outOfOrder(b));
		System.out.println("Out of order index for a is  " + outOfOrder(c));
	}

	public static void fourtySeven() {
		int[] a = { 9, 11, 8, 5, 7, 10 }; // 5,5,10
		int[] b = { 11, 9, 8, 5, 7, 3 }; // 2,5,7
		int[] c = { 9, 11, 8, 5, 8, 3 }; // 3,5,8
		int[] d = { 9, 11, 8, 5, 4, 3 }; // 2,9,11
		int[] e = { 9, 7, 6, 4, 3, 1 }; // nope

		int[] result = whatCouldHaveBeen(d);
		if (result[0] != 0) {
			System.out.println("Biggest ravenue you could have had from a is "
					+ result[0] + " if you would have bought at " + result[1]
					+ " and sold at " + result[2]);
		} else {
			System.out.println("No gains here, go home");
		}
	}

	public static void fourtyEight() {
		String[] preOrder = { "a", "b", "d", "e", "c", "f", "g" };
		String[] inOrder = { "d", "b", "e", "a", "f", "c", "g" };

		Node[] pre = new Node[preOrder.length];
		Node[] in = new Node[inOrder.length];

		for (int i = 0; i < preOrder.length; i++) {
			pre[i] = new Node(preOrder[i]);
		}

		for (int i = 0; i < inOrder.length; i++) {
			in[i] = new Node(inOrder[i]);
		}

		printTreePreOrder(pre);
		System.out.println("\n ------------------------------ \n");
		printTreeInOrder(in);
	}

	// TODO: GET BACK HERE!
	public static void fourtyNine() {
		int[] numbers1 = { 34, -50, 42, 14, -5, 86 }; // 137
		int[] numbers2 = { 1, 2, 3, 4, 5 }; // 15
		int[] numbers3 = { -5, -1, -8, -9 }; // 0
	}

	public static int maxSequence(int[] a) {
		int result = 0;

		return result;
	}

	public static void fiftyOne() {
		int[] cards = new int[52];

		for (int i = 0; i < cards.length; i++) {
			cards[i] = i;
		}

		System.out.println("\nUnhuffeled");
		for (int i = 0; i < cards.length; i++) {
			System.out.print(cards[i] + " ");
		}

		cards = shuffle(cards);

		System.out.println("\nUnhuffeled");
		for (int i = 0; i < cards.length; i++) {
			System.out.print(cards[i] + " ");
		}
	}

	public static void sixtyThree() {
		String[][] wordMatrix = { { "F", "A", "C", "I" },
				{ "O", "B", "Q", "P" }, { "A", "N", "O", "B" },
				{ "M", "A", "S", "S" } };
		String word1 = "FOAM";
		String word2 = "MASS";
		String word3 = "NOB";
		;
		String word4 = "A";
		String word5 = "OS";
		String word6 = "G";
		String word7 = "NOQ";

		System.out.println("The word " + word1 + " is present? "
				+ findWord(wordMatrix, word1));
		System.out.println("The word " + word2 + " is present? "
				+ findWord(wordMatrix, word2));
		System.out.println("The word " + word3 + " is present? "
				+ findWord(wordMatrix, word3));
		System.out.println("The word " + word4 + " is present? "
				+ findWord(wordMatrix, word4));
		System.out.println("The word " + word5 + " is present? "
				+ findWord(wordMatrix, word5));
		System.out.println("The word " + word6 + " is present? "
				+ findWord(wordMatrix, word6));
		System.out.println("The word " + word7 + " is present? "
				+ findWord(wordMatrix, word7));

	}

	// TODO: Not done
	public static void sixtyFive() {
		int[][] mat = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 },
				{ 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };
		int row = mat.length;
		int col = mat[0].length;
		printSpiral(mat);
	}

	public static void oneHundredAndTwentyOne() {
		// waterrfetawx
		String theString = "aibiak";
		String cachedString = theString;
		System.out.println("input: " + theString);
		int k = 3;

		for (int i = 0; i < k; i++) {
			if (isPalindrome(theString)) {
				System.out.println("hurray " + theString
						+ " is a paldindrome!!!");
				System.exit(0);
			} else {
				theString = adjustString(theString, k - i);
			}
			System.out.println(i);
		}

		if (!isPalindrome(theString)) {
			System.out.println("No way to create a palindrome from "
					+ cachedString + " by removing " + k
					+ " letters, sorry! Go home");
		} else {
			System.out.println("hurray " + theString + " is a paldindrome!!!");
		}
	}

	public static void oneHundredAndThirty() {
		int k = 7;
		int pos = 0;
		int[] prices = new int[] { 5, 2, 4, 0, 1 }; // 3
		int[] profits = new int[factAdd(prices.length - 1)];
		int totalProfit = 0;
		// ArrayList<BuySell> profits = new ArrayList<BuySell>();

		for (int i = 0; i < prices.length - 1; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				profits[pos] = prices[j] - prices[i];
				System.out.println("DEBUG:   pos: " + pos + " profit: "
						+ profits[pos]);
				pos++;
			}
		}

		for (int i = 0; i < profits.length; i++) {
			System.out.println(profits[i]);
		}

		Arrays.sort(profits);
		System.out.println("-----SORT-----");

		for (int i = 0; i < profits.length; i++) {
			System.out.println(profits[i]);
		}

		System.out.println("--------------------------");

		for (int i = profits.length; i > profits.length - k; i--) {
			if (profits[i - 1] > 0) {
				totalProfit += profits[i - 1];
			}
		}

		System.out.println("Best profit you can get: " + totalProfit);
	}

	private static void twoHundredAndThirtyFive() {

		// comp < 2*(N-2)
		int[] n = { 8, 11, 5, 3, 4, 9, 6, 1, 7, 2, 10, 0 }; // comp < 20,
		int min = 0;
		int max = 0;
		int comp = 0;
		
		if(n[0] > n[1]){
			max = n[0];
			min = n[1];
			comp++;
		} else {
			min = n[0];
			max = n[1];
			comp++;
		}
		
		for(int i = 2; i < n.length; i++){
			if(n[i] > max){
				max = n[i];
				comp++;
			} else if(n[i] < min){
				min = n[i];
				comp = comp+2;
			}
		}
		
		System.out.println("Min: " + min + " Max: " + max + " in " + comp + " comparisons");
		
	}

	private static int factAdd(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n + factAdd(n - 1);
		}
	}

	private static int factMul(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * factAdd(n - 1);
		}
	}

	private static String adjustString(String s, int k) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				if (s.charAt(i + 1) == s.charAt(s.length() - i - 1)) {
					// index i ska bort
					s = removeCharAt(s, i);
					break;
				} else {
					s = removeCharAt(s, s.length() - i - 1);
					break;
				}
			}
		}
		return s;
	}

	private static String removeCharAt(String s, int pos) {
		System.out.println("Removing " + s.charAt(pos));
		return s.substring(0, pos) + s.substring(pos + 1);
	}

	private static boolean isPalindrome(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

	private static void printSpiral(int[][] mat) {
		// System.out.println("\n" + row + "-" + col + "\n");
		// int start = 0;
		// for(int i = 0; i < row; i++){
		// for(int j = 0; j < col; j++){
		// System.out.print(mat[i][j] + " ");
		// }
		// System.out.println();
		// }
	}

	private static boolean findWord(String matrix[][], String wordToFind) {
		char first = wordToFind.charAt(0);
		boolean shortWord = false;

		if (wordToFind.length() == 1) {
			shortWord = true;
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j].charAt(0) == first && shortWord) {
					return true;
				} else {
					if (matrix[i][j].charAt(0) == first) {
						if (searchRow(matrix, wordToFind, i, j)) {
							return true;
						} else if (searchCol(matrix, wordToFind, i, j)) {
							return true;
						}
					}
				}
			}
		}

		return false;
	}

	private static boolean searchRow(String matrix[][], String wordToFind,
			int row, int col) {

		for (int i = col; i < matrix.length - col; i++) {
			if (matrix[row][i].charAt(0) == wordToFind.charAt(i)) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}

	private static boolean searchCol(String matrix[][], String wordToFind,
			int row, int col) {
		for (int i = row; i < matrix[col].length - row; i++) {
			if (matrix[i][col].charAt(0) == wordToFind.charAt(i)) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}

	// -------------------------------------------------------------------//
	public static int[] shuffle(int[] a) {
		Random rand = new Random();
		int from, to, tmp;

		for (int i = 0; i < a.length; i++) {
			from = rand.nextInt(52);
			to = rand.nextInt(52);
			tmp = a[to];
			a[to] = a[from];
			a[from] = tmp;
		}

		return a;
	}

	public static <T> void printTreePreOrder(T[] a) {
		for (Object o : a) {
			System.out.println(o.toString());
		}
	}

	public static <T> void printTreeInOrder(T[] a) {
		for (Object o : a) {
			System.out.println(o.toString());
		}
	}

	private static int[] whatCouldHaveBeen(int[] stockIndexes) {
		int[] result = new int[3];
		int preVal = stockIndexes[0], maxGain = 0;

		for (int i = 1; i < stockIndexes.length; i++) {
			if (stockIndexes[i] > preVal) {
				System.out.println("Triggered at: " + preVal + " - "
						+ stockIndexes[i] + " ");
				for (int k = i - 1; k < stockIndexes.length; k++) {
					if ((stockIndexes[k] - stockIndexes[i - 1]) > maxGain) {
						System.out.println("NEW BEST GAIN!!! Min:"
								+ stockIndexes[i - 1] + " - Max: "
								+ stockIndexes[k] + "  - Gain: "
								+ (stockIndexes[k] - stockIndexes[i - 1]));
						maxGain = stockIndexes[k] - stockIndexes[i - 1];
						result[1] = stockIndexes[i - 1];
						result[2] = stockIndexes[k];
					}
				}
				preVal = stockIndexes[i];
			} else {
				preVal = stockIndexes[i];
			}

		}
		result[0] = maxGain;

		return result;
	}

	private static int outOfOrder(int[] x) {
		int outOfOrder = 0;

		// O(N+K)
		for (int i = 0; i < x.length - 1; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] > x[j]) {
					outOfOrder++;
				}
			}
		}
		return outOfOrder;
	}

	private static int maxSum(int[] a) {
		int finalSum, val1;
		int val2 = 0;
		finalSum = val1 = a[0];

		if (a.length <= 0) { // No input, go home
			System.err.append("Input error!");
		} else if (a.length == 1) { // Only one element, so gg.
			return a[0];
		} else {
			for (int i = 1; i < a.length; i++) {
				finalSum = Math.max(a[i] + val2, val1);
				val2 = val1;
				val1 = finalSum;
			}
		}
		return finalSum;
	}

	private static int findTheOne(int[] x) {
		int max = 0;

		for (int i = 0; i < x.length; i++) {
			if (x[i] > max) {
				max = x[i];
			}
		}
		int[] occ = new int[max + 1];

		for (int i = 0; i < x.length; i++) {
			occ[x[i]]++;
		}

		for (int i = 0; i < occ.length; i++) {
			if (occ[i] == 1) {
				return i;
			}
		}
		// nope
		return 0;
	}

	private static int findTheOneTakeTwo(int[] x) {
		HashMap<Integer, Integer> valuePairs = new HashMap<Integer, Integer>();

		for (int i = 0; i < x.length; i++) {
			if (valuePairs.containsKey(x[i])) {
				valuePairs.replace(x[i], valuePairs.get(x[1]) + 1);
			} else {
				valuePairs.put(x[i], 1);
			}
		}
		for (Integer i : valuePairs.keySet()) {
			if (valuePairs.get(i) == 1) {
				return i;
			}
		}
		return 0; // cos FU!
	}

	private static int findTheOneTakeThree(int[] x) {
		int ones = 0, twos = 0;
		int common_bit_mask;

		for (int i = 0; i < x.length; i++) {
			twos = twos | (ones & x[i]);
			ones = ones ^ x[i];
			common_bit_mask = ~(ones & twos);
			ones &= common_bit_mask;
			twos &= common_bit_mask;
		}
		return ones;
	}

	private static void printArray(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
	}

}
