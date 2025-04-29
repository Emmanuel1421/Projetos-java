package view;

import model.Administrativo;
import model.Pessoa;
import model.Professor;

import java.util.Scanner;

public class PrincipalFicr {
    public static void main(String[] args) {
       MenuPrincipalFicr menu = new MenuPrincipalFicr();
       Pessoa pessoaAdmin = new Administrativo();
       Pessoa pessoaProf = new Professor(30.00);
       Scanner scn = new Scanner(System.in);
       String continuar;
       int op;

        pessoaAdmin.setNome("Pelé Abadié");
        ((Administrativo)pessoaAdmin).baterPonto("10:50","15:30","Cheguei Cedo");

        pessoaAdmin.calcularSalario(1200.00);
        System.out.println("Salario do Adm: "+ pessoaAdmin.getSalario());

        ((Professor) pessoaProf).setHorasTrabalhadas(30);
//  o construct com super(salario) me permite tirar      pessoaProf.calcularSalario(30.00);
        System.out.println("Salário do prof: "+pessoaProf.getSalario());

//       do{
//           op = menu.menuGeral();
//           System.out.println("Deseja continuar: ");
//           continuar = scn.next();
//       }while (continuar.equalsIgnoreCase("Sim"));

    }

}
