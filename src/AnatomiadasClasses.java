public class AnatomiadasClasses {
    public static void main(String[] args) {
        /*
Dentro de uma aplicação, recomenda-se que somente
uma classe possua o método main, responsável por iniciar todo o nosso programa
O método main recebe seu nome main, sempre terá a visibilidade public,
será difinido como static, não retornará nenhum valor com void e
receberá um parâmetro do tipo array de caracteres String[].
   public static void main(String[] args) {}
     */
        String BR = "Brasil";
        double PI = 3.14;
        int ESTADOS_BRASILEIRO = 27;
        int ANO_2000 = 2000;
/*Deve conter apenas letras, _ (underline), $ ou os números de 0 a 9
Deve obrigatoriamente se iniciar por uma letra (preferencialmente), _ ou $, jamais com número
Deve iniciar com uma letra minúscula (boa prática – ver abaixo)
Não pode conter espaços
Não podemos usar palavras-chave da linguagem
O nome deve ser único dentro de um escopo */
        // Declação inválida de variáveis

        int numero&um = 1; //Os únicos símbolos permitidos são _ e $
        int 1numero = 1;    //Uma variável não pode começar com númerico
        int numero um = 1; //Não pode ter espaço no nome da variável
        int long = 1; //long faz parte das palavras reservadas da linguagem

        // Declaração válida de veriáveis
        int numero$um = 1;
        int numero1 = 1;
        int numeroum = 1;
        int longo = 1;
// Estrutura

        Tipo NomeBemDefinido = Atribuição (opcional em alguns casos)

// Exemplo

        int idade = 23;
        double altura = 1.62;
        Dog spike; //observe que aqui a variável spike não tem valor, é normal
    }// Estrutura

    TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

//Exemplo

    int somar (int numeroUm, int numero2)

    String formatarCep (long cep);

    /*Basicamente indentar é um termo utilizado para escrever o código
     do programa de forma hierárquica, facilitando assim a visualização
      e o entendimento do programa.
     */
    public class BoletimEstudantil {
        public static void main(String[] args) {
            int mediaFinal = 6;
            if (mediaFinal < 6)
                System.out.println("REPROVADO");
            else if (mediaFinal == 6)
                System.out.println("PROVA MINERVA");
            else
                System.out.println("APROVADO");
        }
    }





}
