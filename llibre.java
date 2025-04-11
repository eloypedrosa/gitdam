public class Llibre {
    //PROPIEDADES
    private String titol;
    private String autor;
    private boolean prestat;
    

    //CONSTRUCTOR
    public Llibre(String titol, String autor) {
    this.titol = titol;
    this.autor = autor;
    this.prestat = false;
    }


    //GETTERS
    public String getTitol() { return titol; }
    public String getAutor() { return autor; }
    public boolean esPrestat() { return prestat; }
    

    //SETTERS
    public String setTitol(String titol) {this.titol = titol;}
    public String setTitol(String autor) {this.autor= autor;}
    public String setPrestat(boolean prestat) {this.prestat= prestat;}


    //PRESTAR Y DEVOLVER
    public void prestar() { prestat = true; }
    public void retornar() { prestat = false; }

    //TOSTRING
    @Override
    public String toString() {
    return titol + " de " + autor + (prestat ? " (En préstec)" : " (Disponible)");
    }
    }