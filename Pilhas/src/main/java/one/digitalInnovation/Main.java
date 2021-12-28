package one.digitalInnovation;


public class Main {
    public static void main(String[] args) {
        Pilha minhaPilha = new Pilha();


        minhaPilha.Push(new No(1));
        minhaPilha.Push(new No(2));
        minhaPilha.Push(new No(3));
        minhaPilha.Push(new No(4));
        minhaPilha.Push(new No(5));
        minhaPilha.Push(new No(6));

        System.out.println(minhaPilha);
        System.out.println(minhaPilha.pop()); // retira o ultimo elemento da pilha
        System.out.println(minhaPilha);
        minhaPilha.Push(new No(99)); //adiciona um elemento a ultima posição de uma pilha
        System.out.println(minhaPilha);
    }
}
