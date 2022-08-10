

package lse;

public class Lista {
    private static Node cabeca;
    private static Node cauda;

    public Lista(){
      cabeca = cauda = null;
    }

    public static void insereInicio(int Item){
      if (cabeca== null)
        cabeca = cauda = new Node(Item);
      else
        cabeca = new Node(Item,cabeca);
    }

    public static void insereFim(int Item){
      if (cabeca==null)
        cabeca = cauda = new Node(Item);
      else
        cauda=cauda.proximo= new Node(Item);
    }
    
     public static void imprime(){
    if (cabeca == null){
	System.out.println("Lista Vazia");
	System.exit(0);
    }

    Node corrente = cabeca;

    while (corrente != null){
      System.out.print(corrente.info + " , ");
      corrente = corrente.proximo;
    }
    
    System.out.print("\n");
  }
     
    public static void inserePescoco(int Item){
        Node a = cabeca;
        Node b = cabeca.proximo;
        a.proximo = new Node (Item, b);
    }
    
    public static void inserePertoDoFim(int Item){
        Node a = cabeca.proximo.proximo;
        Node b = cauda;
        a.proximo = new Node (Item, b);
    }
    
         public static void inserePenultimo(int Item){
    if (cabeca == null){
	System.out.println("Lista Vazia");
	System.exit(0);
    }

    Node corrente = cabeca;

    while (corrente.proximo != cauda){
      corrente = corrente.proximo;
    }
    
    corrente.proximo = new Node (Item, cauda);
  }
	
	public static int contador(){
	Node corrente = cabeca;
		int quantidade = 0;
		while (corrente != null){
		quantidade++;
			corrente = corrente.proximo;
		}
		return quantidade;
	}
        
        public static int removeInicio(){
    int removeItem = 0;
    if (cabeca == null){
      System.out.println("Lista Vazia");
      System.exit(0);
    }

    removeItem = cabeca.info;

    if (cabeca == cauda)
      cabeca = cauda = null;
    else
      cabeca = cabeca.proximo;

    return removeItem;
  }

        
        public static int removeFim(){
    int removeItem = 0;
    if (cabeca == null){
      System.out.println("Lista Vazia");   
      System.exit(0);    }

    removeItem = cauda.info;

    if (cabeca == cauda)
      cabeca = cauda = null;
    else{
      Node corrente = cabeca;
      while (corrente.proximo != cauda)
	corrente = corrente.proximo;
      cauda = corrente;
      corrente.proximo = null;
    }
    return removeItem;
  }
        
        public static int removeSegundo(){
            int itemRemovido = 0;
            if (cabeca == null){
                System.out.println("Lista Vazia");
                System.exit(0); 
            }
                
                if (cabeca == cauda){
                    itemRemovido = cabeca.info;
                    cabeca = cauda = null;
                }
                else {
                itemRemovido = cabeca.proximo.info;
                cabeca.proximo = cabeca.proximo.proximo;
                }
                return itemRemovido;
            }
        
        public static boolean pesquisa(int procurado){
            Node corrente = cabeca;
            while (corrente != null){
                if (corrente.info == procurado)
                    return true;
                else 
                    corrente = corrente.proximo; //percorrer Importantissima
            }
            return false;
        }
            
        }
