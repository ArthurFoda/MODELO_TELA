import java.util.ArrayList;
import java.util.List;

//Classe Animal: Define a estrutura básica dos animais, com atributos como nome, peso, espécie, cor, altura e observações
class Animal {
    private String nome;
    private double peso;
    private String especie;
    private String cor;
    private double altura;
    private String observacao;

    public Animal(String nome, double peso, String especie, String cor) {
        this.nome = nome;
        this.peso = peso;
        this.especie = especie;
        this.cor = cor;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", especie='" + especie + '\'' +
                ", cor='" + cor + '\'' +
                ", altura=" + altura +
                ", observacao='" + observacao + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();
        
        // Adicionando animais
        animais.add(new Animal("Pateta", 30, "cachorro", "preto"));
        animais.add(new Animal("Garfield", 12, "gato", "laranja"));
        
        // Atualizando informações
        animais.get(0).setCor("Goofy"); // Altera o nome Pateta para Goofy
        animais.get(1).setPeso(10); // Altera o peso do Garfield para 10 kg
        for (Animal animal : animais) {
            if (animal.getEspecie().equals("gato")) {
                animal.setCor("laranja"); // Altera a cor de todos os gatos para laranja
            }
        }

        // Removendo animais com peso maior que 200 kg
        animais.removeIf(animal -> animal.getPeso() > 200);
        
        // Imprimindo a lista de animais
        for (Animal animal : animais) {
            System.out.println(animal);
        }
    }
}
