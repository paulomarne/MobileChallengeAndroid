# MobileChallenge
Primeiro teste para o aplicativo de trabalho de engenheiro Android

# Aplicativo nativo Android usando arquitetura MVVM construída com a linguagem Kotlin

## Recomendações de design do Google com
- LiveData
- ViewModels
- Observable Objects

## Estrutura e Design:
[![An old rock in the desert](https://miro.medium.com/max/567/1*4EgdWEoVDFtQxQiU9Dk-eg.png)](https://medium.com/m)

Também use:

- Couchbase Lite 2.5 para persistencia de dados
- Retrofit2 para http requests
- Anko Layouts para look&Feel
- Android API 29 para debugging

## Descrição do APP:
Utilizando as APIs do Github, segui o padrão MVVM, que tenta separar a recuperação de dados, a lógica de exibição e a apresentação em três áreas. Por motivos de desenvolvimento de software e codificação relaxante, usei a próxima configuração:

## Dados:
Eu usei "pojos" em kotlin (classe de dados) para a representação de dados reais e abstração de objetos, esses objetos usados ​​para recuperar todos os tipos de informações (banco de dados e fictícios) para interagir com UI e UX. você pode encontrá-lo na pasta "data".

## Repositórios:
Os repositórios possuem lógica para obter, processar e compartilhar informações com domínio do App, no meu caso, tive três grandes entidades de 29 informações: Produtos de catálogo, pedido e descontos esses objetos foram manipulados usando Retrofit para rede, couchbase lite para persistência de banco de dados e LiveData para sincronia.

## UI:
The app's User interfaces are stored in folder "ui" you can find a main activity (tabbet for navigation), final activity (dummy paid feedback) and set of Fragments for show cabify products and order's details, also i divided recycleViews adapter in a diferent directory for Readability. 

## ViewModels:
Share LiveData objects between Fragments using viewModels in this folder you can find the classes what i did use for this task.

## Using cabify store application:

- You might pick every product would you like from product catalog, (this info is loaded using Cabify REST api)
- when your products have been selected you can see then at Order tab and remove from list with simple tab over item description.
- Order's discounts and Total will be updated with every product you add or remove from product list or Order's detail list.
- finish your order with tab over "place your order " button an remove all from your cart.

