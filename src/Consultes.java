package src;
public class Consultes {
    //Descripció general: Consultes d'una xarxa.

    //* RETURNS
    public boolean buscarCicles(Xarxa x){
        //Pre: ---
        //Post: Si troba un cicle, retorna true. En cas contrari retorna true.
    }
    public boolean esArbre(Xarxa x){
        //Pre: ---
        //Post: Si té forma d'arbre, retorna true. En cas contrari retorna true.
    }
    public Ruta cabalMinim(Xarxa x){
        //Pre: ---
        //Post: Donada una xarxa sense cicles, calcular el cabal mínim que hi hauria d'haver als punts d'origen per tal que cap punt terminal, d'entre aquells on arribi aigua, no rebi menys d'un determinat percentatge de la seva demanda actual.
    }
    public Ruta cabalMaxim(Xarxa x){
        //Pre: ---
        //Post: Donat un subconjunt de les canonades d'una xarxa sense cicles, determinar en quines d'aquestes canonades si es satisfà la demanda actual es sobrepassaria la seva capacitat.
    }
    public Ruta aixetesTrencades(Xarxa x){
        //Pre: ---
        //Post: Donada una xarxa en forma d'arbre, determina les aixetes de la xarxa més properes als punts terminals per “sota” de les quals és segur que s'ha trencat (o embussat) alguna canonada.
    }
    public Ruta cabalAbonat(Xarxa x){
        //Pre: ---
        //Post: Donat un abonat i una xarxa sense cicles, determinar el cabal que suposadament hauria d'arribar a la seva finca/indústria a partir de la configuració actual de la xarxa a la qual està abonat.
    }
    public Ruta llistarProximitat(Xarxa x, Node n){
        //Pre: ---
        //Post: Donat un conjunt d'aixetes i una posició geogràfica, llistar les aixetes ordenades segons la seva proximitat a la posició geogràfica donada i, en cas d'empat, alfabèticament.
    }
    

    //* MODIFICADOR
    public void backtracking(int n){
        //Pre: n>0
        //Post: Desfà les n últimes modificacions de l'estat de les canonades.
    }
}
