import java.util.ArrayList;
public class Lista {
    private ArrayList<String> vetor;
    public Lista() {
        vetor = new ArrayList<>();
    }
    public void adicionar(String nome) {
        vetor.add(nome);
    }
    public void excluir(String nome) {
        if (vetor.contains(nome)) {
            vetor.remove(nome);
        } else {
            System.out.println("Nome " + nome + " não encontrado.");
        }
    }
    public String buscar(String nome) {
        if (vetor.contains(nome)) {
            return "Nome " + nome + " encontrado.";
        } else {
            return "Nome " + nome + " não encontrado.";
        }
    }
    public int contar() {
        return vetor.size();
    }
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.adicionar("João");
        lista.adicionar("Maria");
        lista.adicionar("Carlos");
        System.out.println(lista.buscar("Maria"));
        lista.excluir("Maria");
        System.out.println(lista.buscar("Maria"));
        System.out.println("Contagem de nomes: " + lista.contar());
    }
}
 