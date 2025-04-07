# 📦 Cadastro de Produto com Interface Gráfica (Java + CSV)

Este projeto é um exemplo didático utilizado na disciplina de **Projeto de Software**, com o objetivo de demonstrar como diagramas UML (como o **Diagrama de Classes** e o **Diagrama de Sequência**) se relacionam com a implementação prática de um sistema em Java.

A funcionalidade central é o **Cadastro de Produtos**, realizado por meio de uma **interface gráfica com Swing** e armazenamento em um arquivo **CSV**, permitindo leitura e persistência de dados de forma simples.

---

## ✨ Funcionalidade Principal

Funcionalidade disponível no sistema:

- Cadastro de produtos com os seguintes campos:
  - Nome
  - Preço
  - Quantidade
  - Categoria
- Armazenamento e persistência dos dados em **arquivo CSV**
- Interface gráfica amigável e funcional utilizando **Java Swing**

---

## 🧱 Estrutura do Projeto

Abaixo estão os principais componentes que compõem a arquitetura do projeto:

- `Produto.java`: Classe modelo (Model) que representa um produto no sistema
- `ProdutoRepository.java`: Classe responsável por salvar e recuperar os produtos no arquivo CSV
- `ProdutoForm.java`: Interface gráfica para entrada dos dados (View + Controller)

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
  ![DS - Cadastro de Produto](https://github.com/yuyukiin/faculdade-cc/blob/main/Projeto%20de%20Software/Restaurante/Diagramas/Diagramas%20de%20Sequ%C3%AAncia/Cadastro%20Pedido.png)

- **Alterar Produto**  
  ![DS - Alterar Produto](https://github.com/yuyukiin/faculdade-cc/blob/main/Projeto%20de%20Software/Restaurante/Diagramas/Diagramas%20de%20Sequ%C3%AAncia/Alterar%20Pedido.png)

- **Excluir Produto**  
  ![DS - Excluir Produto](https://github.com/yuyukiin/faculdade-cc/blob/main/Projeto%20de%20Software/Restaurante/Diagramas/Diagramas%20de%20Sequ%C3%AAncia/Excluir%20Pedido.png)

- **Ver Pedidos**  
  ![DS - Ver Pedidos](https://github.com/yuyukiin/Projeto-Restaurante/blob/main/Diagramas/Ver%20Pedidos.png)

### Cliente

- **Adicionar Pedido ao Carrinho**  
  ![DS - Adicionar Pedido Carrinho](https://github.com/yuyukiin/Projeto-Restaurante/blob/main/Diagramas/Adicionar%20Pedido%20Carrinho.png)

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

## 🗂️ Descrição dos Arquivos

| Arquivo                   | Descrição                                                                 |
|--------------------------|---------------------------------------------------------------------------|
| `Produto.java`           | Classe modelo que representa um produto no sistema                        |
| `ProdutoForm.java`       | Interface gráfica onde os dados do produto são inseridos                 |
| `ProdutoRepository.java` | Classe de acesso a dados, responsável por ler e escrever no arquivo CSV   |
| `produtos.csv`           | Arquivo de texto onde os produtos cadastrados são armazenados             |
| `LICENSE`                | Licença do projeto (MIT)                                                  |
| `README.md`              | Este arquivo, com explicações, diagramas e instruções de uso              |

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

## 👤 Autor

**Aluno:** Yuri Alexander Costa Machado  
**Curso:** Ciência da Computação – Universidade Franciscana (UFN)

📧 Email: yuricostamachado7@gmail.com  
🔗 GitHub: [@Yuyukiin](https://github.com/Yuyukiin)

---
