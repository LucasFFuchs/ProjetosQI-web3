package empregadoteste;

import empregado.Empregado;

public class EmpregadoTeste{
    public static void main(String[] args) {
        Empregado emp_um = new Empregado();
        emp_um.setNome("Lucas");
        emp_um.setSobrenome("Fuchs");
        emp_um.setSalario(1000);
        
        Empregado emp_dois = new Empregado();
        emp_dois.setNome("Julio");
        emp_dois.setSobrenome("Cesar");
        emp_dois.setSalario(2000);
        
        System.out.println("O salário anual de " + emp_um.getNome() + " " + emp_um.getSobrenome() + " é: " + emp_um.getSalario()*12);
        System.out.println("O salário anual de " + emp_dois.getNome() + " " + emp_dois.getSobrenome() + " é: " + emp_dois.getSalario()*12);
        
        emp_um.setSalario(emp_um.getSalario()*1.1);
        emp_dois.setSalario(emp_dois.getSalario()*1.1);
        
        System.out.println("O salário anual de " + emp_um.getNome() + " " + emp_um.getSobrenome() + " após o aumento salarial de 10% é: " + emp_um.getSalario()*12);
        System.out.println("O salário anual de " + emp_dois.getNome() + " " + emp_dois.getSobrenome() + " após o aumento salarial de 10% é: " + emp_dois.getSalario()*12);

    }
}
