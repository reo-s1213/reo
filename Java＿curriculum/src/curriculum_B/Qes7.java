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
		

		
		        // スキャナーインスタンスを作成
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("生徒の人数を入力してください（2以上）: ");
		        // 生徒人数を入力する
		        int numberOfStudents = scanner.nextInt();
		        // 改行文字を消費
		        scanner.nextLine(); 

		        int[] englishScores = new int[numberOfStudents];
		        int[] mathScores = new int[numberOfStudents];
		        int[] scienceScores = new int[numberOfStudents];
		        int[] socialScores = new int[numberOfStudents];

		        for ( int i = 0; i < numberOfStudents; i++ ) {
		            System.out.print( ( i + 1 ) + "人目の『英語』の点数を入力してください: " );
		            // 英語の点数を入力する
		            englishScores[i] = scanner.nextInt();
		            System.out.print( ( i + 1 ) + "人目の『数学』の点数を入力してください: " );
		            // 数学の点数を入力する
		            mathScores[i] = scanner.nextInt();
		            System.out.print( ( i + 1 ) + "人目の『理科』の点数を入力してください: " );
		            // 理科のの点数を入力する
		            scienceScores[i] = scanner.nextInt();
		            System.out.print( ( i + 1 ) + "人目の『社会』の点数を入力してください: " );
		            // 社会の点数を入力する
		            socialScores[i] = scanner.nextInt();

		            // 改行文字を消費
		            scanner.nextLine(); 
		        }

		        scanner.close();

		        // 各生徒、各教科の平均点数を計算して出力する
		        calculateAverages( englishScores, mathScores, scienceScores, socialScores );
		        // 全体の科目平均点と各教科の平均点を計算して出力する
		        calculateSubjectAverages( englishScores, mathScores, scienceScores, socialScores );
		    }
	
	        // 各生徒の科目平均点を計算して出力するメソッド
		    private static void calculateAverages( int[] englishScores, int[] mathScores, int[] scienceScores, int[] socialScores ) {
		        int numberOfStudents = englishScores.length;

		        for ( int i = 0; i < numberOfStudents; i++ ) {
		        	// 寡黙の平均点を計算する
		            double average = ( englishScores[i] + mathScores[i] + scienceScores[i] + socialScores[i] ) / 4.0;
		            // 平均点を出力する
		            System.out.printf( "%d人目の平均点は%.2f点です。\n", ( i + 1 ), average );
		        }
		    }

		    // 全体の科目平均点と各教科の平均点を計算して出力するメソッド
		    private static void calculateSubjectAverages( int[] englishScores, int[] mathScores, int[] scienceScores, int[] socialScores ) {
		        int numberOfStudents = englishScores.length;
		        // 英語の平均点を計算する
		        double englishAverage = calculateAverage( englishScores, numberOfStudents );
		        // 数学の平均点を計算する
		        double mathAverage = calculateAverage( mathScores, numberOfStudents );
		        // 理科の平均点を計算する
		        double scienceAverage = calculateAverage( scienceScores, numberOfStudents );
		        // 社会の平均点を計算する
		        double socialAverage = calculateAverage( socialScores, numberOfStudents );
		        // 残体の平均点を計算する
		        double overallAverage = ( englishAverage + mathAverage + scienceAverage + socialAverage ) / 4.0;

		        // 英語の平均点を出力する
		        System.out.printf( "英語の平均点は%.2f点です。\n", englishAverage );
		        // 数学の平均点を出力する
		        System.out.printf( "数学の平均点は%.2f点です。\n", mathAverage );
		        // 理科の平均点を出力する
		        System.out.printf( "理科の平均点は%.2f点です。\n", scienceAverage );
		        // 社会の平均点を出力する
		        System.out.printf( "社会の平均点は%.2f点です。\n", socialAverage );
		        // 全体の平均点を出力する
		        System.out.printf( "全体の平均点は%.2f点です。\n", overallAverage );
		    }

		   // 配列の平均値を計算するメソッド
		    private static double calculateAverage( int[] scores, int numberOfStudents ) {
		        int sum = 0;

		        for ( int i = 0; i < numberOfStudents; i++ ) {
		        	// 点数を合計する
		            sum += scores[i];
		        }

		        // 平均点を計算して返す
		        return ( double ) sum / numberOfStudents;
		    }
		


	}


