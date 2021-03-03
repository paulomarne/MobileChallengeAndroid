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

## Interfaces do Usuário:
As interfaces de usuário do aplicativo são armazenadas na pasta "ui", você pode encontrar uma atividade principal (tabbet para navegação), atividade final (feedback pago fictício) e conjunto de fragmentos para mostrar produtos e detalhes do pedido, também dividi o adaptador recycleViews em um adaptador diferente diretório para legibilidade.

## ViewModels:
Compartilhe objetos LiveData entre Fragments usando viewModels nesta pasta, você pode encontrar as classes que usei para esta tarefa.

## Usando github application:

Você pode escolher todos os produtos que desejar no catálogo de produtos (essas informações são carregadas usando a API REST do Github) 39 - quando seus produtos forem selecionados, você poderá vê-los na guia Pedido e removê-los da lista com uma guia simples sobre a descrição do item. 40 - Os descontos e o total do pedido serão atualizados com cada produto que você adicionar ou remover da lista de produtos ou da lista de detalhes do pedido. 41 - finalize seu pedido com a guia sobre o botão "faça seu pedido" e remova tudo do seu carrinho.

