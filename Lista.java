import javax.swing.*;
/**
 * Escreva a descrição da classe Lista aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Lista
{
    private int tamanho;
    private Node inicio;
    private Node fim;
    
    
    public Lista(){
        this.tamanho = 0;
    }

    public boolean inserirFim(Node node){
        if(inicio == null){
            inicio = node;
            fim = node;
            this.tamanho++;
            return true;
        }else{
            fim.setProximo(node);
            fim = fim.getProximo();
            tamanho++;
            return true;
            }
    }
    
    public boolean inserirInicio(Node node){
        if(inicio == null){
            inicio = node;
            fim = node;
            this.tamanho++;
            return true;
        }else{
            node.setProximo(inicio);
            inicio = node;
            tamanho++;
            return true;
        }
    }
    
    public boolean inserir(Node node, int i) throws Exception{
        if(i > -1 && i <= this.tamanho){
        if(tamanho <= 1){
            inserirInicio(node);
            return true;
        }else if(tamanho > 1 && i == tamanho){
            inserirFim(node);
            return true;
        }else{
            Node atual = busca(i);
            Node anterior = busca(i-1);
            node.setProximo(atual);
            anterior.setProximo(node);
            this.tamanho++;
            return true;
        }
       }else{
           throw new Exception ("Essa posição não existe na lista");
        }
    }
    
    public boolean removerInicio(){
        if(tamanho == 1){
            inicio = null;
            fim = inicio;
            this.tamanho--;
            return true;
        }
        inicio = inicio.getProximo();
        this.tamanho--;
        return true;
    }
    
    public boolean removerFim(){
        Node aux = inicio;
        int count =0;
        if(inicio == fim){
            fim = null;
            inicio = fim;
            return true;
        }else{
            while(count == this.tamanho - 1){
                aux = aux.getProximo();
                count++;
            }
            aux.setProximo(null);
            fim = aux;
            tamanho--;
            return true;
        }
    }
    
    public boolean remover(int i)throws Exception{
       if(inicio != null){
           if(i == 0 || i == tamanho){
            removerFim();
            this.tamanho--;
            return true;
        }else if (i != 0 && i != tamanho){
            Node anterior = busca(i-1);
            Node atual = busca(i);
            Node aux = atual.getProximo();
            atual = null;
            anterior.setProximo(aux);
            this.tamanho--;
            return true;
        }
      }else{
        throw new Exception("Não existe mais lista");
        } 
        return false;
    }
    
    public Node busca(int i){
        Node aux = inicio;
        int count=1;
        if(i == 0) {return inicio;}
        else if (i > 0 && i <= tamanho){
        aux = aux.getProximo();
        while(count != i){
            count++;
            aux = aux.getProximo();
        } 
        return aux;
      }
      return null;
    }
    
    public int getTamanho() {
        return tamanho;
    }
}
