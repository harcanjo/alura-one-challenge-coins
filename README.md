# Conversor de Moedas desenvolvido em Java:

---

# Conversor de Moedas

Este projeto é um Conversor de Moedas desenvolvido em Java, onde os usuários podem realizar diversas operações de conversão entre diferentes moedas utilizando taxas dinâmicas obtidas de uma API de taxas de câmbio em tempo real.

## Objetivo

O objetivo deste projeto é proporcionar uma experiência interativa onde os usuários podem realizar conversões de moedas de forma simples e eficaz. O sistema obtém as taxas de câmbio atualizadas através de uma API, realiza o parse dos dados JSON retornados pela API, filtra as moedas de interesse e exibe as opções de conversão em um menu textual.

## Funcionalidades

O Conversor de Moedas oferece as seguintes funcionalidades principais:

1. **Listagem de Moedas Disponíveis**: Exibe as moedas suportadas pela API para escolha dos usuários.
   
2. **Conversão de Moedas**: Permite ao usuário escolher as moedas de origem e destino, inserir o valor a ser convertido e exibe o resultado da conversão com base nas taxas obtidas da API.

3. **Atualização Automática de Taxas**: As taxas de câmbio são obtidas dinamicamente da API, garantindo que os dados sejam precisos e atualizados em tempo real.

4. **Menu de Opções**: Oferece no mínimo 6 opções distintas de conversões de moedas para atender às necessidades variadas dos usuários.

## Passos para Executar o Projeto

### Configuração do Ambiente Java

Certifique-se de ter o ambiente Java configurado corretamente na sua máquina.

### Criação do Projeto

1. Clone este repositório para a sua máquina local.
   ```
   git clone git@github.com:harcanjo/alura-one-challenge-coins.git
   ```
   
2. Importe o projeto na sua IDE preferida (Eclipse, IntelliJ, etc.).

### Consumo da API

O projeto consome uma API de taxas de câmbio para obter as taxas dinâmicas. A URL da API está configurada no código-fonte.

### Análise da Resposta JSON

As respostas da API são em formato JSON. O projeto utiliza a biblioteca Gson para fazer o parse dos dados JSON em objetos Java.

### Filtro de Moedas

Após obter os dados da API, o projeto filtra e exibe apenas as moedas de interesse para o usuário.

### Exibição de Resultados aos Usuários

Os resultados das conversões são exibidos no console em um formato claro e compreensível.

## Como Utilizar

0. Mude o valor da variável `apiKey` na classe ExchangeRate.java para a sua apiKey.

1. Execute a aplicação Java.
   
2. Siga as instruções apresentadas no console para escolher as opções de conversão desejadas.

3. Insira as moedas de origem e destino, bem como o valor a ser convertido conforme solicitado.

4. Veja o resultado da conversão exibido no console.

## Tecnologias Utilizadas

- Java
- Gson (para manipulação de JSON)
- HttpClient (para requisições HTTP)
- IDE de sua escolha
