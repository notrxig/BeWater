package src;
public class Node {
    /*  Descripció general: El node pot variar de tipus segons la seva definició.
        Hi han tres tipus de nodes, amb les seves diferencies respectivament:
            - Punts d'origen (conté nom i posició)
            - Punts terminals (conté nom, posició i demanda)
            - Canonades (conté nom, posició i estat)
    */

    //* CONSTRUCTORS
    public Node(String nom, boolean oberta, String posicio){
        //Pre: ---
        //Post: Crea una canonada amb un nom identificador, una posició i un booleà que determina si l'aixeta està oberta.
    }
    public Node(String nom, double demanda, String posicio){
        //Pre: ---
        //Post: Crea una punt terminal amb un nom identificador, una posició i un booleà que determina si l'aixeta està oberta.
    }
    public Node(String nom, String posicio){
        //Pre: ---
        //Post: Crea una punt d'origen amb un nom identificador i una posició.
    }

    //* RETURNS
    public String nom(){
        //Pre: ---
        //Post: Retorna el nom del node.
    }
    public boolean oberta(){
        //Pre: ---
        //Post: Retorna l'estat de la canonada.
    }
    public String posicio(){
        //Pre: ---
        //Post: Retorna la posició del node.
    }
    public String demanda(){
        //Pre: ---
        //Post: Retorna la demanda del punt terminal.
    }
    public String abonat(){
        //Pre: ---
        //Post: Retorna el DNI del abonat del punt terminal.
    }
    public double cabal(){
        //Pre: ---
        //Post: Retorna el cabal del punt origen.
    }

    //* MODIFICADORS
    public void interactuar(){
        //Pre: ---
        //Post: Canvia l'estat de la canonada d'obert a tancat o de tancat a obert.
    }
    public void modAbonat(String DNI){
        //Pre: DNI != null
        //Post: Defineix el client abonat al punt terminal.
    }
    public void modCabal(double q){
        //Pre: q>0
        //Post: Defineix el cabal de l'origen.
    }
    public void modDemanda(){
        //Pre: ---
        //Post: Retorna la demanda del punt terminal.
    }
}
    