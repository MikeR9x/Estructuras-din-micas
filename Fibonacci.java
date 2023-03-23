import java.util.List;
import java.util.ArrayList;

public class Fibonacci {
	 private List<Integer> lista = new ArrayList<Integer>();

	    public void generarSecuencia (){
	        lista.add(0);
	        lista.add(1);
	        for (int i = 1; i > 0; i++) {
	            if(lista.get(i) >= 1000000){
	                break;
	            }
	            lista.add((lista.get(i) + lista.get(i-1)));
	        }
	        System.out.println(lista);
	    }
	    
	    public List<Integer> getList (){
	        return lista;
	    }
}
