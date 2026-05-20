# Calculadora de IMC com JavaFX

Aplicacao desktop simples para calcular o IMC a partir do peso e da altura informados pelo usuario.

<img src="./assets/calculadora-imc.gif" alt="Demonstracao da Calculadora de IMC" width="520">

## Repositorio

[calculadora-imc](https://github.com/p-rcorreia/calculadora-imc.git)

## Objetivo

Construir uma interface grafica com JavaFX para receber peso e altura, calcular o Indice de Massa Corporal e exibir o resultado formatado com duas casas decimais.

## Conceitos praticados

- Orientacao a objetos
- Eventos em JavaFX
- Controles de formulario
- Validacao de entrada
- Conversao de texto para numero
- Tratamento de excecao com `NumberFormatException`

## Funcionalidades

- Campo para peso
- Campo para altura
- Botao para calcular
- Exibicao do valor do IMC
- Tratamento de entradas invalidas
- Aceita valores decimais com ponto ou virgula

## Status

Concluido.

## Como funciona

O calculo usa a formula:

```txt
IMC = peso / (altura * altura)
```

Os valores digitados nos campos de texto sao convertidos para `double`. Antes da conversao, a virgula e substituida por ponto para aceitar entradas como `80,5` e `1,84`.

## Como executar

No PowerShell, com a variavel `PATH_TO_FX` apontando para a pasta `lib` do JavaFX:

```powershell
javac --module-path "$env:PATH_TO_FX" --add-modules javafx.controls CalculadoraIMC.java
java --module-path "$env:PATH_TO_FX" --add-modules javafx.controls CalculadoraIMC
```

## Arquivo principal

```txt
CalculadoraIMC.java
```
