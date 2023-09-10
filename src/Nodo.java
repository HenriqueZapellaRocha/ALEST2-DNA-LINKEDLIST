public class Nodo {

        private char caractere;
        private Nodo proximoNodo;
        private int quantidade;

        public Nodo(char caractere, Nodo proximoNodo, int quantidade) {
            this.caractere = caractere;
            this.proximoNodo = proximoNodo;
            this.quantidade = quantidade;
        }

        public Nodo getProximoNodo() {
            return proximoNodo;
        }

        public char getCaractere() {
            return caractere;
        }

        public int getQuantidade() {
            return quantidade;
        }
        
        public void somaUm() {
            quantidade++;
        }

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
