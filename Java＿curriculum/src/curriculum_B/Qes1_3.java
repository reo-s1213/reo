package curriculum_B;

import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		
		/* Qes1・Qes2
		 * ログイン時の入力チェックシステムを下記条件で作成してください
		 * コンソールにユーザー名を入力できるようにしてください
		 * ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
		 * ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
		 * ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
		 * ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください
		 */
		
		// コンソールにユーザー名を入力できるようにする
		Scanner sc1 = new Scanner( System.in );
		String username = null;
		
		while (true) {
		 System.out.println( "ユーザー名を入力してください" );
		 String line1 = sc1.nextLine();
		
		// ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
		 if ( line1 == null || line1.length() <= 0 ) {
			System.out.println( "名前を入力してください" );
		 } 
		
		// ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
		 else if ( line1.length() > 10 ) {
			System.out.println( "名前を10文字以内にしてください" );
		 }
		
		// ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください
		 else if (!line1.matches( "[a-zA-Z0-9]+" )) {
			System.out.println( "半角英数字のみで名前を入力してください" );
		 }
		
		// ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
		 else {
		    username = line1;
			System.out.println( "ユーザー名「" + line1 + "」を登録しました" );
			break;
		 }
		}
		
		
		/* Qes3
		 * ジャンケンシステムを追加
		 */
		
		// 勝利数、ゲーム数を設定する
		int winCount = 0;
		int gameCount = 0;
		
		// １〜３までの数字以外は無効とする
		while ( winCount < 1 ) {
			int playerHand = sc1.nextInt();
			
			
			if ( playerHand < 0 || playerHand > 2 ) {
				System.out.println( "無効な手です。もう一度選んでください。" );
				continue;
			}
			
			// じゃんけん相手を設定する
			int computerHand = ( int )( Math.random() * 3 );
			
			
			System.out.println( username + "の手は「" + handToString( playerHand ) + " 」" );
			System.out.println( "相手の手は「" + handToString( computerHand ) + "」" );
			
			
			// あいこの場合
			if ( playerHand == computerHand ) {
				System.out.println( "DRAW あいこ もう一回しましょう！" );
			}
			
			// グーで負けた場合
			else if ( playerHand == 0 && computerHand == 2 ) {
				System.out.println( "俺の勝ち！" );
				System.out.println( "負けは次につながるチャンスです！" );
				System.out.println( "ネバーギブアップ！" );
			}
			
			// チョキで負けた場合
			else if ( playerHand == 1 && computerHand == 0 ) {
				System.out.println( "俺の勝ち！" );
				System.out.println( "たかがじゃんけん、そう思ってないですか？" );
				System.out.println( "それやったら次も、俺が勝ちますよ" );
			}
			
			// パーで負けた場合
			else if ( playerHand == 2 && computerHand == 1 ) {
				System.out.println( "俺の勝ち！" );
				System.out.println( "なんで負けたか、明日まで考えといてください。" );
				System.out.println( "そしたら何かが見えてくるはずです" );
			}
			
			// 勝ちの場合
			else {
				System.out.println( "やるやん。" );
				System.out.println( "次は俺にリベンジさせて" );
				winCount ++;
			}
			
			gameCount ++;
		}
			
		 System.out.println( "勝つまでにかかった合計回数は" + gameCount + "回です" );
		 
		sc1.close();
			
	}
		
		
		private static String handToString( int hand ) {
	        if ( hand == 0 ) {
	            return "グー";
	        } else if ( hand == 1 ) {
	            return "チョキ";
	        } else if ( hand == 2 ) {
	            return "パー";
	        } else {
	            return "無効な手";
	        }

	    }

}
