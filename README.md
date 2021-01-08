# TesteDextra

O projeto TesteDextra foi desenvolvido com as seguintes ferramentas:

Linguagem: Java + Cucumber utilizando Gherkin
Framework de criação do projeto: Intellij

Definição dos pacotes:

No Framework de test foram criados os seguintes pacotes e classes:

src > main > java > core > Driver = Onde é a classe de instanciamento do driver e definições de wait

src > test > java > pages = Onde são definidas as classes Pages, classes onde são capturados os elementos de cada pagina e realização de ação em cima de cada um deles 

src > test > java > steps = Classes onde são implementado as definições de etapas do teste

src > test > java > runner = Classe de configuração de execução do teste

src > test > resources > features = Classe onde são implementadas as features em cucumber, onde se realiza a implementação dos cenarios

Obs: No campo e-mail, como não se tratava de um campo de cadastro onde não se poderia repetir o mesmo em mais de 1 teste, foi informado dados chumbados fixos, caso se tratasse de um campo onde não se poderia realizar mais de um teste utilizando o mesmo e-mail o ideal seria a implamentação de um random de caracteres para sempre gerar um e-mail aleatório.
