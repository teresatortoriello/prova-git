package it.unibas.codicefiscale.modello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Persona {

    private static final Logger logger = LoggerFactory.getLogger(Persona.class);
    
    private String nome;
    private String cognome;
    private int anno;
    private String sesso;
    private String luogo;

    public Persona() {
    }

    public Persona(String nome, String cognome, int anno, String sesso, String luogo) {
        this.nome = nome;
        this.cognome = cognome;
        this.anno = anno;
        this.sesso = sesso;
        this.luogo = luogo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public String getCodiceFiscale() {
        if (this.nome.length() < 3) {
            throw new IllegalArgumentException("Il nome deve essere almeno di tre caratteri ");
        }
        if (this.cognome.length() < 3) {
            throw new IllegalArgumentException("Il cognome deve essere di almeno tre caratteri ");
        }
        logger.debug("Calcolo il codice fiscale della persona " + this.toString());
        StringBuilder sb = new StringBuilder();
        sb.append(this.nome.toUpperCase().substring(0, 3));
        sb.append(this.cognome.toUpperCase().substring(0, 3));
        sb.append(this.anno);
        sb.append(this.sesso.charAt(0));
        logger.debug("Codice fiscale calcolato : " + sb.toString());
        return sb.toString();
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" Nome: ").append(nome);
        sb.append(", Cognome: ").append(cognome);
        sb.append(", Anno: ").append(anno);
        sb.append(", Sesso: ").append(sesso);
        sb.append(", Luogo: ").append(luogo);
        return sb.toString();
    }

}
