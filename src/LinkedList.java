public class LinkedList {

    private int nElementos;
    private Nodo primeiroElemento;
    private Nodo ultimoElemento;

    
    public LinkedList() {
        this.nElementos = 0;
        this.primeiroElemento = null;
        this.ultimoElemento = null;
    }

    public void adicionar(char caractere) {


    if((ultimoElemento != null) && ultimoElemento.getCaractere() == caractere) {
        ultimoElemento.somaUm();
        nElementos++;
    } else {    
        
        if(nElementos == 0) {
            this.primeiroElemento = new Nodo(caractere, null, 1);
            this.ultimoElemento = primeiroElemento;
            this.nElementos++;
        } else{
            Nodo aux = this.ultimoElemento;
            this.ultimoElemento = new Nodo(caractere, null, 1);
            aux.setProximoNodo(ultimoElemento);
            this.nElementos++;
        }
    }
    
    }

    public void somaElemento() {
        nElementos++;
    }

    public void remover(Nodo aSerRemovido,Nodo anterior) {


    // se o a ser removido e o primeiro elemento da linkedlist
    if(primeiroElemento == aSerRemovido) {
        primeiroElemento = primeiroElemento.getProximoNodo();
    } else {
    // se o elemento a ser removido e o segundo
    anterior.setProximoNodo(aSerRemovido.getProximoNodo());
    }



    /* 
    if(primeiroElemento.getProximoNodo() != null) {
    this.primeiroElemento = this.primeiroElemento.getProximoNodo();
    this.nElementos--;
    }

    if(aux == primeiroElemento) {
        primeiroElemento = aux.getProximoNodo();
        nElementos--;
    } else {
        anterior = anterior.getProximoNodo();
        anterior = aux.getProximoNodo();
        nElementos--;
    }
    */
    }

    public void buscador(Nodo aux, Nodo anterior) {


        for(int i =0; i < nElementos; i++) {
              if((primeiroElemento != null && aux != null) && primeiroElemento.getCaractere() != aux.getCaractere() ) {
        //adiciona o caractere novo
        adicionar(fusao(this.primeiroElemento.getCaractere(), aux.getCaractere()));
        //diminui um da quantidade dos dois carcteres usados 
        primeiroElemento.setQuantidade(primeiroElemento.getQuantidade() -1);
        aux.setQuantidade(aux.getQuantidade() -1);
        nElementos = nElementos -2;
        // remove os caracteres caso as suas quantidades sejam = 0
        if(primeiroElemento.getQuantidade() == 0){
            remover(primeiroElemento, anterior);
        } 
        if(aux.getQuantidade() == 0) {
            remover(aux,anterior);
        }
        break;
    } else if (aux != null) {
        anterior = aux;
        aux = aux.getProximoNodo();
    }

        }



/* 
    // diminui 1 da quantidade de caracteres seguidos
    if((primeiroElemento != null && aux != null) && primeiroElemento.getCaractere() != aux.getCaractere() ) {
        //adiciona o caractere novo
        adicionar(fusao(this.primeiroElemento.getCaractere(), aux.getCaractere()));
        //diminui um da quantidade dos dois carcteres usados 
        primeiroElemento.setQuantidade(primeiroElemento.getQuantidade() -1);
        aux.setQuantidade(aux.getQuantidade() -1);
        nElementos = nElementos -2;
        // remove os caracteres caso as suas quantidades sejam = 0
        if(primeiroElemento.getQuantidade() == 0){
            remover(primeiroElemento, anterior);
        } 
        if(aux.getQuantidade() == 0) {
            remover(aux,anterior);
        }
    } else if (aux != null) {
        anterior = aux;
        buscador(aux.getProximoNodo(), anterior);
    }
    */


    /* 
    Nodo aux = primeiroElemento.getProximoNodo();
    Nodo anterior = null;
    for(int i=0; i < nElementos; i++) {

        if((aux != null && primeiroElemento != null) && primeiroElemento.getCaractere() != aux.getCaractere()) {
        adicionar(fusao(this.primeiroElemento.getCaractere(), aux.getCaractere()));
        remover(aux, anterior);
        break;
        } else if (aux != null) {
        anterior = aux;
        aux = aux.getProximoNodo();
        }
    }
    */

    }

    public char fusao(char a, char b) {

        if((a == 'D' || a == 'N') && (b == 'D' || b == 'N')) {
            return 'A';
        } else if((a == 'A' || a == 'D') && (b == 'A' || b == 'D')) {
            return 'N';
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
