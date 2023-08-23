package LancamentoIphone.Iphone;

import LancamentoIphone.Iphone.Funcionalidades.NavegadorWeb;
import LancamentoIphone.Iphone.Funcionalidades.Phone;
import LancamentoIphone.Iphone.Funcionalidades.ReprodutorMusical;

public class Iphone implements NavegadorWeb, Phone, ReprodutorMusical{

    //NAVEGADOR
    @Override
    public void ExibirPagina() {
        System.out.println("EXIBINDO A PÁGINA WEB.");
    }

    @Override
    public void AdicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA.");
    }

    @Override
    public void AtualizarPagina() {
        System.out.println("ATUALIZANDO A PÁGINA.");
    }
    //REPRODUTOR MUSICAL
    @Override
    public void TocarMusica() {
        System.out.println("TOCANDO MÚSICA.");
    }

    @Override
    public void PausarMusica() {
        System.out.println("PAUSAR MÚSICA");
    }

    @Override
    public void SelecionarMusica() {
        System.out.println("SELECIONANDO A MÚSICA");
    }
    //PHONE
    @Override
    public void Ligar() {
        System.out.println("EFETUANDO LIGAÇÃO");
    }

    @Override
    public void Atender() {
        System.out.println("ATENDENDO LIGAÇÃO");
    }

    @Override
    public void IniciarCorreiroVoz() {
        System.out.println("INICIANDO CORREIRO DE VOZ.");
    }

  
    
    
}
