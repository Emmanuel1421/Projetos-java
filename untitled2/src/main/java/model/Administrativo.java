package model;

public class Administrativo extends Pessoa{
    private double horasTrabalhadas;

   public Administrativo(String nome, String cpf, int idade, double salario) {
       super(nome, cpf, idade, salario);
   }

   public Administrativo() {

   }

   public Administrativo (){
       super();
   }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void baterPonto(String horaEntrada, String horaSaida, String justificativa){

    }


}
