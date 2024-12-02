
public class Employee {
	//フィールド
	public String employeeName;		//社員名
	public String divisionName; 	 //部署名
	public int vitality;			//体力


	//引数なしのコントラクタ
	public Employee() {
		this("未設定です");
		System.out.println("引数なしのコンストラクタを終了しました");
	}

	//String型引数1つあるコンストラクタ
	public Employee(String employeeName) {
		this(employeeName, "営業部");
		System.out.println("String型引数１つがあるコンストラクタを終了しました");

	}

	//String型引数2つあるコンストラクタ
	public Employee(String employeeName, String divisionName) {
		this(employeeName,divisionName,150);
		System.out.println("String型引数2つがあるコンストラクタを終了しました");

	}

	//"String型引数2つ、	int型引数１つあるコンストラクタ
	public Employee(String employeeName, String divisionName, int vitality) {
		System.out.println("インスタンス化時に引数ありコンストラクタが呼ばれました");
		this.employeeName = employeeName;
		this.divisionName = divisionName;
		this.vitality = vitality;
	}

	/*
	//コントラクタ
	public Employee() {
		System.out.println("インスタンス化時にコントラクタが呼ばれました");
		employeeName = "未設定";
		divisionName = "営業部";
		vitality = 0;

	}

	//引数が3つあるコントラクタ
	public Employee(String employeeName, String divisionName, int vitality) {
		System.out.println("インスタンス化時に引数ありコントラクタが呼ばれました");
		this.employeeName = employeeName;
		this.divisionName = divisionName;
		this.vitality = vitality;


	}
	*/

	//　自己紹介メソッド
	public void introduce() {

		vitality = vitality - 10;
		System.out.println("私の名前は" + employeeName + "です。");
		System.out.println("所属部署は" + divisionName + "です。");

	}

	//挨拶をするメソッド
	public void greeting() {
		vitality = vitality - 10;
		System.out.println("おはようございます");
	}

	//報告するメソッド

	public void report() {
		vitality = vitality - 10;
		System.out.println("今日は10件アポイント取りました");

	}
	//残り体力を知らせるメソッド
	public void showVitality() {

		vitality = vitality - 10;
		System.out.println("残り体力は" + vitality);

	}

	//出勤するメソッド
	public void goToWork() {

	}

	//退勤するメソッド
	public void leaveWork() {

	}

}
