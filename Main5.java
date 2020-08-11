
public class Main5 {
	
	public void sumarContadorMain() {
		CuentaCorriente.contador += 100;
	}
	
	public static void sumarContadorMain1() {
		CuentaCorriente.contador += 100;
	}
	
	public static void main(String[] args) {
		
		Main5 main = new Main5();
		main.sumarContadorMain();
		
		Main5.sumarContadorMain1();
		sumarContadorMain1();
		
		
		CuentaCorriente.sumarContador();
		CuentaCorriente.contador = 100;
		//CuentaCorriente.sald = 100;
		CuentaCorriente cta = new CuentaCorriente();
		cta.saldo=100;
		
		CuentaCorriente cta1 = new CuentaCorriente();
		cta1.saldo=1000;		

	}

}
