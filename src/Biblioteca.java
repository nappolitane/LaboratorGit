import java.util.ArrayList;
import java.lang.StringBuilder;

public class Biblioteca {
    private ArrayList<Carte> mData;

    //region Constructors
    public Biblioteca(){
        mData = new ArrayList<Carte>();
    }
    //endregion

    //region Getters
    public int getNrCarti(){
        return mData.size();
    }

    public Carte getCarte(int index){
        return mData.get(index);
    }
    //endregion

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (Carte mDatum : mData) builder.append("\n").append(mDatum.toString());

        return builder.toString();
    }

    public void add(Carte c){
        mData.add(c);
    }

    public void sortByNrPagini(){
        for(int i = 0; i < mData.size() - 1; i++) {
            for (int j = 0; j < mData.size() - i - 1; j++) {
                if (mData.get(j).compareTo(mData.get(j + 1)) == 1) {
                    Carte aux = mData.get(j);
                    mData.set(j, mData.get(j + 1));
                    mData.set(j + 1, aux);
                }
            }
        }
    }

    public void add(Biblioteca b){
        for (int i = 0; i < b.getNrCarti(); i++){
            this.add(b.getCarte(i));
        }
    }
}
