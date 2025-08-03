#  NumerosApp

##  Descrição

O **NumerosApp** é um programa simples em Java que solicita ao usuário a digitação de **10 números inteiros**, armazena-os em um array e realiza as seguintes operações:

- Exibe todos os números digitados.
- Calcula e mostra a média dos números.
- Identifica e exibe o **maior** e o **menor** número.
- Valida a entrada, garantindo que apenas números inteiros sejam aceitos.

---

##  Objetivos do projeto

- Praticar manipulação de arrays em Java.
- Utilizar estruturas de repetição (`for`, `while`).
- Aplicar boas práticas de organização com **pacotes e métodos separados**.
- Introduzir **tratamento de entradas inválidas**.

---

##  Estrutura do projeto

```
src/
└── br/
    └── com/
        └── joaoquaresma/
            └── numeros/
                ├── Main.java
                └── NumerosUtilizados.java
```

- `Main.java`: contém a lógica principal de interação com o usuário.
- `NumerosUtilizados.java`: contém os métodos utilitários para processar o array.

---

##  Como executar

1. Abra o projeto no **IntelliJ IDEA** (ou outra IDE Java).
2. Execute a classe `Main.java`.
3. Digite 10 números inteiros quando solicitado.

---

##  Exemplo de uso

```
Digite 10 números inteiros:
Número 1: 5
Número 2: abc
Entrada inválida! Digite um número inteiro:
Número 2: 7
...

Resultados:
Números digitados: 5 7 8 10 1 4 3 6 2 9
Média dos Números Digitados: 5.50
Maior Número Digitado: 10
Menor Número Digitado: 1
```

---

##  Como executar em outras IDEs ou via terminal

###  Eclipse

1. Crie um novo projeto Java.
2. Copie os arquivos `.java` para a pasta `src/` do projeto.
3. Certifique-se de que o pacote `br.com.joaoquaresma.numeros` esteja correto.
4. Clique com o botão direito em `Main.java` → Run As → Java Application.

###  VS Code

1. Instale a extensão "Extension Pack for Java".
2. Abra a pasta do projeto no VS Code.
3. Certifique-se de que o JDK esteja configurado no ambiente.
4. Execute `Main.java` clicando no botão de "Run" ou via terminal integrado.

### Terminal (sem IDE)

1. Navegue até a pasta `src/` do projeto no terminal.

```bash
cd src
```

2. Compile os arquivos:

```bash
javac br/com/joaoquaresma/numeros/*.java
```

3. Execute o programa:

```bash
java br.com.joaoquaresma.numeros.Main
```

> Certifique-se de ter o JDK instalado e configurado corretamente no PATH.

Para rodar o código com Git, o processo envolve clonar o repositório, compilar e executar o programa. Aqui está o passo a passo completo:

 1. Clonar o repositório
Abra o terminal e digite:

bash

git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio
Substitua seu-usuario e seu-repositorio com o nome real do seu GitHub.

 2. Compilar o projeto Java
Assumindo que a estrutura está em src/br/com/joaoquaresma/numeros/:

bash

cd src
javac br/com/joaoquaresma/numeros/*.java
 3. Executar o projeto
Depois de compilar, execute com:

bash

java br.com.joaoquaresma.numeros.Main
 Requisitos
Ter o Java JDK instalado (de preferência versão 17 ou superior).

Verifique com:

bash

java -version
javac -version
 Dica extra: Executar com um único comando (Linux/macOS)
bash

cd src && javac br/com/joaoquaresma/numeros/*.java && java br.com.joaoquaresma.numeros.Main
