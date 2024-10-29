

public class Pessoa {

    private String nome;
    private String cpf;
    private int idade;
    private Carro carroPessoa;

    public void setNome (String nome){
        this.nome = nome;
    }

    public String getNome (){
        return nome;
    }

    public void setCpf (String cpf) {
        this.cpf = cpf;
    }

    public String getCpf () {
        return cpf;
    }

    public void setIdade (int idade) {
        this.idade = idade;
    }

    public int getIdade (){
        return idade;
    }

    public void setCarroPessoa (Carro carroPessoa){
        this.carroPessoa = carroPessoa;
    }

    public Carro getCarroPessoa (){
        return carroPessoa;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", carroPessoa=" + carroPessoa + "]";
    }

    



}
