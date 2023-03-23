
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci a = new Fibonacci();
        a.generarSecuencia();
        Splitter b = new Splitter();
        b.separarPares(a.getList());
        b.separarImpares(a.getList());
        Manager c = new Manager();
        c.ejecutar();
	}
}
