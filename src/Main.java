public class Main {
    public static void main(String[] args) throws Exception {


        //Setando atribuições da pessoa Igor
        Pessoa igor = new Pessoa();
        igor.setNome("Igor Professor");
        igor.setCpf("11111111111");
        igor.setIdade(31);
        igor.setCarroPessoa(null);

        //Setando atribuições da pessoa Thaissa
        Pessoa thaissa = new Pessoa();
        thaissa.setNome("Thaissa Aluna");
        thaissa.setCpf("22222222222");
        thaissa.setIdade(21);
        igor.setCarroPessoa(null);

        //Setando atribuições do Carro da Thaissa
        Carro carroThaissa = new Carro();
        carroThaissa.setModelo("Fusca");
        carroThaissa.setAno("1975");
        carroThaissa.setPlaca("GH2113");

        //Setando Carro da Thaissa
        thaissa.setCarroPessoa(carroThaissa);

        //Setando atribuições do Carro da Igor
        Carro carroIgor = new Carro();
        carroIgor.setModelo("Fiat Uno");
        carroIgor.setAno("2024");
        carroIgor.setPlaca("GHK2H13");

        //Setando Carro da Igor
        igor.setCarroPessoa(carroIgor);

        System.out.println("Igor tem o carro "+igor.getCarroPessoa().getModelo()+" do ano "+igor.getCarroPessoa().getAno()+" da placa "+igor.getCarroPessoa().getPlaca());




    }

    
}
