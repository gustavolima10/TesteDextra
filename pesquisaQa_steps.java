package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.home_page;
import pages.pesquisaQa_page;
import core.Driver;

public class pesquisaQa_steps {

    home_page Home_page = new home_page();
    pesquisaQa_page PesquisaQA = new pesquisaQa_page();

    @Dado("que eu acesse a página da VV Test")
    public void que_eu_acesse_a_página_da_vv_test() {
        Driver.abreNavegdor();
    }

    @Dado("acesse o menu {string}")
    public void acesse_o_menu(String string) {
        Home_page.pesquisaQa();
    }

    @Quando("eu preencher todos os campos obrigatórios {string} {string} {string} {string} {string} {string} {string}")
    public void eu_preencher_todos_os_campos_obrigatórios(String nome, String sobrenome, String email, String conf_email, String telefone, String ling_prog, String resumo) {
        PesquisaQA.setDados(nome, sobrenome, email, conf_email, telefone, ling_prog, resumo);
        PesquisaQA.selectElementos();

    }

    @Então("deve ser direcionado para uma página de sucesso")
    public void deve_ser_direcionado_para_uma_página_de_sucesso() {
        PesquisaQA.validaMensagem();
    }

}
