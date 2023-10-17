public class CaixaEletronico {
    
    public static void main(String[] args) {
    //Controle de fluxo SIMPLES 

    double saldo = 25.0;
    double valorSolicitado = 17.0;

    if(valorSolicitado < saldo){
        saldo = saldo - valorSolicitado;
        System.out.println("Novo saldo: " + saldo);

    }// transformando em Composta
    else
        System.out.println("Saldo insuficiente!");

        


    }
}
