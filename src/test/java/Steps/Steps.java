package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	Metodos m = new Metodos();
	Elementos e = new Elementos();

	@Given("que o usuario acesse a url {string}")
	public void que_o_usuario_acesse_a_url(String url) {
		m.abrirNavegador(url);
	
	}

	@Given("selecionar o botao abrir conta")
	public void selecionar_o_botao_abrir_conta() throws InterruptedException {
		m.pausa(5000);
		m.clicar(e.getBtnAbrirConta());
	}

	@Given("selecionar o botao abrir conta para voce")
	public void selecionar_o_botao_abrir_conta_para_voce() {
		m.clicar(e.getBtnAbrirContaParaVoce());
	}

	@When("preencher o formulario de abertura de conta")
	public void preencher_o_formulario_de_abertura_de_conta() {
		m.preencher(e.getCampoNome(), "Marina");
		m.preencher(e.getCampoTelefone(), "123945698125");
		m.preencher(e.getCampoEmail(), "teste@teste.com.br");
		m.preencher(e.getCampoCpf(), "30104479060");
	}
	
	
	@When("selecionar o botao quero ser cliente")
	public void selecionar_o_botao_quero_ser_cliente() {
		m.clicar(e.getBtnQueroSerCliente());

	}

	@Then("sera exibido o texto falta pouco")
	public void sera_exibido_o_texto_falta_pouco() throws InterruptedException {
		m.pausa(2000);
		m.validarTexto(e.getTextoPronto(), "Falta pouco!");
		m.fecharNavegador();
	}

	@Given("selecionar o botao abrir conta para sua empresa")
	public void selecionar_o_botao_abrir_conta_para_sua_empresa() {
	    m.clicar(e.getBtnAbrirContaPessoaUnica());
	}

	@Given("selecionar o botao abrir conta pessoa unica")
	public void selecionar_o_botao_abrir_conta_pessoa_unica() {
	    m.clicar(e.getBtnAbrirContaPJ1());
	}

	@When("selecionar o botao enviar")
	public void selecionar_o_botao_enviar() {
	   m.clicar(e.getBtnEnviar());
	}

	@Then("sera exibido o texto Pronto")
	public void sera_exibido_o_texto_pronto() throws InterruptedException {
	   m.validarTexto(e.getTextoPronto(), "Pronto");
	   m.fecharNavegador();
	}
	
	@Given("preencher campo com nome {string}")
	public void preencher_campo_com_nome(String nome) {
	    m.preencher(e.getCampoNome(), nome);
	}

	@Given("preencher campo com cpf {string}")
	public void preencher_campo_com_cpf(String cpf) {
	    m.preencher(e.getCampoCpf(), cpf);
	}

	@Given("preencher campo com telefone {string}")
	public void preencher_campo_com_telefone(String telefone) {
	   m.preencher(e.getCampoTelefone(), telefone);
	}

	@Given("preencher campo com email {string}")
	public void preencher_campo_com_email(String email) {
	    m.preencher(e.getCampoEmail(), email);
	}
}
