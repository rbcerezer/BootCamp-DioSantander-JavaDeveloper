public class CaseTelefonia {
    public static void main(String[] args) {
        
        String plano = "M";

        /* Como seria em if/else - repetitivo
        
        if (plano == "B") {
            System.out.println("100 min de ligação");
        }else if (plano == "M") {
            System.out.println("100 min de ligação");
            System.out.println("Whats e Insta grátis");
        }else if (plano == "T") {
            System.out.println("100 min de ligação");
            System.out.println("Whats e Insta gratis");
            System.out.println("5Gb Youtube");
        }*/

        //como é em switch sem o break propositalmente, feito   em ordem decrescente de prioridades

        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("Whats e Insta grátis");
            }
            case "B": {
                System.out.println("100 min de ligação");
            }
        }
    }
    
}
