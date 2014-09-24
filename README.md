Quickstart JPA project archetype
========================

1. Instalação e uso do arquétipo
--------------------------------

Pré-requisitos
- Maven (compatível com a JDK instalada no PC)
- Git

1.1. Instalação do Maven
------------------------
O Maven deve ser baixado no site no formato .zip ou .tar.gz e descompactado em alguma pasta do disco.
É desejável que seja criado na máquina uma variável de ambiente M2_HOME apontando para esta pasta recém descompactada. Esta variável de ambiente pode ser do tipo sistema, caso o usuário tenha permissão na máquina para isto ou pode ser uma variável de usuário, caso o usuário corrente tenha privilégios limitados na máquina. O mais importante é que a pasta M2_HOME/bin esteja presente na variável PATH para que o maven funcione em linha de comando.
No Windows, podemos adicionar entradas no final do PATH com um ';'. No Linuz, é utilizado ':' como separador. 

1.2. Instalação do Git
----------------------
O Git não possui executável portável, isto é, não é só baixar um .zip e descompactar. Precisa ser instalado na máquina pelo administrador.

1.3. Utilização do arquétipo
----------------------------
Uma vez instalados os pré-requisitos, o arquétipo deve ser instalado no seu repositório local (ou remoto, caso desejar) para que fique visível ao maven. Isto é feito com o comando: mvn clean install
(Obs: Para instalação num repositório remoto, deve ser feito o mvn deploy. Não entrarei em detalhes, pois não é o objetivo deste guia)
O próximo passo, após a instalação do arquétipo é criar o arquétipo usando o comando mvn archetype:generate para isto, da seguinte forma:

mvn archetype:generate -DarchetypeGroupId=org.otojunior.archetype -DarchetypeArtifactId=quickstart-jpa-archetype -DarchetypeVersion=<versão do arquetipo>  -DgroupId=org.otojunior -DartifactId=<nome do seu projeto> -Dversion=<versão do seu projeto -Dpackage=<pacote do seu projeto> -Dmaven.test.skip=true -B

Vamos à explicação de cada parâmetro:

archetypeGroupId: É o grupo do arquétipo. Obrigatoriamente deve ficar deste jeito: org.otojunior.archetype
archetypeArtifactId: É o nome do arquétipo, então é: quickstart-jpa-archetype
archetypeVersion: É a versão do arquétipo: Use a última versão estável disponibilizada no github pelo desenvolvedor do arquetipo.
groupId: é o seu grupo de projetos. Escolha um prefixo usado em sua empresa por exemplo.
artifactId: é o seu projeto. Defina um nome para ele.
version: versão inicial do seu projeto. Geralmente projetos começam em 1.0-SNAPSHOT
package: pacote padrão da sua aplicação.

Na raiz do projeto tem um script que executa este comando. Deve ser EDITADO e retirado da pasta arquétipo para a pasta em que será criado seu projeto. (Ex.: retire o arquivo da pasta c:\jee6-enterpise-archetype e coloque em c:\projetos). 

===============================================

2. Configuração do sistema de Logs.

O sistema de log usado nas aplicações geradas por este arquétipo é a SFL4J. Trata-se de um façade para implementações distintas de log. A implementação padrão do arquétipo é a Logback (implementação nativa do SLF4J). O framework Logback permite a escrita em diversas fontes (appenders). Para mais detalhes, consultar a documentação do Logback (http://logback.qos.ch/).

No caso específico do DBAppender, foi colocado na pasta docs/logback/scripts os scripts de criação de banco para a maioria dos SGBDs mais usados no mercado.


