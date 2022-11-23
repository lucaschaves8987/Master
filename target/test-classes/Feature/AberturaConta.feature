@tag
Feature: Abertura de conta

Background:
 Given que o usuario acesse a url "https://www.original.com.br/"
 And selecionar o botao abrir conta

@pf
  Scenario Outline: Abertura de conta pessoa fisica
And selecionar o botao abrir conta para voce
#When preencher o formulario de abertura de conta
And preencher campo com nome "<nome>"
And preencher campo com cpf "<cpf>"
And preencher campo com telefone "<telefone>"
And preencher campo com email "<email>"
And selecionar o botao quero ser cliente
Then  sera exibido o texto falta pouco

Examples:
                      |nome    |email             | cpf            | celular   |
                      |samuel  |teste@teste.com.br|01422214060     |11111111111|
                      |joao    |teste@teste.com.br|27786240071     |11111111111|

@pj
  Scenario: Abertura de conta pessoa juridica
And selecionar o botao abrir conta para sua empresa
And selecionar o botao abrir conta pessoa unica 
When preencher o formulario de abertura de conta
And selecionar o botao enviar 
Then sera exibido o texto Pronto


    