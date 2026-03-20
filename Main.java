public class Main {
 public static void main(String[] args) {
    IPhone meuIPhone = new IPhone();

    System.out.println("--- Testando Reprodutor Musical ---");

    ReprodutorMusical ipod = meuIPhone;
    ipod.selecionarMusica("Coldplay - Viva La Vida");
    ipod.tocar();
    ipod.pausar();

    System.out.println("\n--- Testando Aparelho Telefônico ---");

    AparelhoTelefonico telefone = meuIPhone;
    telefone.ligar("+55 11 99999-9999");
    telefone.atender();
    telefone.iniciarCorreioVoz();

    System.out.println("\n--- Testando Navegador na Internet ---");

    NavegadorInternet safari = meuIPhone;
    safari.exibirPagina("https://www.apple.com/br");
    safari.adicionarNovaAba();
    safari.atualizar();
 }
}
