package console;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import prefecture.Prefecture;

public class Console {
    public static void main(String[] args) {
        List<Prefecture> prefectures = new ArrayList<>();

        // 都道府県データの初期化
        prefectures.add(new Prefecture("北海道:札幌市:83424"));
        prefectures.add(new Prefecture("青森県:青森市:9646"));
        prefectures.add(new Prefecture("岩手県:盛岡市:15275"));
        prefectures.add(new Prefecture("宮城県:仙台市:7282"));
        prefectures.add(new Prefecture("秋田県:秋田市:11638"));
        prefectures.add(new Prefecture("山形県:山形市:9323"));
        prefectures.add(new Prefecture("福島県:福島市:13784"));
        prefectures.add(new Prefecture("茨城県:水戸市:6097"));
        prefectures.add(new Prefecture("栃木県:宇都宮市:6408"));
        prefectures.add(new Prefecture("群馬県:前橋市:6362"));
        prefectures.add(new Prefecture("埼玉県:さいたま市:3798"));

        Scanner scanner = new Scanner(System.in);

        List<Integer> selectedNumbers = new ArrayList<>();

        while (selectedNumbers.isEmpty()) {
            System.out.println("都道府県の番号を1~10の中でカンマ区切りで入力してください：");
            String input = scanner.nextLine();
            String[] inputArray = input.split(",");

            for (String inputItem : inputArray) {
                try {
                    int number = Integer.parseInt(inputItem);
                    if (number > 0 && number <= prefectures.size()) {
                        selectedNumbers.add(number - 1); // 配列のインデックスに合わせて調整
                    } else {
                        System.out.println("無効な番号が入力されました。1から10の番号を入力してください。");
                        selectedNumbers.clear();
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("無効な番号が入力されました。1から10の番号を入力してください。");
                    selectedNumbers.clear();
                    break;
                }
            }
        }

        System.out.println("ソート方法を選択してください（ascまたはdesc）：");
        String sortOption = scanner.nextLine();

        if ("asc".equalsIgnoreCase(sortOption)) {
            Collections.sort(selectedNumbers);
        } else if ("desc".equalsIgnoreCase(sortOption)) {
            Collections.sort(selectedNumbers, Collections.reverseOrder());
        } else {
            System.out.println("無効なソート方法です。昇順か降順を選択してください。");
            scanner.close(); // スキャナーをクローズ
            return;
        }

        for (int number : selectedNumbers) {
            Prefecture selectedPrefecture = prefectures.get(number);
            System.out.println(selectedPrefecture.toString());
        }

        scanner.close(); // スキャナーをクローズ
    }
}
