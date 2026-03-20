public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    @Override
    public void tocar() {
        System.out.println("🎵 [iPod] Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("⏸️ [iPod] Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("🔍 [iPod] Música selecionada: " + musica);
    }

    // ==========================================
    // Implementações de AparelhoTelefonico
    // ==========================================
    @Override
    public void ligar(String numero) {
        System.out.println("📞 [Telefone] Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("📞 [Telefone] Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("🎙️ [Telefone] Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("🌐 [Safari] Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("🌐 [Safari] Nova aba adicionada.");
    }

    @Override
    public void atualizar() {
        System.out.println("🔄 [Safari] Atualizando página atual...");
    }
}
