public class FormatadorCepExemplo {
   public static void main(String[] args) {
        try {   
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não correpende com as regras de negócio.");
        }
    }
    
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8){
          throw new CepInvalidoException();
        } //foi necessário acrescentar "{}" no bloco if para evitar erro no return.
          //Simulando um cep formatado
          return "23.765-064";
    }       

}
//código não está 100%, a ver o pq não está achando a main class FormatadorCepExemplo