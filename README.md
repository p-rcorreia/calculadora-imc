# Calculadora de IMC com JavaFX

Aplicação desktop simples para calcular o IMC a partir do peso e da altura informados pelo usuário.

![Demonstração da Calculadora de IMC](./assets/calculadora-imc.gif)

## Repositório

[calculadora-imc](https://github.com/p-rcorreia/calculadora-imc.git)

## Objetivo

Construir uma interface gráfica com JavaFX para receber peso e altura, calcular o Índice de Massa Corporal e exibir o resultado formatado com duas casas decimais.

## Conceitos praticados

- Orientação a objetos
- Eventos em JavaFX
- Controles de formulário
- Validação de entrada
- Conversão de texto para número
- Tratamento de exceção com `NumberFormatException`

## Funcionalidades

- Campo para peso
- Campo para altura
- Botão para calcular
- Exibição do valor do IMC
- Tratamento de entradas inválidas
- Aceita valores decimais com ponto ou vírgula

## Status

Concluído.

## Como funciona

O cálculo usa a fórmula:

```txt
IMC = peso / (altura * altura)
```

Os valores digitados nos campos de texto são convertidos para `double`. Antes da conversão, a vírgula é substituída por ponto para aceitar entradas como `80,5` e `1,84`.

## Como executar

No PowerShell, com a variável `PATH_TO_FX` apontando para a pasta `lib` do JavaFX:

```powershell
javac --module-path "$env:PATH_TO_FX" --add-modules javafx.controls CalculadoraIMC.java
java --module-path "$env:PATH_TO_FX" --add-modules javafx.controls CalculadoraIMC
```

## Arquivo principal

```txt
CalculadoraIMC.java
```
