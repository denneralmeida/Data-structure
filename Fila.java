import javax.swing.*;
/**
 * Write a description of class Fila here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fila{
    private Node primeiro;
    private Node ultimo;
    private int size;
    public Fila(){
        this.size = 0;
    }
    
    public void enfileirar(Node node){
        if(size == 0){
            primeiro = node;
            ultimo = node;
            size++;
        }else{
            ultimo.setProximo(node);
            ultimo = ultimo.getProximo();
            size++;
        }
    }
    
    public void desenfileirar() throws Exception{
        if(size == 1){
            primeiro = null;
            ultimo = null;
            size--;
        }
        else if(size > 1){
            primeiro = primeiro.getProximo();
            size--;
        }else{
            JOptionPane.showMessageDialog(null,"Não existe mais elementos na fila");
        }
    }
    
    
    @Override
    public String toString(){
        StringBuilder strBuilder = new StringBuilder();
        Node aux = primeiro;
        if(aux == null){
            return "[]";
        }else{
            strBuilder.append("[");
            while(aux.getProximo() != null){
                strBuilder.append(aux.getX() + "->");
                aux = aux.getProximo();
            }
            strBuilder.append(aux.getX());
            strBuilder.append("]");
            return strBuilder.toString(); 
        }
    }
    
    public Node getPrimeiro(){
        return this.primeiro;
    }
    
    public Node getUltimo(){
        return this.ultimo;
    }
}
