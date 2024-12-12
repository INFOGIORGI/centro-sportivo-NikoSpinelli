public class CentroSportivo {
    private HashMap<String, Socio> listaSoci;
    private HashMap<String, Istruttore> listaIstruttori;

public CentroSportivo(){
    this.listaSoci= new HashMap<>();
    this.listaIstruttori=new HashMap<>();
    }

    public boolean aggiungiSocio(String cs, String nome, String cognome){
        if(listaSoci.containsKey(cs)){
            return false;
        }else{
            Socio stmp= new Socio(nome, cognome, cs);
            listaSoci.put(cs, stmp);
            return true;    
        }

    }
    public Socio getSocio(String cs){
        if(listaSoci.containsKey(cs)){
            return listaSoci.get(cs);
        }
        else
        return null;
    }
    public boolean aggiungiMedico(String nome, String cognome, String ci){
        if(listaMedici.containsKey(ci)){
            return false;
        }else{
            Istruttore itmp= new Medico(nome, cognome, ci);
            listaIstruttori.put(ci, itmp);
            return true;    
        }

}

public Istruttore getIstruttore(String ci){
    if(listaIstruttori.containsKey(ci)){
        return listaIstruttori.get(ci);
    }
    else
    return null;
}
public boolean assegnaIstruttore(String ci, String cs){
    if(!listaIstruttori.containsKey(ci)||!listaSoci.containsKey(cs)||listaSoci.get(cs).getIstruttoreAssegnato()!=null){
        return false;
    }else{
        Istruttore i= listaIstruttori.get(ci);
        Soci s=listaSoci.get(cs); 
        s.setIstruttoreAssegnato(i);
        i.addSoci(s);
        return true;
    } 
}


}  