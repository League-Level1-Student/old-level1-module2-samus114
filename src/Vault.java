public class Vault {
	int secretCode = 21000;

	public boolean tryCode(int code) {
		if (code == secretCode) {
			return true;
		} else {
			return false;
		}
	}

public static void main(String[] args) {


}
}