package Elementos;

import org.openqa.selenium.By;

public class Elementos {
	private By btnAbrirConta = By.xpath("/html/body/div[2]/nav[2]/div[2]/div[4]/a");
	private By btnAbrirContaParaVoce = By.id("bt1");
	private By campoNome = By.id("nome");
	private By campoTelefone = By.id("telefone");
	private By campoEmail = By.id("email");
	private By campoCpf = By.id("cpf");
	private By btnQueroSerCliente = By.id("btnEnviar");
	private By textoFaltaPouco = By.xpath("//*[@id=\"pu-modalSucesso\"]/div/div[1]/p/span[1]");
    private By btnAbrirContaPJ= By.id("bt2");
    private By btnAbrirContaPessoaUnica= By.id("bt3");
    private By btnEnviar = By.id("btnEnviar");
    private By textoPronto = By.xpath("//*[@id=\"section-2\"]/form/div/div[1]/h3");
    
	
	public By getBtnEnviar() {
		return btnEnviar;
	}
	public void setBtnEnviar(By btnEnviar) {
		this.btnEnviar = btnEnviar;
	}
	public By getTextoPronto() {
		return textoPronto;
	}
	public void setTextoPronto(By textoPronto) {
		this.textoPronto = textoPronto;
	}
	public By getBtnAbrirContaPJ1() {
	return btnAbrirContaPJ;
}
    public By getBtnAbrirContaPessoaUnica() {
	return btnAbrirContaPessoaUnica;
}
	public By getBtnAbrirConta() {
		return btnAbrirConta;
	}
	public By getBtnAbrirContaParaVoce() {
		return btnAbrirContaParaVoce;
	}
	public By getCampoNome() {
		return campoNome;
	}
	public By getCampoTelefone() {
		return campoTelefone;
	}
	public By getCampoEmail() {
		return campoEmail;
	}
	public By getCampoCpf() {
		return campoCpf;
	}
	public By getBtnQueroSerCliente() {
		return btnQueroSerCliente;
	}
	public By getTextoFaltaPouco1() {
		return textoFaltaPouco;
	}
	
	}
	
	
	

