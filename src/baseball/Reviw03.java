package baseball;

public class Reviw03 {

	public static void main(String[] args) {

		BaseBallTeam bbl01 = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);//カッコ内に入れる
		bbl01.report();

		BaseBallTeam bbl02 = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);//カッコ内に入れる
		bbl02.report();

		BaseBallTeam bbl03 = new BaseBallTeam("  阪神タイガース   ", 68, 71, 4);//カッコ内に入れる
		bbl03.report();

		BaseBallTeam bbl04 = new BaseBallTeam("  読売ジャイアンツ  ", 68, 72, 3);//カッコ内に入れる
		bbl04.report();

		BaseBallTeam bbl05 = new BaseBallTeam("  広島東洋カープ   ", 66, 74, 3);//カッコ内に入れる
		bbl05.report();

		BaseBallTeam bbl06 = new BaseBallTeam("  中日ドラゴンズ    ", 66, 75, 2);//カッコ内に入れる
		bbl06.report();


	}

}
