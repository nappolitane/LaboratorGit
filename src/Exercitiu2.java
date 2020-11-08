public class Exercitiu2 {
    public static void run()
    {
        Carte c1 = new Carte();
        c1.setAutor("Bjarne Stroustrup");
        c1.setTitlu("C++ Language");
        c1.setAnAparitie(1985);
        c1.setNrPagini(400);

        System.out.println(c1.toString());

        Carte c2 = new Carte("Albu Alex", "Routing and Switching",2015, 200);

        Carte c3 = new Carte("Ghita Alex", "Programming in java", 2021,300);

        Biblioteca b1 = new Biblioteca();
        b1.add(c1);
        b1.add(c2);
        b1.add(c3);

        System.out.println(b1.toString());

        b1.sortByNrPagini();

        System.out.println(b1.toString());

        Biblioteca b2 = new Biblioteca();
        b2.add(new Carte("Scraba Cristian","Pentesting for noobs",2019,100));
        b2.add(new Carte("Oniga Vasile","Oracle databases",2000,150));

        b1.add(b2);

        System.out.println(b1.toString());
    }
}
