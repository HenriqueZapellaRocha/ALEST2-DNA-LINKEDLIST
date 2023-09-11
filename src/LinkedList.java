public class LinkedList {

    private int nElementos;
    private Nodo primeiroElemento;
    private Nodo ultimoElemento;

    
    public LinkedList() {
        this.nElementos = 0;
        this.primeiroElemento = null;
        this.ultimoElemento = null;
    }

    // função para aidiconar novos nodos a linkedlist
    public void adicionar(char caractere) {

    // verificaa se o caractere a ser adidiconado na lista e igual o ultimo, caso ele seja o ultimo elemnto recebe o acrescimo de um em sua quantidade
    if((ultimoElemento != null) && ultimoElemento.getCaractere() == caractere) {
        ultimoElemento.somaUm();
        nElementos++;
    } else {    
    // caso nao exista nennhum nodo na linkedlist. adiciona no incio 
    if(nElementos == 0) {
        this.primeiroElemento = new Nodo(caractere, null, 1);
        this.ultimoElemento = primeiroElemento;
        this.nElementos++;
    // caso o caractere a ser adicionado seja diferente do ultimo nodo
    } else{
        Nodo aux = this.ultimoElemento;
        this.ultimoElemento = new Nodo(caractere, null, 1);
        aux.setProximoNodo(ultimoElemento);
        this.nElementos++;
        }
    }
    
    }

    //função que remove nodos da linkedlist
    public void remover(Nodo aSerRemovido,Nodo anterior) {


    // se o a ser removido e o primeiro elemento da linkedlist
    if(primeiroElemento == aSerRemovido) {
        primeiroElemento = primeiroElemento.getProximoNodo();
    } else {
    // se o elemento a ser removido e o segundo
    anterior.setProximoNodo(aSerRemovido.getProximoNodo());
    }

    }

    //função que realiza a fusao entre os carcteres da cadeia 
    public void fusao(Nodo aux, Nodo anterior) {

        // verifica se o primeiro e segundo nodo sao do mesmo carctere, caso seja "junta os dois" e passa para o proximo
        if((aux != null) && aux.getCaractere() == primeiroElemento.getCaractere()) {
            primeiroElemento.setQuantidade(primeiroElemento.getQuantidade() + aux.getQuantidade());
            aux = aux.getProximoNodo();
            primeiroElemento.setProximoNodo(aux);
        }
        // se os dois nodos testados possuem carcteres diferentes
        if((primeiroElemento != null && aux != null) && primeiroElemento.getCaractere() != aux.getCaractere() ) {
            //adiciona o caractere novo
            adicionar(caracetere(this.primeiroElemento.getCaractere(), aux.getCaractere()));
            //diminui um da quantidade dos dois carcteres usados 
            primeiroElemento.setQuantidade(primeiroElemento.getQuantidade() -1);
            aux.setQuantidade(aux.getQuantidade() -1);
            nElementos = nElementos -2;
        // remove o primeiro elemento caso sua quantidade seja 0
        if(primeiroElemento.getQuantidade() == 0){
            remover(primeiroElemento, anterior);
        } 
        // remove o segundo elemento caso sua quantidade seja 0
        if(aux.getQuantidade() == 0) {
            remover(aux,anterior);
        }

    }
    }

    // função que define qual sera o novo carctere a ser adicionado apos a fusao 
    public char caracetere(char a, char b) {
        // caso seja A o carctere a ser adicionado
        if((a == 'D' || a == 'N') && (b == 'D' || b == 'N')) {
            return 'A';
        // caso seja N o caractere a ser adicionado 
        } else if((a == 'A' || a == 'D') && (b == 'A' || b == 'D')) {
            return 'N';
        // caso seja D o caractere a ser adicionado 
        } else {
            return 'D';
        }
    }

    public int nElementos() {
        return this.nElementos;
    }

    public StringBuffer escritor() {
        StringBuffer sb = new StringBuffer();
        Nodo aux = this.primeiroElemento;

        for(int i =0; i< this.nElementos; i++) {
            if(aux != null) {
            for(int j =0; j < aux.getQuantidade(); j++) {
            sb.append(aux.getCaractere());
            }
            aux = aux.getProximoNodo();
            }
        
        }
        
        return sb;
    }

    public int getnElementos() {
        return nElementos;
    }

    public Nodo getPrimeiroElemento() {
        return primeiroElemento;
    }

    public Nodo getUltimoElemento() {
        return ultimoElemento;
    }

    
}
