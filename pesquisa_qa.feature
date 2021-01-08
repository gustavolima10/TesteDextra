#language: pt

  Funcionalidade: Pesquisa com o QA
    Como um recrutador
    Quero colher dados da pesquisa
    Para fazer análises mais detalhadas do QA

    Esquema do Cenario: Preencher pesquisa com dados obrigatórios válidos

      Dado que eu acesse a página da VV Test
      E acesse o menu "Pesquisa - QA"
      Quando eu preencher todos os campos obrigatórios "<nome>" "<sobrenome>" "<email>" "<conf_email>" "<telefone>" "<ling_prog>" "<resumo>"
      Então deve ser direcionado para uma página de sucesso

      Exemplos:
      |   nome   |   sobrenome   |   email            |   conf_email       |   telefone      |   ling_prog   |       resumo      |
      |   Carlos |   Augusto     |   teste@teste.com  |   teste@teste.com  |   (11) 49984333 |   Java        |       teste 123   |
      |   Maria  |   Clara       |   teste2@teste.com |   teste2@teste.com |   (11) 84333878 |   Phyton      |       teste 478   |