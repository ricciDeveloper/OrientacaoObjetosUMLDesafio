import LancamentoIphone.Iphone.Iphone;
public class Usuario {
    
    public static void main(String[] args)  {
        Iphone ip = new Iphone();

        ip.ExibirPagina();
        ip.AdicionarNovaAba();
        ip.AtualizarPagina();

        ip.TocarMusica();
        ip.PausarMusica();
        ip.SelecionarMusica();

        ip.Ligar();
        ip.Atender();
        ip.IniciarCorreiroVoz();

    

    }
}
