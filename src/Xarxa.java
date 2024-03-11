package src;
public class Xarxa {
    //Descripció general: Xarxa formada per nodes.

    //* CONSTRUCTORS
    public Xarxa(){
        //Pre: ---
        //Post: Crea una xarxa buida.
    }
    public Xarxa(Node entrada, Xarxa esquerre, Xarxa dret){
        //Pre: entrada != null
        //Post: Crea una xarxa a partir d'una node i dos xarxes. La node entrada s'estableix com a node d'entrada la xarxa. Les portes esquerra i dreta de sortida d'aquesta node es connecten amb les xarxes esquerre i dret respectivament.
    }

    //* RETURNS
    public Node nodeEntrada(){
        //Pre: ---
        //Post: Retorna la node d'entrada.
    }
    public Xarxa xarxaEsquerre(){
        //Pre: ---
        //Post: Retorna la xarxa que hi ha a partir de la porta de sortida esquerra del node d'entrada.
    }
    public Xarxa xarxaDret(){
        //Pre: ---
        //Post: Retorna la xarxa que hi ha a partir de la porta de sortida dreta del node d'entrada.
    }
    public boolean buit(){
        //Pre: ---
        //Post: Diu si aquesta xarxa és buida (sense cap node)
    }
}
    