public class ResultadoEscolar {
    public static void main(String[] args) {
        //Controle de fluxo COMPOSTA
        
        int nota = 6;

        if(nota>= 7)
            System.out.println("Aprovado!");
        
            //transformando em encadeada
        
        else if (nota >= 5 && nota< 7) //retorna true or false
            System.out.println("Recuperação");
        
        else
            System.out.println("Reprovado!");
    }
    
}
