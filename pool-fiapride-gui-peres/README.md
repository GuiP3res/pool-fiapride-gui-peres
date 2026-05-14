# FiapRide

## Informações do aluno

*   **Nome**: Gui Peres
*   **Curso**: ADS
*   **GitHub**: GuiP3res

## Descrição do projeto

O projeto **FiapRide** é um sistema de mobilidade urbana desenvolvido em Java, aplicando os principais conceitos de Programação Orientada a Objetos (POO) abordados nas aulas 1 a 9. O objetivo é simular as operações básicas de um aplicativo de transporte, como o cadastro de passageiros, gerenciamento de saldo, solicitação e finalização de viagens, e a gestão de diferentes tipos de veículos.

## Checklist das aulas

- [x] **Aula 1 - Classes e Objetos**: Criação da classe `Passageiro` com atributos `nome`, `saldo` e `idade`. Teste de criação de objetos em `Main.java`.
- [x] **Aula 2 - Métodos**: Adição dos métodos `adicionarSaldo()`, `descontarSaldo()` e `mostrarDados()` à classe `Passageiro`, com implementações de validação.
- [x] **Aula 3 - Encapsulamento**: Transformação dos atributos de `Passageiro` em `private`, com a criação de `getters` e `setters`. Implementação de validações para saldo não negativo, idade mínima e nome não vazio.
- [x] **Aula 4 - Construtores**: Criação de construtores padrão e customizado na classe `Veiculo`, utilizando `this()` e `this.`. Implementação de `setPlaca()` privado e `atualizarPlaca()` público, sem `setModelo()`.
- [x] **Aula 5 - Associação**: Criação da classe `Viagem` associada a `Passageiro`, contendo `origem`, `destino` e `valor`. Implementação do método `finalizarViagem()` para descontar o saldo do passageiro.
- [x] **Aula 6 - Herança**: Criação da classe abstrata `Veiculo` (classe mãe) e das classes `Carro` e `Moto` (classes filhas) utilizando `extends` e `super()`.
- [x] **Aula 7 - Polimorfismo**: Implementação do método `calcularAutonomia()` em `Veiculo` e sua sobrescrita (`@Override`) nas subclasses `Carro` e `Moto`. Criação de teste polimórfico em `Main.java` usando um array de `Veiculo`.
- [x] **Aula 8 - Classes Abstratas**: Transformação de `Veiculo` em `abstract class` e definição de `calcularAutonomia()` como método `abstract`, obrigando as subclasses a implementá-lo.
- [x] **Aula 9 - Interfaces**: Criação da interface `Eletrico` com a constante `POTENCIA_MAXIMA` e o método `carregarBateria()`. Criação da classe `CarroEletrico` que `implements Eletrico` e herda de `Veiculo`.

## Respostas completas das reflexões:

### Aula 1 - Classes e Objetos

A primeira aula, sobre **Classes e Objetos**, foi a base para entender como modelar o mundo real em código. A classe `Passageiro` foi criada para representar uma entidade com características (`nome`, `saldo`, `idade`) e comportamentos. A criação de objetos a partir dessa classe no `Main.java` demonstrou como instanciar essas representações, tornando o código mais organizado e próximo da lógica do negócio.

### Aula 2 - Métodos

Na Aula 2, o foco esteve nos **métodos**, que são as ações que os objetos podem realizar. Adicionar `adicionarSaldo()`, `descontarSaldo()` e `mostrarDados()` à classe `Passageiro` permitiu que o objeto `Passageiro` interagisse com seus próprios dados de forma controlada. A implementação de validações dentro desses métodos, como verificar se o saldo é suficiente antes de descontar, introduziu a ideia de lógica de negócio encapsulada nos comportamentos do objeto.

### Aula 3 - Encapsulamento

O **encapsulamento**, tema da Aula 3, é crucial para a segurança e a integridade dos dados. Ao transformar os atributos de `Passageiro` em `private` e fornecer `getters` e `setters` públicos, garantimos que o acesso e a modificação desses dados sejam feitos de maneira controlada. As validações adicionadas nos `setters` (saldo não negativo, idade mínima, nome não vazio) são exemplos práticos de como o encapsulamento protege o estado interno do objeto de valores inválidos, promovendo um código mais robusto e menos propenso a erros.

### Aula 4 - Construtores

A Aula 4 abordou os **construtores**, que são métodos especiais para inicializar objetos. A criação de construtores padrão e customizado na classe `Veiculo` permitiu flexibilidade na forma como os objetos `Veiculo` são criados. O uso de `this()` para chamar um construtor a partir de outro e `this.` para referenciar atributos da própria classe foi fundamental para evitar duplicação de código e garantir que os objetos sejam sempre inicializados em um estado válido. A restrição de não criar `setModelo()` e tornar `setPlaca()` privado, com um método público `atualizarPlaca()`, reforçou a importância do controle sobre a modificação dos atributos.

### Aula 5 - Associação

A **associação**, apresentada na Aula 5, demonstrou como as classes podem se relacionar. A classe `Viagem` foi associada à classe `Passageiro`, indicando que uma viagem pertence a um passageiro. Isso permitiu modelar uma viagem que é solicitada por um passageiro específico. O método `finalizarViagem()`, que desconta o valor da viagem do saldo do passageiro associado, exemplificou como a associação facilita a interação e a colaboração entre diferentes objetos no sistema.

### Aula 6 - Herança

A **herança**, tema da Aula 6, foi fundamental para entender como reutilizar código e estabelecer hierarquias entre classes. Ao criar `Veiculo` como uma classe mãe e `Carro` e `Moto` como classes filhas que `extends` de `Veiculo`, aprendi a compartilhar atributos e métodos comuns, evitando duplicação de código. O uso de `super()` para chamar o construtor da classe pai foi essencial para inicializar corretamente os atributos herdados, promovendo uma estrutura de código mais organizada e escalável.

### Aula 7 - Polimorfismo

A Aula 7 introduziu o **polimorfismo**, um conceito poderoso que permite que objetos de diferentes classes sejam tratados de forma uniforme através de uma interface comum. A criação do método `calcularAutonomia()` e sua sobrescrita (`@Override`) nas subclasses `Carro` e `Moto` demonstrou como cada tipo de veículo pode ter sua própria implementação desse comportamento. O teste polimórfico no `Main.java`, utilizando um array de `Veiculo` para chamar `calcularAutonomia()` em diferentes tipos de veículos, ilustrou a flexibilidade e a extensibilidade que o polimorfismo oferece.

### Aula 8 - Classes Abstratas

As **classes abstratas**, exploradas na Aula 8, aprofundaram o conceito de herança ao permitir a criação de classes que não podem ser instanciadas diretamente, mas servem como base para outras classes. Transformar `Veiculo` em uma `abstract class` e definir `calcularAutonomia()` como um método `abstract` forçou as subclasses a implementarem sua própria versão desse método. Isso garante que todas as subclasses de `Veiculo` possuam um comportamento `calcularAutonomia()`, mas deixam a implementação específica para cada tipo de veículo, promovendo um design mais robusto e consistente.

### Aula 9 - Interfaces

A Aula 9 focou nas **interfaces**, que são contratos que definem um conjunto de métodos que uma classe deve implementar. A criação da interface `Eletrico` com a constante `POTENCIA_MAXIMA` e o método `carregarBateria()` mostrou como definir um comportamento comum para classes que não necessariamente compartilham uma hierarquia de herança direta. A classe `CarroEletrico`, que `implements Eletrico` e herda de `Veiculo`, exemplificou como uma classe pode herdar de uma classe abstrata e implementar uma interface, combinando diferentes mecanismos de POO para criar um design flexível e modular.

## Desafio pessoal

Para este projeto, escolhi o domínio de **mobilidade urbana**, pois é um cenário rico em entidades e interações que se encaixam perfeitamente nos conceitos de POO. As classes criadas, como `Passageiro`, `Veiculo` (e suas subclasses `Carro`, `Moto`, `CarroEletrico`) e `Viagem`, representam os principais elementos desse domínio, permitindo simular operações como solicitar viagens, gerenciar saldos e calcular autonomias de veículos.

O maior desafio técnico foi a implementação do **polimorfismo e das classes abstratas** em conjunto com a herança. Entender como o método `calcularAutonomia()` poderia ser abstrato na classe `Veiculo` e ter implementações específicas em `Carro`, `Moto` e `CarroEletrico`, e como isso se manifestava no `Main.java` ao iterar sobre um array de `Veiculo`, exigiu uma compreensão mais profunda da dinâmica entre classes pai e filhas e a flexibilidade que o polimorfismo oferece. A depuração e o teste para garantir que o comportamento esperado fosse alcançado em cada caso foram cruciais.

## Conclusão

Através do desenvolvimento do projeto FiapRide, aprendi a aplicar de forma prática todos os conceitos de POO, desde os fundamentos de classes e objetos até tópicos mais avançados como polimorfismo, classes abstratas e interfaces. A experiência de construir um sistema do zero, seguindo uma estrutura modular e organizada, foi extremamente enriquecedora.

O conceito mais difícil de assimilar inicialmente foi a **combinação de herança com interfaces e classes abstratas**, especialmente como decidir qual abordagem usar em diferentes cenários. No entanto, a prática com o projeto FiapRide ajudou a clarear essas distinções e a entender os benefícios de cada um.

Como melhorias futuras, eu gostaria de implementar:

*   **Persistência de dados**: Salvar e carregar informações de passageiros, veículos e viagens em arquivos ou um banco de dados.
*   **Interface Gráfica (GUI)**: Desenvolver uma interface de usuário para tornar o sistema mais interativo e amigável.
*   **Tratamento de Exceções**: Adicionar um tratamento de erros mais robusto para situações inesperadas.
*   **Testes Unitários**: Criar testes automatizados para garantir a correção e a robustez do código.

Este projeto foi uma excelente oportunidade para consolidar o conhecimento em POO e me preparar para desafios de desenvolvimento mais complexos.
