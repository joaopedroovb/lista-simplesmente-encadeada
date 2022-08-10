package lse;

public class Lse {

    public static void main(String[] args) {
        Lista l = new Lista();
        l.insereInicio(8);
        l.imprime();
        
        l.insereInicio(5);
        l.imprime();
        
        l.insereInicio(7);
        l.imprime();
        
        l.insereFim(10);
        l.imprime();
 
        System.out.println("Item  removido " +l.removeSegundo());
        l.imprime();
           
    } 
}
