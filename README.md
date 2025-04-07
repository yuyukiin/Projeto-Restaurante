# 🍽️ Sistema de Pedidos com Interface Gráfica (Java Swing + MySQL)

Este projeto foi desenvolvido como parte da disciplina de **Projeto de Software**, com o objetivo de demonstrar a aplicação prática de **diagramas UML** — incluindo **Diagrama de Classes** e **Diagrama de Sequência** — na implementação de um sistema para gerenciamento de pedidos em um restaurante.

A aplicação utiliza **Java** com **interface gráfica (Swing)** e realiza a persistência dos dados em um banco de dados **MySQL**.

---

## 🛠️ Funcionalidades

### 👨‍💼 Administrador
- Cadastrar Itens
- Editar Itens
- Excluir Itens
- Visualizar Pedidos

### 🧑‍🍽️ Cliente
- Adicionar Itens ao Carrinho
- Realizar Pedidos
- Finalizar Pedidos
- Remover Itens do Carrinho

---

## 📁 Estrutura do Projeto

### 📦 `conexao`
- `Conexao.java`: Classe responsável pela conexão com o banco de dados.

### 📦 `dao`
- `PedidoDao.java`: Responsável pelas operações de acesso aos dados dos pedidos.
- `PedidoRepository.java`: Interface de repositório para pedidos.
- `ProdutoDao.java`: Responsável pelas operações de acesso aos dados dos produtos.
- `ProdutoRepository.java`: Interface de repositório para produtos.
- `ServidorPedido.java`: Classe que lida com o gerenciamento de pedidos em um servidor.

### 📦 `modelo`
- `Pedido.java`: Representa os pedidos realizados.
- `Produto.java`: Representa os produtos disponíveis no sistema.

### 📦 `trabrestaurante`
- `AlterarProduto.java`: Interface gráfica para alteração de produtos.
- `Cadastro.java`: Interface gráfica para cadastro de novos itens ou usuários.
- `Cardapio.java`: Exibe os produtos disponíveis no sistema.
- `Carrinho.java`: Gerencia os itens selecionados pelos clientes.
- `Main.java`: Classe principal que inicia a aplicação.
- `Pedidos.java`: Interface gráfica para visualização e gerenciamento de pedidos.

---

## 📘 Diagrama de Classes

> Diagrama gerado utilizando **Astah**. Ele representa a estrutura das classes, atributos e relacionamentos.

### ADM  
![C - ADM](https://github.com/yuyukiin/faculdade-cc/blob/main/Projeto%20de%20Software/Restaurante/Diagramas/Diagramas%20Gerais/Diagrama%20de%20classe.png)

### Cliente  
![C - Cliente](https://github.com/yuyukiin/Projeto-Restaurante/blob/main/Diagramas/Diagrama%20de%20Classe%20Cliente.png)

---

## 🔄 Diagrama de Sequência

> Os diagramas de sequência ilustram o fluxo de mensagens entre objetos para diferentes funcionalidades do sistema.

### ADM

- **Cadastro de Produto**  
  ![DS - Cadastro de Produto](https://github.com/yuyukiin/Projeto-Restaurante/blob/main/Diagramas/cadastrar%20Pedido.png)

- **Alterar Produto**  
  ![DS - Alterar Produto](https://github.com/yuyukiin/faculdade-cc/blob/main/Projeto%20de%20Software/Restaurante/Diagramas/Diagramas%20de%20Sequ%C3%AAncia/Alterar%20Pedido.png)

- **Excluir Produto**  
  ![DS - Excluir Produto](https://github.com/yuyukiin/faculdade-cc/blob/main/Projeto%20de%20Software/Restaurante/Diagramas/Diagramas%20de%20Sequ%C3%AAncia/Excluir%20Pedido.png)

- **Ver Pedidos**  
  ![DS - Ver Pedidos](https://github.com/yuyukiin/Projeto-Restaurante/blob/main/Diagramas/Ver%20Pedidos.png)

### Cliente

- **Adicionar Pedido ao Carrinho**  
  ![DS - Adicionar Pedido Carrinho](https://github.com/yuyukiin/Projeto-Restaurante/blob/main/Diagramas/Adicionar%20Pedido%20Carrinho.png)

- **Realizar Pedido**  
  ![DS - Realizar Pedido](https://github.com/yuyukiin/Projeto-Restaurante/blob/main/Diagramas/Realizar%20Pedido.png)

- **Remover Produto do Carrinho**  
  ![DS - Remover Produto do Carrinho](https://github.com/yuyukiin/Projeto-Restaurante/blob/main/Diagramas/RetirarItem.png)

- **Finalizar Pedido**  
  ![DS - Finalizar Pedido](https://github.com/yuyukiin/Projeto-Restaurante/blob/main/Diagramas/Realizar%20Pedido.png)


---

## 🚀 Guia de Execução do Projeto

Siga os passos abaixo para rodar o sistema localmente:

### 1. Clonando o Repositório

Utilize o comando abaixo para obter o projeto:

```bash
git clone https://github.com/yuyukiin/Projeto-Restaurante.git
```

### 2. Configurando o Banco de Dados

- Crie um banco MySQL conforme a estrutura esperada pelo sistema.
- Insira as informações de conexão no arquivo `Banco.txt`.

### 3. Preparando o Ambiente

- Verifique se o JDK está instalado e compatível com o projeto.
- Se necessário, atualize a versão nas configurações do projeto.

### 4. Dependência Externa

- Adicione o `mysql-connector` às bibliotecas (Libraries) do projeto para permitir a conexão com o banco de dados.

### 5. Inicializando o Servidor

- Execute a classe `ServidorPedido.java` para iniciar o backend da aplicação.

### 6. Abrindo a Interface Gráfica

- Para visualizar o cardápio do cliente, abra o formulário `Cardapio.form` na IDE.


> 💡 Certifique-se de estar no diretório onde os arquivos `.java` estão salvos antes de executar os comandos acima.

---

## 📌 Casos de Uso

> Diagrama de caso de uso representando as interações principais dos usuários com o sistema.

![DS - Excluir Produto](https://github.com/yuyukiin/Projeto-Restaurante/blob/main/Diagramas/Diagrama%20de%20Caso%20de%20Uso.jpeg)

---

## 📌 Casos de Uso Descritivos

### Caso de Uso: Cadastrar Produto

- **Ator**: Administrador  
- **Resumo**: Permite ao ADM inserir um novo produto no sistema  
- **Pré-condições**: A interface deve estar aberta e o ADM autenticado  
- **Fluxo Principal**:
  1. ADM insere nome, preço, quantidade e categoria
  2. Clica no botão "Cadastrar"
  3. O produto é salvo no arquivo CSV

 ### Caso de Uso: Adicionar Itens ao Pedido
**Ator Primário:** Cliente  
**Descrição:** Permite que o cliente adicione itens ao seu pedido.  
**Fluxo Principal:**  
1. O cliente acessa o sistema de pedidos.
2. Seleciona os itens desejados no menu.
3. Adiciona os itens ao carrinho.
4. O sistema confirma a adição e exibe o pedido atualizado.

**Fluxo Alternativo:**  
- Se um item não estiver disponível, o sistema exibe uma mensagem de indisponibilidade.

---

### Caso de Uso: Alterar Itens Pedidos
**Ator Primário:** Cliente  
**Descrição:** Permite que o cliente modifique itens antes da confirmação do pedido.  
**Fluxo Principal:**  
1. O cliente acessa o pedido em andamento.
2. Modifica os itens (adiciona/remova conforme necessário).
3. O sistema atualiza o pedido e exibe a nova lista de itens.

**Fluxo Alternativo:**  
- Se o cliente tentar modificar um pedido já confirmado, o sistema nega a alteração.

---

### Caso de Uso: Confirmar Pedido
**Ator Primário:** Cliente  
**Descrição:** Finaliza o pedido com os itens escolhidos.  
**Fluxo Principal:**  
1. O cliente revisa os itens do pedido.
2. Confirma a finalização do pedido.
3. O sistema registra o pedido e o encaminha para preparo.

**Fluxo Alternativo:**  
- Se houver falha no registro, o sistema exibe um aviso e solicita nova tentativa.

---

### Caso de Uso: Solicitar Conta / Pedir a Conta
**Ator Primário:** Cliente  
**Descrição:** Permite que o cliente solicite a conta para pagamento.  
**Fluxo Principal:**  
1. O cliente acessa a opção de solicitar a conta.
2. O sistema processa a solicitação.
3. O atendente recebe a solicitação e entrega a conta.

**Fluxo Alternativo:**  
- Se houver erro na solicitação, o sistema exibe um aviso ao cliente.

---

### Caso de Uso: Emitir Via
**Ator Primário:** Sistema  
**Descrição:** Gera uma via do pedido para referência.  
**Fluxo Principal:**  
1. O cliente solicita uma via do pedido.
2. O sistema gera a via e disponibiliza a visualização ou impressão.

**Fluxo Alternativo:**  
- Se houver erro na geração da via, o sistema informa o cliente.

---

### Caso de Uso: Alterar Pedido (Administrador)
**Ator Primário:** Administrador  
**Descrição:** Permite que o administrador modifique um pedido já registrado.  
**Fluxo Principal:**  
1. O administrador acessa a lista de pedidos.
2. Seleciona o pedido a ser alterado.
3. Modifica os itens ou valores.
4. O sistema confirma a alteração e atualiza o pedido.

**Fluxo Alternativo:**  
- Se o pedido já foi finalizado, o sistema nega a alteração.

---

### Caso de Uso: Cadastrar Pedido (Administrador)
**Ator Primário:** Administrador  
**Descrição:** Permite que o administrador registre novos pedidos no sistema.  
**Fluxo Principal:**  
1. O administrador acessa o sistema de pedidos.
2. Insere os dados do novo pedido.
3. Confirma o cadastro.
4. O sistema armazena e exibe o pedido registrado.

**Fluxo Alternativo:**  
- Se houver erro no cadastro, o sistema solicita correção dos dados.

---

> Os demais casos descritivos estão no link a seguir: (https://github.com/yuyukiin/faculdade-cc/blob/main/Projeto%20de%20Software/Restaurante/Diagramas/Diagramas%20Gerais/Documentação.md)

---
## 👤 Autores

**Aluno:** Yuri Alexander Costa Machado  
**Curso:** Ciência da Computação – Universidade Franciscana (UFN)  
📧 Email: yuricostamachado7@gmail.com  
🔗 GitHub: [@Yuyukiin](https://github.com/Yuyukiin)

**Aluno:** Pedro Henrique de Avila Daroda  
**Curso:** Ciência da Computação – Universidade Franciscana (UFN)  
📧 Email: Pedro.daroda@ufn.edu.br  
🔗 GitHub: [@pedr0xh](https://github.com/pedr0xh)



---
