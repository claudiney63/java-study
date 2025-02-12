# Estudo de Java - Iniciante

Este repositório é destinado ao estudo de **Java**, desde conceitos iniciais até temas mais avançados. A primeira seção foca em introdução ao Java, cobrindo tópicos essenciais para quem está começando a aprender a linguagem.

## 📝 Sessão 1: Introdução ao Java

### 1.1 Histórico do Java

Java é uma linguagem de programação de alto nível, orientada a objetos, amplamente usada no desenvolvimento de aplicações de todos os tipos. Foi desenvolvida originalmente por **James Gosling** e **Mike Sheridan** na **Sun Microsystems** em 1991, sendo lançada como **Java 1.0** em 1996. A linguagem ganhou popularidade devido à sua portabilidade e ao conceito de "Write Once, Run Anywhere" (WORA), permitindo que programas sejam executados em diferentes plataformas sem modificações, graças à **Máquina Virtual Java (JVM)**.

### 1.2 Versões do Java

Desde a sua criação, o Java passou por várias versões importantes. Algumas das versões principais incluem:

- **Java 1.0** (1996): Primeira versão pública.
- **Java 5 (J2SE 5.0)** (2004): Introduziu recursos como generics, metadados e enumerações.
- **Java 8** (2014): Introduziu expressões lambda, Streams e a nova API de data e hora.
- **Java 9 e versões superiores**: Implementação do sistema de módulos (Project Jigsaw) e melhorias contínuas.

A versão mais recente disponível é o **Java 17 (LTS)** e o **Java 21**.

### 1.3 Estrutura de Projetos Java

A estrutura de um projeto Java é organizada de forma a facilitar o desenvolvimento, manutenção e escalabilidade do código. A seguir, uma visão geral da estrutura típica de um projeto Java:

```
meu-projeto/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── exemplo/
│       │           └── MeuPrograma.java
│       └── resources/
├── test/
│   └── java/
│       └── com/
│           └── exemplo/
│               └── MeuProgramaTest.java
├── build/
├── .gitignore
├── pom.xml (para projetos Maven)
└── build.gradle (para projetos Gradle)
```

- **src/main/java**: Contém o código-fonte principal do projeto.
- **src/main/resources**: Contém recursos como arquivos de configuração, arquivos de propriedades, etc.
- **test/java**: Contém o código-fonte dos testes.
- **build/**: Diretório onde os arquivos compilados e outros artefatos de build são colocados.
- **.gitignore**: Arquivo que especifica quais arquivos e diretórios devem ser ignorados pelo Git.
- **pom.xml**: Arquivo de configuração para projetos que utilizam o Maven como ferramenta de build.
- **build.gradle**: Arquivo de configuração para projetos que utilizam o Gradle como ferramenta de build.

Essa estrutura ajuda a manter o projeto organizado e facilita a integração com ferramentas de build e controle de versão.

### 1.3.1 Pacotes

Pacotes em Java são utilizados para agrupar classes relacionadas, facilitando a organização e evitando conflitos de nomes. Eles também ajudam a controlar o acesso às classes, métodos e variáveis, promovendo encapsulamento.

Para declarar um pacote, utiliza-se a palavra-chave `package` no início do arquivo Java:

```java
package com.exemplo;

public class MeuPrograma {
   // código da classe
}
```

Os pacotes são organizados hierarquicamente, e os nomes dos pacotes geralmente seguem o padrão de nomenclatura de domínios invertidos (por exemplo, `com.exemplo`).

### 1.3.2 Módulos

Módulos foram introduzidos no Java 9 como parte do Projeto Jigsaw. Eles permitem uma melhor modularização do código, facilitando a manutenção e a escalabilidade de grandes aplicações. Um módulo é um conjunto de pacotes agrupados em um arquivo `module-info.java`.

Exemplo de declaração de um módulo:

```java
module com.exemplo.meumodulo {
   requires java.base;
   exports com.exemplo;
}
```

- **requires**: Declara dependências de outros módulos.
- **exports**: Torna os pacotes públicos para outros módulos.

### Diferenças entre Pacotes e Módulos

- **Granularidade**: Pacotes são unidades menores de organização, enquanto módulos agrupam vários pacotes.
- **Encapsulamento**: Módulos oferecem um nível adicional de encapsulamento, permitindo controlar quais pacotes são acessíveis externamente.
- **Dependências**: Módulos permitem a declaração explícita de dependências entre diferentes partes da aplicação, melhorando a modularidade e a segurança.

Pacotes e módulos juntos ajudam a criar aplicações Java mais organizadas, modulares e fáceis de manter.

   ### 1.4 Instalação de Diferentes IDEs para Utilizar Java

   Para desenvolver em Java, é recomendável utilizar uma IDE (Integrated Development Environment) que facilite a escrita, compilação e depuração do código. Abaixo estão algumas das IDEs mais populares para Java e como instalá-las:

   #### 1.4.1 IntelliJ IDEA

   **IntelliJ IDEA** é uma das IDEs mais populares para desenvolvimento Java, conhecida por suas poderosas ferramentas de codificação e depuração.

   **Instalação:**

   1. Acesse o [site oficial do IntelliJ IDEA](https://www.jetbrains.com/idea/download/).
   2. Baixe a versão Community (gratuita) ou Ultimate (paga).
   3. Siga as instruções de instalação para o seu sistema operacional (Windows, macOS, Linux).

   #### 1.4.2 Eclipse

   **Eclipse** é uma IDE amplamente utilizada e de código aberto, com uma grande variedade de plugins disponíveis.

   **Instalação:**

   1. Acesse o [site oficial do Eclipse](https://www.eclipse.org/downloads/).
   2. Baixe o instalador "Eclipse IDE for Java Developers".
   3. Execute o instalador e siga as instruções para completar a instalação.

   #### 1.4.3 NetBeans

   **NetBeans** é uma IDE gratuita e de código aberto, suportada pela Apache Software Foundation.

   **Instalação:**

   1. Acesse o [site oficial do NetBeans](https://netbeans.apache.org/download/index.html).
   2. Baixe a versão mais recente do NetBeans.
   3. Siga as instruções de instalação para o seu sistema operacional.

   #### 1.4.4 Visual Studio Code

   **Visual Studio Code** é um editor de código leve e extensível, que pode ser configurado para desenvolvimento Java com a ajuda de extensões.

   **Instalação:**

   1. Acesse o [site oficial do Visual Studio Code](https://code.visualstudio.com/).
   2. Baixe e instale o Visual Studio Code para o seu sistema operacional.
   3. Instale a extensão "Java Extension Pack" da Microsoft através do marketplace de extensões do Visual Studio Code.

   Cada uma dessas IDEs oferece um conjunto de ferramentas e funcionalidades que podem ajudar a melhorar a produtividade e a qualidade do código Java. Escolha a que melhor se adapta às suas necessidades e preferências.

   ### 1.5 Primeiro Programa em Java

   Para criar seu primeiro programa em Java, siga os passos abaixo:

   #### 1.5.1 Configuração do Ambiente

   Antes de começar a programar, certifique-se de que o JDK (Java Development Kit) está instalado em seu sistema. Você pode baixar o JDK do [site oficial da Oracle](https://www.oracle.com/java/technologies/javase-downloads.html) ou utilizar uma distribuição open-source como o [AdoptOpenJDK](https://adoptopenjdk.net/).

   #### 1.5.2 Escrevendo o Código

   Crie um novo arquivo chamado `HelloWorld.java` e adicione o seguinte código:

   ```java
   public class HelloWorld {
      public static void main(String[] args) {
         System.out.println("Olá, Mundo!");
      }
   }
   ```

   #### 1.5.3 Compilando o Programa

   Abra o terminal ou prompt de comando, navegue até o diretório onde o arquivo `HelloWorld.java` está localizado e execute o seguinte comando para compilar o programa:

   ```sh
   javac HelloWorld.java
   ```

   Este comando criará um arquivo `HelloWorld.class` no mesmo diretório.

   #### 1.5.4 Executando o Programa

   Ainda no terminal, execute o seguinte comando para rodar o programa compilado:

   ```sh
   java HelloWorld
   ```

   Você verá a seguinte saída no terminal:

   ```
   Olá, Mundo!
   ```

   Parabéns! Você acabou de criar e executar seu primeiro programa em Java. Este é um simples exemplo de como escrever, compilar e executar um programa Java. À medida que você avança em seus estudos, aprenderá a criar programas mais complexos e utilizar as diversas funcionalidades que a linguagem Java oferece.


## 📝 Sessão 2: Estrutura Sequencial

### 2.1 Variáveis e Tipos Básicos

Nesta seção, vamos explorar os diferentes tipos de variáveis em Java e como utilizá-las. As variáveis são usadas para armazenar dados que podem ser manipulados durante a execução do programa. Em Java, existem vários tipos de variáveis, cada uma adequada para armazenar diferentes tipos de dados.

#### Exemplo de Código:

```java
public static void variaveisTipos() {
   System.out.println("Variáveis e Tipos Básicos");

   // Tipos de variáveis
   int a = 10; // Números inteiros
   double b = 20.5; // Números decimais
   String c = "Maria"; // Texto
   char d = 'A'; // Caractere
   boolean e = false; // Verdadeiro ou falso
   long f = 1000L; // Números inteiros longos
   short g = 12345; // Números inteiros curtos
   byte h = 127; // Números inteiros pequenos

   System.out.println(((Object) a).getClass().getName());
   System.out.println(((Object) b).getClass().getName());
   System.out.println(((Object) c).getClass().getName());
   System.out.println(((Object) d).getClass().getName());
   System.out.println(((Object) e).getClass().getName());
   System.out.println(((Object) f).getClass().getName());
   System.out.println(((Object) g).getClass().getName());
   System.out.println(((Object) h).getClass().getName());
}
```

### 2.2 Operações Básicas

As operações básicas em Java incluem adição, subtração, multiplicação, divisão e módulo. Essas operações são fundamentais para a manipulação de dados numéricos e são realizadas utilizando operadores aritméticos.

#### Exemplo de Código:

```java
public static void operacoesBasicas() {
   System.out.println("Operações Básicas");

   int a = 10;
   int b = 20;

   int soma = a + b;
   int subtracao = a - b;
   int multiplicacao = a * b;
   int divisao = a / b;
   int resto = a % b;

   System.out.println("Soma: " + soma);
   System.out.println("Subtração: " + subtracao);
   System.out.println("Multiplicação: " + multiplicacao);
   System.out.println("Divisão: " + divisao);
   System.out.println("Resto: " + resto);
}
```

### 2.3 Saída de Dados

Nesta seção, vamos explorar as diferentes formas de saída de dados em Java. A saída de dados é essencial para exibir informações ao usuário ou para depuração durante o desenvolvimento do programa. Em Java, existem várias maneiras de imprimir dados no console.

#### Exemplo de Código:

```java
public static void saidaDeDados() {
   System.out.println("Saída de Dados");

   // PrintLn
   System.out.println("Olá Mundo!");

   // Print
   System.out.print("Olá ");

   // PrintF
   System.out.printf("Olá %s", "Mundo!");

   // Concatenação
   String nome = "Maria";
   int idade = 30;
   double altura = 1.70;
   System.out.println("Nome: " + nome + " Idade: " + idade + " Altura: " + altura);

   // Casas decimais
   double x = 10.35784;
   System.out.printf("%.2f%n", x);

   // Formatando
   System.out.printf("%.4f%n", x);
   System.out.printf("%.2f%n", x);

   // Locale
   Locale.setDefault(Locale.US);
}
```

#### Explicação:

- **PrintLn**: Utiliza `System.out.println` para imprimir uma linha de texto seguida por uma nova linha.
- **Print**: Utiliza `System.out.print` para imprimir texto sem adicionar uma nova linha ao final.
- **PrintF**: Utiliza `System.out.printf` para imprimir texto formatado, permitindo a inclusão de variáveis dentro da string.
- **Concatenação**: Combina várias variáveis em uma única string usando o operador `+`.
- **Casas decimais**: Utiliza `System.out.printf` para formatar números decimais com um número específico de casas decimais.
- **Formatando**: Mostra diferentes formatos de saída para o mesmo número decimal.
- **Locale**: Define o local padrão para `Locale.US`, que pode afetar a formatação de números e datas.

### 2.4 Casting

Casting é o processo de conversão de um tipo de dado em outro. Em Java, existem dois tipos principais de casting: casting implícito (automático) e casting explícito (manual).

#### 2.4.1 Casting Implícito

O casting implícito ocorre quando a conversão é feita automaticamente pelo compilador, sem a necessidade de intervenção do programador. Isso geralmente acontece quando se converte um tipo de dado menor para um tipo de dado maior.

#### Exemplo de Código:

```java
public static void castingImplicito() {
   System.out.println("Casting Implícito");

   int a = 10;
   double b = a; // Conversão automática de int para double

   System.out.println("Valor de a: " + a);
   System.out.println("Valor de b: " + b);
}
```

#### 2.4.2 Casting Explícito

O casting explícito é necessário quando se deseja converter um tipo de dado maior para um tipo de dado menor. Isso deve ser feito manualmente pelo programador, pois pode resultar em perda de dados.

#### Exemplo de Código:

```java
public static void castingExplicito() {
   System.out.println("Casting Explícito");

   double a = 10.5;
   int b = (int) a; // Conversão manual de double para int

   System.out.println("Valor de a: " + a);
   System.out.println("Valor de b: " + b);
}
```

#### Explicação:

- **Casting Implícito**: Ocorre automaticamente quando não há risco de perda de dados, como ao converter um `int` para `double`.
- **Casting Explícito**: Requer a intervenção do programador para converter tipos de dados que podem resultar em perda de precisão, como ao converter um `double` para `int`.

O casting é uma ferramenta poderosa em Java, mas deve ser usado com cuidado para evitar erros e perda de dados.


### 2.5 Entrada de Dados

Nesta seção, vamos explorar como realizar a entrada de dados em Java utilizando a classe `Scanner`. A entrada de dados é essencial para permitir que os usuários interajam com o programa, fornecendo informações que podem ser processadas e utilizadas pelo código.

#### Exemplo de Código:

```java
import java.util.Scanner;

public static void entradaDeDados() {
   System.out.println("Entrada de Dados");

   // Criação do objeto Scanner
   Scanner scanner = new Scanner(System.in);

   // Entrada de dados do tipo String
   System.out.print("Digite seu nome: ");
   String nome = scanner.nextLine();
   System.out.println("Nome: " + nome);

   // Entrada de dados do tipo int
   System.out.print("Digite sua idade: ");
   int idade = scanner.nextInt();
   System.out.println("Idade: " + idade);

   // Entrada de dados do tipo double
   System.out.print("Digite sua altura: ");
   double altura = scanner.nextDouble();
   System.out.println("Altura: " + altura);

   // Fechando o scanner
   scanner.close();
}
```

#### Explicação:

- **Criação do objeto Scanner**: Utiliza `new Scanner(System.in)` para criar um objeto `Scanner` que lê a entrada do console.
- **Entrada de dados do tipo String**: Utiliza `scanner.nextLine()` para ler uma linha de texto digitada pelo usuário.
- **Entrada de dados do tipo int**: Utiliza `scanner.nextInt()` para ler um número inteiro digitado pelo usuário.
- **Entrada de dados do tipo double**: Utiliza `scanner.nextDouble()` para ler um número decimal digitado pelo usuário.
- **Fechando o scanner**: Utiliza `scanner.close()` para fechar o objeto `Scanner` e liberar os recursos associados.

A classe `Scanner` é uma ferramenta poderosa para realizar a entrada de dados em Java, permitindo que os programas sejam mais interativos e dinâmicos.