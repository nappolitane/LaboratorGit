import java.util.ArrayList;
import java.lang.StringBuilder;

public class Biblioteca {
    private ArrayList<Carte> listaCarti;

    //region Constructors
    public Biblioteca(){
        listaCarti = new ArrayList<Carte>();
    }

    public Biblioteca(ArrayList<Carte> listaCarti) {
        this.listaCarti = listaCarti;
    }
    //endregion

    //region Getters
    public int getNrCarti(){
        return listaCarti.size();
    }

    public Carte getCarte(int index){
        return listaCarti.get(index);
    }
    //endregion

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (Carte mDatum : listaCarti) builder.append("\n").append(mDatum.toString());

        return builder.toString();
    }

    public void add(Carte c){
        listaCarti.add(c);
    }

    public void sortByNrPagini(){
        for(int i = 0; i < listaCarti.size() - 1; i++) {
            for (int j = 0; j < listaCarti.size() - i - 1; j++) {
                if (listaCarti.get(j).compareTo(listaCarti.get(j + 1)) == 1) {
                    Carte aux = listaCarti.get(j);
                    listaCarti.set(j, listaCarti.get(j + 1));
                    listaCarti.set(j + 1, aux);
                }
            }
        }
    }

    public void add(Biblioteca b){
        for (int i = 0; i < b.getNrCarti(); i++){
            this.add(b.getCarte(i));
        }
    }

    public void removeCarte(Carte c){
        listaCarti.remove(c);
    }
}
