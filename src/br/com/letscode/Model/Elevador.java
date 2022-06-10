package br.com.letscode.Model;

public class Elevador {

    private int andarAtual = 0, totalAndares, capacidade, qntePessoas;

    public Elevador(int totalAndares, int capacidade) {
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
    }

    public void entraPessoa(){
        if (this.capacidade >= this.qntePessoas){
            this.qntePessoas++;
        }
        else {
            System.out.println("Elevador lotado");
        }
    }

    public void saiPessoa(){
        if (this.qntePessoas > 1){
            System.out.println("Elevador vazio");
        }
        else{
            this.qntePessoas--;
        }
    }

    public void sobe(){
        if(this.andarAtual < this.capacidade){
            this.andarAtual++;
        }
        else{
            System.out.println("Último andar");
        }
    }

    public void desce(){
        if(this.andarAtual <= 0){
            System.out.println("Está no térreo");
        }
        else{
            this.andarAtual--;
        }
    }

    @Override
    public String toString() {
        return "Elevador {" +
                "andarAtual=" + this.andarAtual +
                ", qntePessoas=" + this.qntePessoas +
                '}';
    }
}

