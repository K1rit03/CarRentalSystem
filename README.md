#[ENGLISH]

# Car Rental System

## Overview

The **Car Rental System** is a simple Java application designed to calculate the rental cost of a vehicle based on the number of days rented. It includes basic features like cost calculation and a discount mechanism for rentals exceeding 7 days. This project also includes unit tests using JUnit 5 to ensure the reliability of the cost and discount calculations.

### Features

- **Cost Calculation**: Computes the total rental cost based on the daily rate and number of days.
- **Discount**: Applies a 10% discount for rentals longer than 7 days.
- **Unit Tests**: Comprehensive test suite with JUnit 5 to verify the functionality.

## Requirements

- Java 21
- Maven 3.6.0 or higher


### Usage

- Create a Veichle instance with a model name and daily cost.

- Use calculateCost(days) to get the total cost for a specified number of days.

- Use descount(days) to calculate the discount (if applicable).


Model: Fusca
Cost for 10 days: 1000.0
Discount: 100.0
Total cost after discount: 900.0

###Testing

## The project includes a test suite in VeichleTest.java that covers:

- Cost calculation without discount

- Cost calculation with discount

- Edge cases like zero or negative rental days

#[PORTUGUES]

# Sistema de Locação de Veículos

## Visão Geral

O **Sistema de Locação de Veículos** é uma aplicação Java simples projetada para calcular o custo de aluguel de um veículo com base no número de dias alugados. Inclui recursos básicos como cálculo de custo e um mecanismo de desconto para aluguéis superiores a 7 dias. Este projeto também inclui testes unitários usando JUnit 5 para garantir a confiabilidade dos cálculos de custo e desconto.

### Funcionalidades

- **Cálculo de Custo**: Calcula o custo total do aluguel com base na taxa diária e no número de dias.
- **Desconto**: Aplica um desconto de 10% para aluguéis superiores a 7 dias.
- **Testes Unitários**: Conjunto de testes abrangente com JUnit 5 para verificar a funcionalidade.

## Requisitos

- Java 21
- Maven 3.6.0 ou superior

### Uso

- Crie uma instância de Veichle com um nome de modelo e custo diário.

- Use calculateCost(days) para obter o custo total para um número especificado de dias.

- Use descount(days) para calcular o desconto (se aplicável).

Modelo: Fusca
Custo para 10 dias: 1000.0
Desconto: 100.0
Custo total após desconto: 900.0

### Testes

## O projeto inclui um conjunto de testes em VeichleTest.java que cobre:

- Cálculo de custo sem desconto

- Cálculo de custo com desconto

- Casos extremos como dias de aluguel zero ou negativos

