
/**
 * Escreva a descrição da classe No aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class No
{
    private int x;
    private No proximo;
    private No anterior;
    
    public No(){
        
    }

    public No(int _x){
        this.x = _x;
    }
    
    public int getX(){ return this.x; }
    
    public No getAnterior(){ return this.anterior; }
    
    public No getProximo(){ return this.proximo; }
    
    public void setX(int _x){ this.x = _x; }
    
    public void setAnterior(No _anterior){ this.anterior = _anterior;}
    
    public void setProximo(No _proximo){ this.proximo = _proximo;}
}
