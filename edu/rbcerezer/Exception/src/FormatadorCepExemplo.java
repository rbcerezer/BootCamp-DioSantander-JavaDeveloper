public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try{
        String cepFormatado = formatarCep("1347441");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP não corresponde as regras de negócio. Deve conter obrigatoriamente 8 números");;
        }

    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if(cep.length() != 8)
        throw new CepInvalidoException();

        //simulando um cep fromatado
        return "13.474-411";
    }
}
