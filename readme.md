# Atividade: Conceito de Polimorfismo

Implemente, caso já não tenha feito, os arquivos Conta.java, ContaCorrente.java, ContaPoupanca.java e Banco.java, conforme mostrado em sala de aula.
Considerando o código da imagem anexo, indique os comandos e o objeto onde ocorre o polimorfismo, explique este conceito e porque o mesmo está ocorrendo nestas partes do código. Implemente outro exemplo usando polimorfismo com Herança.

<img src="https://lh4.googleusercontent.com/n4Zd6e1nlxE3FwzYgG3iJNH-D330uJbfml7UAXzzYI4YynQK1bLjlxFXYpeOnYMDq2CFyUPDmWgOPYM=w1920-h969" />

## Entidades e suas responsabilidades

- Banco
    + Armazenar contas criadas e taxas de rendimento e manutenção
- Conta
    + Assegurar valores e dados de uma conta
    - Conta corrente
        + Cobrar taxas de manutenção do Banco
    - Conta poupança
        + Gerar taxas de rentabilidade do 

## Atividade
> Logo abaixo, neste mesmo arquivo, há a continuação da atividade

- [x] Arquivos Conta.java, ContaCorrente.java, ContaPoupanca.java e Banco.java implementados
- [x] Indique os comandos e o objeto onde ocorre o polimorfismo
- [x] Explicação sobre polimorfismo
- [x] Implementação de exemplo de polimorfismo usando herança

## Indique os comandos e o objeto onde ocorre o polimorfismo e explique porque o mesmo está ocorrendo nestas partes do código

Neste arquivo, ocorre a criação de uma classe abstrata, que conterá propriedades e métodos genéricos, que serão utilizados por "seus filhos".

```java
// Arquivo Conta.java
public abstract class Conta { // A classe está marcada como abstrata, ou seja, não podêmos utilizá-la para criar uma nova instância (Ex.: new Conta()), para isso, temos que extendê-la.
```

Nos dois arquivos logo abaixo, utilizamos "Conta" para extender suas propriedades e reduzir a quantidade de abstrações e partes 
genéricas.

```java
// Arquivo ContaPoupanca.java
public class ContaPoupanca extends Conta { // Esta classe está "extendendo" uma classe abstrada, a Conta, ou seja, está herdando todas as propriedades e métodos da super classe abtrata "Conta".
```

```java
// Arquivo ContaPoupanca.java
public class ContaPoupanca extends Conta { // Esta classe está "extendendo" uma classe abstrada, a Conta, ou seja, está herdando todas as propriedades e métodos da super classe abtrata "Conta".
```

## Explicação de polimorfismo

É a referência de uma classe à outra, genérica e abstrata, cujo atributos, comportamentos, propriedades e métodos são herdados para uma classe mais específica.

## Implemente outro exemplo usando polimorfismo com Herança.

Arquivos implementados:

```java
// Casa.java
public class Casa {
```

```java
// Predio.java
public class Predio extends Casa {
```
