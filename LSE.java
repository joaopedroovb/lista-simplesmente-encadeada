package lse;

public class LSE {

    public static void main(String[] args) {
        Lista l = new Lista();
        l.insereInicio(5);
        l.imprime();
        
        l.insereInicio(7);
        l.imprime();
        
        l.insereFim(10);
        l.imprime();
        
        l.inserePescoco(8);
        l.imprime();
        
        l.inserePertoDoFim(11);
        l.imprime();
        
        l.inserePenultimo(20);
        l.imprime();
        
        System.out.print("quantidade de nos " +l.contador());
        
        
    } 
}
