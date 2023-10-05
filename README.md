# [Princípios de Desenvolvimento Ágil de Software](https://www.coursera.org/learn/principios-de-desenvolvimento-agil-de-software)

### 1. Especificação de User Stories:

#### Logar usuário
- Como um usuário registrado, eu quero poder fazer login no sistema com meu nome de usuário e senha, para acessar as funcionalidades do sistema.
  - Tamanho (size): Pequeno
  - Valor de Negócios (BV): 5
  - Testes de Aceitação:
    1. Deve ser possível fazer login com um nome de usuário e senha válidos.
    2. Não deve ser possível fazer login com informações inválidas.
    
#### Visualizar lista de livros
- Como um usuário logado, eu quero ver uma lista de livros disponíveis no sistema, para escolher quais livros desejo marcar como lidos.
  - Tamanho (size): Médio
  - Valor de Negócios (BV): 8
  - Testes de Aceitação:
    1. Deve ser exibida uma lista de livros com seus títulos e número de páginas.
    2. A lista deve ser paginada para facilitar a navegação.
    
#### Visualizar livro
- Como um usuário logado, eu quero poder clicar em um livro da lista para ver mais detalhes sobre ele, como autor e gênero.
  - Tamanho (size): Pequeno
  - Valor de Negócios (BV): 3
  - Testes de Aceitação:
    1. Ao clicar em um livro da lista, as informações detalhadas do livro devem ser exibidas.
    
#### Marcar leitura de livro
- Como um usuário logado, eu quero poder marcar um livro como lido depois de visualizar suas informações, para ganhar pontos.
  - Tamanho (size): Médio
  - Valor de Negócios (BV): 7
  - Testes de Aceitação:
    1. Deve haver um botão "Marcar como lido" na página de detalhes do livro.
    2. Ao clicar em "Marcar como lido", o usuário deve ganhar 1 ponto mais pontos adicionais com base no número de páginas do livro.
    
#### Visualizar ranking de usuários
- Como um usuário logado, eu quero ver um ranking que exiba os 10 usuários com maior pontuação no sistema.
  - Tamanho (size): Médio
  - Valor de Negócios (BV): 6
  - Testes de Aceitação:
    1. Deve haver uma página de classificação que mostre os 10 usuários com mais pontos.
    
#### Visualizar pontos e troféus de usuário
- Como um usuário logado, eu quero ver meus pontos e os troféus que conquistei, para acompanhar meu progresso.
  - Tamanho (size): Pequeno
  - Valor de Negócios (BV): 4
  - Testes de Aceitação:
    1. Ao acessar a página pessoal do usuário, suas informações de pontuação e troféus devem ser exibidas.

### 2. Criação de Modelos:

Você pode criar os seguintes diagramas para auxiliar na compreensão do sistema:

- **Diagrama de Casos de Uso**: Representando as interações entre atores (usuários) e casos de uso do sistema.
- **Diagrama de Sequência**: Ilustrando o fluxo de interações entre atores e o sistema para cada uma das User Stories.
- **Diagrama de Classes**: Mostrando as principais classes do sistema e seus relacionamentos, incluindo classes para livros, usuários e pontos.

### 3. Planejamento da Iteração:

Divida as User Stories em tarefas granulares, estimando o esforço necessário para cada uma. Aqui está um exemplo de planejamento para duas iterações de tamanhos iguais:

**Iteração 1 (2 semanas):**

1. Implementar o login do usuário (3 dias).
2. Exibir lista de livros (4 dias).
3. Criar página de detalhes do livro (2 dias).
4. Permitir que os usuários marquem livros como lidos (4 dias).

**Iteração 2 (2 semanas):**

5. Implementar o sistema de pontuação com base no número de páginas (5 dias).
6. Criar o ranking de usuários (3 dias).
7. Exibir pontos e troféus do usuário em sua página pessoal (4 dias).

### 4. Implementação do Software:

Implemente o software seguindo o planejamento proposto, utilizando a metodologia TDD se possível. Registre o tempo gasto em cada tarefa e crie um gráfico de Burndown para acompanhar o progresso das iterações.

Após a implementação, grave um vídeo demonstrando o funcionamento do sistema e a execução de cada uma das User Stories.

Certifique-se de criar os testes de aceitação mencionados nas User Stories e verifique se todas as funcionalidades solicitadas foram implementadas.

Lembre-se de que este é apenas um exemplo de como você pode abordar esse projeto. Você pode ajustar o planejamento, os diagramas e a implementação conforme necessário para atender aos requisitos específicos do projeto.
Curso 7: Arquitetura de Software em Projetos Ágeis

Projeto Final: Aplicativo para Web com Componente Gamificado
