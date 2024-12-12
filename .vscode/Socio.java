public class Socio{
    private String nome;
    private String cognome;
    private String cs;
    public Paziente(String nome, String cognome, String cs) {
        this.nome = nome;
        this.cognome = cognome;
        this.cs = cs;
    
    }

    public Istruttore getIstruttoreAssegnato() {
        return istruttoreAssegnato;
    }
    public void setIstruttoreAssegnato(Istruttore istruttoreAssegnato) {
        this.istruttoreAssegnato = istruttoreAssegnato;
    }
}