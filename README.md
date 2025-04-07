# 🍽️ Sistema de Pedidos com Interface Gráfica (Java Swing + MySQL)

Projeto desenvolvido para a disciplina de **Projeto de Software**, com foco na aplicação prática de **diagramas UML** — incluindo **Diagrama de Classes** e **Diagrama de Sequência** — na implementação de um sistema de gerenciamento de pedidos para restaurante.

A aplicação utiliza **Java (Swing)** e persistência de dados com **MySQL**.

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
- `Conexao.java`: Gerencia a conexão com o banco de dados.

### 📦 `dao`
- `PedidoDao.java`: Acesso a dados dos pedidos.  
- `PedidoRepository.java`: Interface de repositório para pedidos.  
- `ProdutoDao.java`: Acesso a dados dos produtos.  
- `ProdutoRepository.java`: Interface de repositório para produtos.  
- `ServidorPedido.java`: Gerencia os pedidos no servidor.

### 📦 `modelo`
- `Pedido.java`: Representa os pedidos realizados.  
- `Produto.java`: Representa os produtos disponíveis.

### 📦 `trabrestaurante`
- `AlterarProduto.java`: Interface para alteração de produtos.  
- `Cadastro.java`: Interface de cadastro de itens ou usuários.  
- `Cardapio.java`: Exibe os produtos disponíveis.  
- `Carrinho.java`: Gerencia os itens escolhidos pelos clientes.  
- `Main.java`: Classe principal do sistema.  
- `Pedidos.java`: Interface de visualização e gerenciamento de pedidos.

---

## 📘 Diagramas UML

### 📌 Diagrama de Classes

> Gerado com **Astah**, representando estrutura, atributos e relacionamentos entre classes.

#### ADM  
![ADM](https://github.com/yuyukiin/faculdade-cc/blob/main/Projeto%20de%20Software/Restaurante/Diagramas/Diagramas%20Gerais/Diagrama%20de%20classe.png)

#### Cliente  
![Cliente](https://github.com/yuyukiin/Projeto-Restaurante/blob/main/Diagramas/Diagrama%20de%20Classe%20Cliente.png)

---

### ↺ Diagrama de Sequência

> Representa o fluxo de mensagens entre objetos nas funcionalidades do sistema.

#### ADM
- **Cadastro de Produto**  
  ![Cadastro](https://github.com/yuyukiin/Projeto-Restaurante/blob/main/Diagramas/cadastrar%20Pedido.png)

- **Alterar Produto**  
  ![Alterar](https://github.com/yuyukiin/faculdade-cc/blob/main/Projeto%20de%20Software/Restaurante/Diagramas/Diagramas%20de%20Sequ%C3%AAncia/Alterar%20Pedido.png)

- **Excluir Produto**  
  ![Excluir](https://github.com/yuyukiin/faculdade-cc/blob/main/Projeto%20de%20Software/Restaurante/Diagramas/Diagramas%20de%20Sequ%C3%AAncia/Excluir%20Pedido.png)

- **Ver Pedidos**  
  ![Ver Pedidos](https://github.com/yuyukiin/Projeto-Restaurante/blob/main/Diagramas/Ver%20Pedidos.png)

#### Cliente
- **Adicionar ao Carrinho**  
  ![Adicionar Carrinho](https://github.com/yuyukiin/Projeto-Restaurante/blob/main/Diagramas/Adicionar%20Pedido%20Carrinho.png)

- **Realizar Pedido**  
  ![Realizar Pedido](https://github.com/yuyukiin/Projeto-Restaurante/blob/main/Diagramas/Realizar%20Pedido.png)

- **Remover Produto do Carrinho**  
  ![Remover Produto](https://github.com/yuyukiin/Projeto-Restaurante/blob/main/Diagramas/RetirarItem.png)

- **Finalizar Pedido**  
  ![Finalizar Pedido](https://github.com/yuyukiin/Projeto-Restaurante/blob/main/Diagramas/Realizar%20Pedido.png)

---

## 🚀 Guia de Execução

### 1. Clonar o Repositório

```bash
git clone https://github.com/yuyukiin/Projeto-Restaurante.git
cd Projeto-Restaurante
```

### 2. Configurar o Banco de Dados

- Criar banco MySQL com a estrutura esperada.
- Editar `Banco.txt` com os dados de conexão.

### 3. Compilar os Arquivos `.java`

```bash
javac */*.java *.java
```

### 4. Executar o Servidor

```bash
java dao.ServidorPedido
```

### 5. Abrir Interfaces

#### Cliente:
A interface `Cardapio` será aberta automaticamente.

#### Administrador:

- Cadastrar produtos:
```bash
java trabrestaurante.CadastrarProduto
```

- Alterar produtos:
```bash
java trabrestaurante.AlterarProduto
```

---

## 📌 Casos de Uso

### 📂 Diagrama de Casos de Uso

![Casos de Uso](https://github.com/yuyukiin/Projeto-Restaurante/blob/main/Diagramas/Diagrama%20de%20Caso%20de%20Uso.jpeg)

### 📄 Casos Descritivos

#### ✅ Adicionar Itens ao Pedido
- **Ator:** Cliente  
- **Descrição:** Adiciona itens ao pedido via carrinho.

#### ✅ Alterar Itens do Pedido
- **Ator:** Cliente  
- **Descrição:** Modifica itens antes da confirmação.

#### ✅ Confirmar Pedido
- **Ator:** Cliente  
- **Descrição:** Finaliza o pedido e envia para preparo.

#### ✅ Solicitar Conta
- **Ator:** Cliente  
- **Descrição:** Solicita a conta para pagamento.

#### ✅ Emitir Via
- **Ator:** Sistema  
- **Descrição:** Gera comprovante do pedido.

#### ✅ Alterar Pedido (ADM)
- **Ator:** Administrador  
- **Descrição:** Modifica um pedido já registrado.

#### ✅ Cadastrar Pedido (ADM)
- **Ator:** Administrador  
- **Descrição:** Registra um novo pedido no sistema.

> 📌 **Mais detalhes**: [Documentação Completa](https://github.com/yuyukiin/faculdade-cc/blob/main/Projeto%20de%20Software/Restaurante/Diagramas/Diagramas%20Gerais/Documentação.md)

---

## 👥 Autores

### Yuri Alexander Costa Machado  
📚 Ciência da Computação – UFN  
📧 yuricostamachado7@gmail.com  
🔗 GitHub: [@Yuyukiin](https://github.com/Yuyukiin)

### Pedro Henrique de Avila Daroda  
📚 Ciência da Computação – UFN  
📧 pedro.daroda@ufn.edu.br  
🔗 GitHub: [@pedr0xh](https://github.com/pedr0xh)

---

