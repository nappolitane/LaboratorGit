public class Carte implements Comparable<Carte> {
    private String Titlu;
    private String Autor;
    private int AnAparitie;
    private int NrPagini;

    //region Constructors
    public Carte(){ }

    public Carte(String titlu, String autor, int anAparitie, int nrPagini) {
        Titlu = titlu;
        Autor = autor;
        AnAparitie = anAparitie;
        NrPagini = nrPagini;
    }
    //endregion

    //region Setters
    public void setTitlu(String titlu) {
        Titlu = titlu;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public void setAnAparitie(int anAparitie) {
        AnAparitie = anAparitie;
    }

    public void setNrPagini(int nrPagini) {
        NrPagini = nrPagini;
    }
    //endregion

    //region Getters
    public String getTitlu() {
        return Titlu;
    }

    public String getAutor() {
        return Autor;
    }

    public int getAnAparitie() {
        return AnAparitie;
    }

    public int getNrPagini() {
        return NrPagini;
    }
    //endregion

    @Override
    public String toString() {
        return "'" + Titlu + "' de " + Autor + ", publicata in anul " + AnAparitie;
    }

    @Override
    public int compareTo(Carte c)
    {
        if(this.getNrPagini() > c.getNrPagini())
            return 1;
        if(this.getNrPagini() == c.getNrPagini())
            return 0;
        return -1;
    }
}
