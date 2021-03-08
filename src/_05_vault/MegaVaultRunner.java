package _05_vault;

public class MegaVaultRunner {
public static void main(String[] args) {

	MegaVault v = new MegaVault(666);
	JamesBond j = new JamesBond();
	
	System.out.println(j.findCode(v));
	
	
}
}
