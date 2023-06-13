package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		
		/* Qes7
		 * N人の生徒の成績を管理するプログラムを下記条件で作成してください
		 * N人の生徒の成績を入力できるようにしてください 入力値は上から英語・数学・理科・社会の点数としてください
		 * 各生徒の科目平均点、全体の科目平均点、そして各教科の平均点を出力してください
		 * このプログラムの実行は必ず1回以上行われるようにしてください
		 * 出力例を参考にプログラミングを作成してください
		 */
		

		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("生徒の人数を入力してください（2以上）: ");
		        int numberOfStudents = scanner.nextInt();
		     // 改行文字を消費
		        scanner.nextLine(); 

		        int[] englishScores = new int[numberOfStudents];
		        int[] mathScores = new int[numberOfStudents];
		        int[] scienceScores = new int[numberOfStudents];
		        int[] socialScores = new int[numberOfStudents];

		        for (int i = 0; i < numberOfStudents; i++) {
		            System.out.print((i + 1) + "人目の『英語』の点数を入力してください: ");
		            englishScores[i] = scanner.nextInt();
		            System.out.print((i + 1) + "人目の『数学』の点数を入力してください: ");
		            mathScores[i] = scanner.nextInt();
		            System.out.print((i + 1) + "人目の『理科』の点数を入力してください: ");
		            scienceScores[i] = scanner.nextInt();
		            System.out.print((i + 1) + "人目の『社会』の点数を入力してください: ");
		            socialScores[i] = scanner.nextInt();

		         // 改行文字を消費
		            scanner.nextLine(); 
		        }

		        scanner.close();

		        calculateAverages(englishScores, mathScores, scienceScores, socialScores);
		        calculateSubjectAverages(englishScores, mathScores, scienceScores, socialScores);
		    }

		    private static void calculateAverages(int[] englishScores, int[] mathScores, int[] scienceScores, int[] socialScores) {
		        int numberOfStudents = englishScores.length;

		        for (int i = 0; i < numberOfStudents; i++) {
		            double average = (englishScores[i] + mathScores[i] + scienceScores[i] + socialScores[i]) / 4.0;
		            System.out.printf("%d人目の平均点は%.2f点です。\n", (i + 1), average);
		        }
		    }

		    private static void calculateSubjectAverages(int[] englishScores, int[] mathScores, int[] scienceScores, int[] socialScores) {
		        int numberOfStudents = englishScores.length;
		        double englishAverage = calculateAverage(englishScores, numberOfStudents);
		        double mathAverage = calculateAverage(mathScores, numberOfStudents);
		        double scienceAverage = calculateAverage(scienceScores, numberOfStudents);
		        double socialAverage = calculateAverage(socialScores, numberOfStudents);
		        double overallAverage = (englishAverage + mathAverage + scienceAverage + socialAverage) / 4.0;

		        System.out.printf("英語の平均点は%.2f点です。\n", englishAverage);
		        System.out.printf("数学の平均点は%.2f点です。\n", mathAverage);
		        System.out.printf("理科の平均点は%.2f点です。\n", scienceAverage);
		        System.out.printf("社会の平均点は%.2f点です。\n", socialAverage);
		        System.out.printf("全体の平均点は%.2f点です。\n", overallAverage);
		    }

		    private static double calculateAverage(int[] scores, int numberOfStudents) {
		        int sum = 0;

		        for (int i = 0; i < numberOfStudents; i++) {
		            sum += scores[i];
		        }

		        return (double) sum / numberOfStudents;
		    }
		


	}


