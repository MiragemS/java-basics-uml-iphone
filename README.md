# Java Native Cloud - Bradesco + Dio

Exercício com abertura para grande melhoria e otimização. Pode-se considerar uma entrega parcial, apenas com o desenvolvimento de interfaces e métodos básicos. Em suma, planejo fazer melhorias recorrentes, possivelmente começando com interações imersivas de ligar celular, inserir senha (informada em um construtor) e adendos.

``` mermaid

---
title: Minimalist diagram - Iphone
---
classDiagram
    ReprodutorMusical <|-- Iphone
    AparelhoTelefonico <|-- Iphone
    ExplorarInternet <|-- Iphone

    class Iphone{
        
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

Eu poderia fazer com que os métodos das interfaces fossem defaults, visto que só há uma única classe extendendo-os. Mas num cenário fictício em que haveriam outras classes extendendo, manterei os métodos sem implementação, passando o dever para o Iphone.
