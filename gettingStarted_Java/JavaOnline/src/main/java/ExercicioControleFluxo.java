public class ExercicioControleFluxo {
    public static void main(String[] args) {

        double salario = 3200;
        String imposto;

        if(salario < 1000){
            imposto = "5%";
        }else if(salario >= 1000 && salario < 2000){
            imposto = "10%";
        }else if(salario >= 2000 && salario < 4000){
            imposto = "15%";
        }else{
            imposto = "20%";
        }
        System.out.println("O imposto que incide sobre o salário é : "+imposto);
    }
}
