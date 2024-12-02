package baseball;

public class BaseBallTeam {

	//フィールド
	private String name;		//チーム名
	private int win;			//勝ち数
	private int lose;			//負け数
	private int draw;			//引き分け数

	public BaseBallTeam(String name, int win, int lose, int draw){
		this.name = name;
		this.win = win;
		this.lose = lose;
		this.draw = draw;


	}

	public double getRate(double win, double lose) {

		double rate = win / (win + lose);//入っててきた値で計算
		return rate;
	}

	public void report() {
		double rate = getRate(this.win, this.lose);
		System.out.println(name +"の2022年の成績は　" + win + "勝　" + lose + "敗　" + draw + "分、勝率は　" + rate + "です。");

	}

}
