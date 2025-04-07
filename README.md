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

## 🧱 Estrutura do Projeto

- `Item.java`: Classe que representa os produtos disponíveis no sistema.
- `Carrinho.java`: Gerencia os itens selecionados pelos clientes.
- `Pedido.java`: Representa os pedidos realizados.
- `ProdutoDAO.java`: Responsável pelas operações de acesso aos dados no banco MySQL.
- `AdministradorView.java` e `ClienteView.java`: Interfaces gráficas principais para cada tipo de usuário.


> 💡 Obs: Algumas nomenclaturas podem variar no seu código (como `PedidoForm`), verifique se está de acordo com o nome real dos arquivos.

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

## ▶️ Como Executar

Para executar o sistema localmente, siga os passos abaixo:

1. Clone este repositório:
   ```bash
   git clone https://github.com/yuyukiin/Projeto-Restaurante.git
   ```
2. Compile os arquivos `.java`:
   ```bash
   javac *.java
   ```
3. Execute a interface gráfica:
   ```bash
   java ProdutoForm
   ```

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

> Os demais casos descritivos estão no link a seguir: (https://github.com/yuyukiin/faculdade-cc/blob/main/Projeto%20de%20Software/Restaurante/Diagramas/Diagramas%20Gerais/Documentação.md)

---
## 👤 Autores

**Aluno:** Yuri Alexander Costa Machado  
**Curso:** Ciência da Computação – Universidade Franciscana (UFN)  
📧 Email: yuricostamachado7@gmail.com  
🔗 GitHub: [@Yuyukiin](https://github.com/Yuyukiin)

**Aluno:** Pedro Henrique de Avila Daroda  
**Curso:** Ciência da Computação – Universidade Franciscana (UFN)  
🔗 GitHub: [@pedr0xh](https://github.com/pedr0xh)


---
