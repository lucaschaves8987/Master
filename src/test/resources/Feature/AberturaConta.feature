@tag
Feature: Abertura de conta

Background:
 Given que o usuario acesse a url "https://www.original.com.br/"
 And selecionar o botao abrir conta

@pf
  Scenario Outline: Abertura de conta Aristides e Lucas
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




    