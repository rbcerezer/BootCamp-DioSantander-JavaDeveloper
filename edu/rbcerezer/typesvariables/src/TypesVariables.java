public class TypesVariables {
    public static void main(String[] args) throws Exception {

        double basicSalary = 2500;
        //não representado por 2.500 - este seria decimais.

        short smallNumber = 1;
        int normalNUmber = smallNumber;
        short smallNumber2 = (short) normalNUmber;

        int number = 5;
        number = 10;
        System.out.println(number);

        final double VALOR_DE_PI = 3.14;
        //VALOR_DE_PI = 15; não se consegue alterar o valor.
        //para constantes preceder com "final" e nome em CAIXA ALTA
        System.out.println (VALOR_DE_PI);

        String name = "Rafael Cerezer";
        //modo de tipo de texto

    }
}
