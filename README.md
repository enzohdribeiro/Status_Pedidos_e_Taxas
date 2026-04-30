# Exercício: E-commerce e Enums

**Enums com Atributos e Métodos** para centralizar regras de negócio, substituindo estruturas condicionais como (`if/else` ou `switch`) por uma arquitetura mais limpa e orientada a objetos.

## Conceitos Aplicados

| Conceito | Explicação Técnica |
| :--- | :--- |
| **Enum Attributes** | Uso de campos `private final` dentro do Enum para armazenar dados fixos. |
| **Encapsulamento** | O `valorTotal` é calculado internamente, sem expor a lógica de soma para a `Main` ou `Impressora`. |
| **Delegation (Delegação)** | O objeto `Produto` delega chamadas de prazo e taxa para o objeto `TipoEnvio`. |
| **Clean Code** | Eliminação de `switches` ou `ifs` repetitivos para tratar diferentes categorias de envio. |

---

## Estrutura

### 1. Enum com Poder de Classe (`TipoEnvio.java`)
Diferente de enums convencionais que servem apenas como etiquetas, o `TipoEnvio` funciona como um detentor de regras:
- **Atributos Finais:** Cada tipo (`PADRAO`, `EXPRESSO`, `INTERNACIONAL`) possui sua própria `taxaEntrega`, `prazoEntrega` e uma String amigável para exibição.
- **Construtor Customizado:** Os valores são passados diretamente na declaração das constantes, garantindo que não existam tipos de envio sem regras definidas.
- **Método de Cálculo:** O método `valorTotal(double valor)` realiza a lógica matemática dentro do próprio Enum, seguindo o princípio de que o dado deve estar próximo de quem sabe manipulá-lo.

### 2. Modelo de Dados (`Produto.java`)
A classe `Produto` utiliza a composição com o Enum.
- **Delegando Responsabilidades:** Em vez de o Produto calcular o frete, ele pergunta ao seu `tipoEnvio` qual é o valor final. Isso mantém a classe `Produto` focada apenas em representar o item.

### 3. Controller e Exibição (`Impressora.java`)
A classe de serviço de impressão agora é genérica para qualquer produto. Ela acessa os dados através dos métodos delegados do Produto, demonstrando como o encapsulamento protege a lógica interna do sistema.

---


