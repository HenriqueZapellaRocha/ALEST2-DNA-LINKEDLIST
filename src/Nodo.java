public class Nodo {

        private char caractere;
        private Nodo proximoNodo;
        private int quantidade;
    
        //construtor da classe
        public Nodo(char caractere, Nodo proximoNodo, int quantidade) {
            this.caractere = caractere;
            this.proximoNodo = proximoNodo;
            this.quantidade = quantidade;
        }

        // getters para os atributos da classe nodo
        public Nodo getProximoNodo() {
            return proximoNodo;
        }

        public char getCaractere() {
            return caractere;
        }

        public int getQuantidade() {
            return quantidade;
        }

        // função que soma 1 na quantidade do nodo
        public void somaUm() {
            quantidade++;
        }

        //setters dos atributos da classe nodo
        public void setCaractere(char caractere) {
            this.caractere = caractere;
        }

        public void setProximoNodo(Nodo proximoNodo) {
            this.proximoNodo = proximoNodo;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }
        
        
}
