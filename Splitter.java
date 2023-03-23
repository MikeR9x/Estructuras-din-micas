import java.util.List;
import java.util.ArrayList;

public class Splitter {
	private List<Integer> listaPar = new ArrayList<Integer>();
    private List<Integer> listaImpar = new ArrayList<Integer>();
    
    public void separarPares (List<Integer> lista){
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i) % 2 == 0){
                listaPar.add(lista.get(i));
            }
        }
        System.out.println(listaPar);
    }

    public void separarImpares (List<Integer> lista){
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i) % 2 != 0){
                listaImpar.add(lista.get(i));
            }
        }
        System.out.println(listaImpar);
    }

    public List<Integer> getList (){
        return listaImpar;
    }
}
