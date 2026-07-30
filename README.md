# ReadingAloud

**Um aplicativo que lê conteúdo em voz alta** — transforma textos, livros e artigos em áudio, para quem quer ouvir enquanto faz outras coisas.

> **Status:** Fase 1 — núcleo de lógica em Java puro (sem Android ainda). Executável e testável no IntelliJ IDEA como um programa Java comum.

---

## O que é

O ReadingAloud pega um arquivo (`.txt`, e no futuro `.epub`, `.pdf`), extrai o texto, o organiza em trechos legíveis e o "lê em voz alta" no idioma e voz escolhidos.

Nesta primeira fase, **"falar" significa imprimir o texto no console**, trecho a trecho. A síntese de voz real (TextToSpeech) entra na Fase 2, junto com a camada Android — sem precisar reescrever a lógica atual. Troca-se apenas o "motor de saída", não o desenho das classes.

## Arquitetura

O código se organiza em três camadas com responsabilidades separadas:

| Camada | Responsabilidade |
| --- | --- |
| **importer** | Cada formato de arquivo sabe extrair texto puro. Baseada numa interface. |
| **content** | O texto normalizado e dividido em trechos legíveis (`Document` e seus tipos). |
| **reader** | Pega um `Document` e o lê em voz alta. Conhece a voz e o idioma. |

Essa separação (baixo acoplamento) é o que permite adicionar um formato novo sem mexer no resto do projeto.

## Tecnologias

- **Java 17+**
- **JUnit 5** para os testes
- Nomes de classes, campos e métodos em inglês; comentários e documentação em português.

## Estrutura de pacotes

```
com.readingaloud
com.readingaloud.content     →  Document, Book, TextChunker
com.readingaloud.importer    →  Importer, TxtImporter, ImporterRegistry
com.readingaloud.reader      →  Reader, VoiceGender
com.readingaloud.exception   →  UnsupportedFormatException
com.readingaloud.Main        →  ponto de entrada para testar tudo junto
```

## Como rodar

**Pelo IntelliJ IDEA (recomendado):**
1. Abra o projeto no IntelliJ.
2. Abra a classe `Main`.
3. Clique no botão ▶ ao lado do método `main`.

**Pela linha de comando:**
```bash
# a partir da raiz do projeto
javac -d out $(find src -name "*.java")
java -cp out com.readingaloud.Main
```

## Roadmap

- **Fase 2 — voz real:** no Android, o `Reader` passa a usar síntese de voz de verdade.
- **Novos formatos:** EPUB, PDF e artigos da web, cada um como um novo importador que assina o contrato `Importer`.
- **Caminho inverso (áudio → texto):** transcrever áudio de vídeos/músicas em texto, com foco em acessibilidade.

## Licença

Distribuído sob a licença MIT. Veja [`LICENSE`](LICENSE) para mais detalhes.

## Autor

cesarramosict
