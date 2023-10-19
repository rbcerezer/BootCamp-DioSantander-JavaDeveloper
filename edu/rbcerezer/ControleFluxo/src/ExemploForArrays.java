public class ExemploForArrays {
    public static void main(String[] args) {
        // em arrays o índice inicia em 0 zero
        String alunos[] = {"RAFAEL", "SERGIO", "BIA", "CARMEN"};

        for (int x=0; x< alunos.length; x++) {
            System.out.println("O aluno(a) no índice x= " + x + " é " + alunos[x]);
        }
    }
    
    /* FOR/EACH
    
     * for (String aluno : alunos){
     *  System.out.println ("Nome do aluno é: " + aluno)
     * }
     */
}
