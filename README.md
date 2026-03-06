
DIO Trilha Java Básico - Desafio POO

🎯 Diagrama UML
classDiagram 
class Iphone {

}
Iphone ..|> ReprodutorMusical
Iphone ..|> AparelhoTelefonico
Iphone ..|> NavegadorInternet

class ReprodutorMusical {
    <<interface>>
    +tocar(): void
    +pausar(): void
    +selecionarMusica(musica: String): void
}

class AparelhoTelefonico {
    <<interface>>
    +ligar(numero: String): void
    +atender(): void
    +iniciarCorreioVoz(): void
}

class NavegadorInternet {
    <<interface>>
    +exibirPagina(url: String): void
    +adicionarNovaAba(): void
    +atualizarPagina(): void
}
