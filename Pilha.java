
/**
 * Write a description of class Pilha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pilha{
    private Node topo;
    private int tamanho;
    /**
     * Constructor for objects of class Pilha
     */
    public Pilha(){
        this.tamanho=0;
    }

    public void empilhar(Node node){
       if(topo == null){
           topo = node;
           this.tamanho++;
        }
       else{
           node.setProximo(topo);
           topo = node;
           this.tamanho++;
        } 
    }
    
    public void desempilhar(){
      if(topo != null){
          topo = topo.getProximo();
          this.tamanho--;
      }
   }
   
   
   public Node getTopo(){
        return this.topo;
    }
    
    @Override
    public String toString(){
        StringBuilder strBuilder = new StringBuilder();
        Node aux = topo;
        if(aux == null){
            return "[]";
        }else{
            while(aux.getProximo() != null){
                strBuilder.append(aux.getX() + "\n");
                aux = aux.getProximo();
            }
            strBuilder.append(aux.getX()+ "\n");
            return strBuilder.toString(); 
        }
    }
}

