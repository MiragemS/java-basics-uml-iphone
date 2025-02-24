# Java Native Cloud - Bradesco + Dio

``` mermaid

---
title: Minimalist diagram - Iphone
---
classDiagram
    ReprodutorMusical <|-- Iphone
    AparelhoTelefonico <|-- Iphone
    ExplorarInternet <|-- Iphone

    class Iphone{
        -status
        +ligar()void
        +desbloquear()void
        +desligar()void
    }

    class ReprodutorMusical {
        <<interface>>
        +tocar() void
        +pausar() void
        +selecionarMusica(String musica):void
    }
    class AparelhoTelefonico{
        <<interface>>
        +ligar()void
        +atender()void
        +iniciarCorreiroDeVoz()void
    }
    class ExplorarInternet{
        <<interface>>
        +exibirPagina(String url)void
        +adicionarNovaAba()void
        +atualizarPagina()void
    }



```
