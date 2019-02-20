public class jamesBond {
	public int findCode(Vault vault) {
		for (int i = 0; i < 1000001; i++) {
			if (vault.tryCode(i)) {
				System.out.println("The secret code is " + i);
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		jamesBond cracker = new jamesBond();
		Vault vault = new Vault();
		System.out.println(cracker.findCode(vault));
	}
}
