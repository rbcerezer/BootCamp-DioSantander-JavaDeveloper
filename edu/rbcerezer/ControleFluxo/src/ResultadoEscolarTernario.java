public class ResultadoEscolarTernario {
    public static void main(String[] args) {
        int nota = 7;
        //Encadeada simples
        /*String resultado = nota >=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);*/

        //Escadeada composta 
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);

    }
}
