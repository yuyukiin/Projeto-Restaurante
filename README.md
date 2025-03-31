# Projeto Restaurante

breve explicação como fiz

---

## ✨ Funcionalidade Principal

- Cadastro de produto com os campos:
  - Nome
  - Preço
  - Quantidade
  - Categoria
- Armazenamento dos dados em arquivo CSV
- Interface simples com Java Swing

---

## 🧱 Estrutura do Projeto

- `Produto`: classe modelo que representa o produto
- `ProdutoDAO`: responsável por salvar e carregar os dados do arquivo CSV
- `PedidoForm`: interface gráfica para entrada dos dados

---

## 📘 Diagrama de Classes

### Astah

![C - Cadastro de Produto](https://github.com/yuyukiin/faculdade-cc/blob/main/Projeto%20de%20Software/Restaurante/Diagramas/Diagramas%20Gerais/Diagrama%20de%20classe.png)

---

## 🔄 Diagrama de Sequência

### Astah  
Cadastro de Produto  
![DS - Cadastro de Produto](https://github.com/yuyukiin/faculdade-cc/blob/main/Projeto%20de%20Software/Restaurante/Diagramas/Diagramas%20de%20Sequ%C3%AAncia/Cadastro%20Pedido.png)  
Alterar Produto  
![DS - Alterar Produto](https://github.com/yuyukiin/faculdade-cc/blob/main/Projeto%20de%20Software/Restaurante/Diagramas/Diagramas%20de%20Sequ%C3%AAncia/Alterar%20Pedido.png)  
Excluir Produto  
![DS - Excluir Produto](https://github.com/yuyukiin/faculdade-cc/blob/main/Projeto%20de%20Software/Restaurante/Diagramas/Diagramas%20de%20Sequ%C3%AAncia/Excluir%20Pedido.png)

---

## ▶️ Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/cadastro-produto-java.git
   ```
2. Compile os arquivos `.java`:
   ```bash
   javac *.java
   ```
3. Execute a interface gráfica:
   ```bash
   java ProdutoForm
   ```

---

## 🧠 Objetivos Didáticos

breve explicação

---

## 📂 Organização dos Arquivos

```
CadastroProdutoCSV/
├── Projeto/
│   ├── src/
│   │   └── main/
│   │       └── java/
│   │           └── com/
│   │               └── mycompany/
│   │                   └── cadastroproduto/
│   │                       ├── Produto.java
│   │                       ├── ProdutoForm.java
│   │                       └── ProdutoRepository.java
│   └── produtos.csv
├── LICENSE
└── README.md
```

---

### 🗂️ Descrição dos Diretórios e Arquivos

- **`Produto.java`**: Classe que representa o modelo de dados.
- **`ProdutoForm.java`**: Interface gráfica (Swing) para entrada de dados.
- **`ProdutoRepository.java`**: Responsável por salvar e carregar produtos do arquivo CSV.
- **`produtos.csv`**: Arquivo onde os dados são persistidos.
- **`LICENSE`**: Arquivo de licença MIT.
- **`README.md`**: Este arquivo com instruções e explicações do projeto.

---

## 🧩 Desafio

Como exercício complementar, **projete e implemente as demais funcionalidades do CRUD (Create, Read, Update, Delete)** para produtos:

- 📖 **Listar Produtos**: Leia e exiba todos os produtos cadastrados no CSV.
- ✏️ **Atualizar Produto**: Permita alterar as informações de um produto existente.
- ❌ **Excluir Produto**: Implemente uma forma de apagar um produto do CSV.

> 💡 Lembre-se de adaptar o repositório e a interface gráfica para essas operações, sempre mantendo a separação entre lógica de apresentação e acesso a dados.

---

## 📄 Licença

Este projeto está licenciado sob os termos da licença MIT.  
Consulte o arquivo [LICENSE](LICENSE) para mais informações.

---

## 📌 Casos de Uso

<!-- Adicione aqui a descrição detalhada dos casos de uso -->

---

## 📌 Caso de Uso Descritivo

<!-- Adicione aqui os casos de uso descritivos -->

---

## 👤 Autor

**Aluno: Yuri Alexander Costa Machado**  
Curso de Ciência da Computação – Universidade Franciscana (UFN)

📧 E-mail: yuricostamachado7@gmail.com  
🔗 GitHub: [@Yuyukiin](https://github.com/Yuyukiin)
