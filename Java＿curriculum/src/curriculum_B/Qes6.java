package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		
		/* Qes6
		 * 入力した商品の残り台数が出力されるシステムを下記の条件で作成してください
		 * 拡張for文・Switch文・条件演算子を使用すること　※普通のif文は使用不可
		 * Switch文内でテレビとディスプレイは続けて書くようにしてください、条件演算子で出力される値を変更してください
		 * テレビとディスプレイは同じ商品扱いとし、ディスプレイが出た場合は最大個数の11個からランダムで出た数字を引いて出力してください 
		 * 例：テレビと受け取った場合、→「テレビの残り台数は〇〇台です」※〇〇はランダムで出た数字
		 * 入力される値は右記の表のどれかが入力され、入力回数の縛りはありません
		 * 入力された値は「、」区切りで指定してください
		 * そのほかの値が入力された場合下記を出力されるようにしてください
		 * 『受け取った値』は指定の商品ではありません
		 * 残り台数は0〜11までのランダムな値が出力されるようにしてください
		 */
	

                // スキャナーインスタンスを作成する
		        Scanner scanner = new Scanner( System.in );
		        // ランダムインスタンスを作成する
		        Random random = new Random();

		        // ユーザーからの入力を受け取る
		        String input = scanner.nextLine();
		        // 入力を「、」で区切る
		        String[] products = input.split( "、" );

		        // 商品ごとに処理を行う
		        for ( String product : products ) {
		            int remainingCount;
		            switch ( product ) {
		                case "テレビ":
		                case "ディスプレイ":
		                	// 0から11までのランダムの値を生成する
		                    int randomDisplay = random.nextInt( 12 );
		                    remainingCount = product.equals( "テレビ" ) || product.equals( "ディスプレイ" ) ? randomDisplay : 11 - randomDisplay;
		                    System.out.println( product + "の残り台数は" + remainingCount + "台です" );
		                    break;
		                case "パソコン":
		                case "冷蔵庫":
		                case "扇風機":
		                case "洗濯機":
		                case "加湿器":
		                	// 0から11までのランダムの値を生成する
		                    remainingCount = random.nextInt( 12 );
		                    // 残り台数を入力する
		                    System.out.println( product + "の残り台数は" + remainingCount + "台です" );
		                    break;
		                default:
		                	// して以外の商品について出力
		                    System.out.println( "『" + product + "』は指定の商品ではありません" );
		                    break;
		            }
		            
		            scanner.close();
		        }
		    }
		}
