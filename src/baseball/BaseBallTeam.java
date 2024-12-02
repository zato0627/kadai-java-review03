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
						//↓double win, double loseを消した
	public double getRate() {

		double rate = (double)win / (win + lose);//入ってきた値で計算
		return rate;
	}

	public void report() {
		double rate = getRate();
		System.out.println(name +"の2022年の成績は　" + win + "勝　" + lose + "敗　" + draw + "分、勝率は　" + rate + "です。");

	}

}
