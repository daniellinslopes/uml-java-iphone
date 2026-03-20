# Desafio de Projeto: Modelagem e Diagramação de um Componente iPhone

Este repositório contém a resolução do desafio de modelagem orientada a objetos, focada no componente **iPhone** baseado em seu lançamento histórico de 2007. O objetivo é representar as três funcionalidades principais anunciadas por Steve Jobs: **Reprodutor Musical**, **Aparelho Telefônico** e **Navegador na Internet**.

## 🎯 Objetivo do Projeto

Praticar os conceitos de **Interfaces**, **Classes** e **Polimorfismo** utilizando a linguagem Java, além de exercitar a criação de diagramas UML para visualização da arquitetura.

## 📊 Diagrama de Classes (UML)

Abaixo, a representação visual de como as interfaces se conectam à classe principal.



```plantuml
@startuml
interface ReprodutorMusical {
    + tocar(): void
    + pausar(): void
    + selecionarMusica(musica: String): void
}

interface AparelhoTelefonico {
    + ligar(numero: String): void
    + atender(): void
    + iniciarCorreioVoz(): void
}

interface NavegadorInternet {
    + exibirPagina(url: String): void
    + adicionarNovaAba(): void
    + atualizar(): void
}

class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    + tocar(): void
    + pausar(): void
    + selecionarMusica(musica: String): void
    + ligar(numero: String): void
    + atender(): void
    + iniciarCorreioVoz(): void
    + exibirPagina(url: String): void
    + adicionarNovaAba(): void
    + atualizar(): void
}
@enduml