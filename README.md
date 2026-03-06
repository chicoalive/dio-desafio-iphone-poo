# DIO Trilha Java Básico - Desafio POO

[![Status](https://img.shields.io/badge/status-CONCLU%C3%8ADO-brightgreen)]()

## 🎯 Objetivo
Modelar e implementar em Java as funcionalidades do iPhone 2007:
- **Reprodutor Musical**
- **Aparelho Telefônico**
- **Navegador Internet**

## 📊 Diagrama UML (Mermaid)
```mermaid
# DIO Trilha Java Básico - Desafio POO

## Diagrama UML
```mermaid
classDiagram
class Iphone
class ReprodutorMusical{
<<interface>>
+tocar() void
+pausar() void
+selecionarMusica(musica : String) void
}
class AparelhoTelefonico{
<<interface>>
+ligar(numero : String) void
+atender() void
+iniciarCorreioVoz() void
}
class NavegadorInternet{
<<interface>>
+exibirPagina(url : String) void
+adicionarNovaAba() void
+atualizarPagina() void
}
Iphone ..|> ReprodutorMusical : implements
Iphone ..|> AparelhoTelefonico : implements
Iphone ..|> NavegadorInternet : implements

🏗️ Estrutura do Projeto
src/
├── main/Main.java
├── entities/Iphone.java
└── interfaces/*


🚀 Como Executar
Clone este repositório

Abra no IntelliJ IDEA

Execute a classe Main

Siga as instruções interativas no console!

✨ Funcionalidades Implementadas

| Interface           | Métodos                                                       |
| ------------------- | ------------------------------------------------------------- |
| Reprodutor Musical  | tocar(), pausar(), selecionarMusica("música")                 |
| Aparelho Telefônico | ligar("119"), atender(), iniciarCorreioVoz()                  |
| Navegador Internet  | exibirPagina("dio.me"), adicionarNovaAba(), atualizarPagina() |

📱 Exemplo de Saída
Testando funcionalidade telefônica dos Iphone 18
Digite um número: 119
Discando para o numero 119
Chamada sendo atendida

Desafio concluído com implementação completa e interativa!
