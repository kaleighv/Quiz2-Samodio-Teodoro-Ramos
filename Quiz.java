
import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int[] powerLevels = new int[10];

        // Input the Power Levels
        System.out.println("Enter 10 power levels of creatures:");
        for (int i = 0; i < 10; i++) {
            powerLevels[i] = scanner.nextInt();
        }

        // Bubble Sort (Ascending)
        int[] bubbleSorted = powerLevels.clone();
        BubbleSorter.bubbleSort(bubbleSorted);
        System.out.println("\nBubble Sort (Ascending):");
        displayArray(bubbleSorted);

        // Selection Sort (Descending)
        int[] selectionSorted = powerLevels.clone();
        SelectionSorter.selectionSort(selectionSorted);
        System.out.println("\nSelection Sort (Descending):");
        displayArray(selectionSorted);

        // Perform Analysis
        PowerAnalysis analysis = new PowerAnalysis(powerLevels);
        System.out.println("\nAnalysis:");
        System.out.println("Sum of Even Numbers: " + analysis.getSumOfEven());
        System.out.println("Sum of Odd Numbers: " + analysis.getSumOfOdd());
        System.out.println("Minimum Power Level: " + analysis.getMin());
        System.out.println("Maximum Power Level: " + analysis.getMax());
    }

    // Method to Display an Array
    public static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

	}

}
