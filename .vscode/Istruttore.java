public class Istruttore{
    private String nome;
    private String cognome;
    private String ci;
    public Istruttore(String nome, String cognome, String ci) {
        this.nome = nome;
        this.cognome = cognome;
        this.ci = ci;
    
    }
   
    public String getSoci(){
        String retValue = "\"";
        for (Socio s : listaSoci.values()) {
            retValue+=s+"\n";

        }
        return retValue+"\"";
    }
    public void addSocio(Socio s){
        listaSoci.put(s.getCs(), s);
    }
}
