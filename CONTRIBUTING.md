# Como contribuir com o ReadingAloud

Obrigado pelo interesse em contribuir! Este é um projeto em construção e toda ajuda é bem-vinda — seja código, documentação, testes ou ideias.

## Antes de começar

Vale a pena ler os documentos de design do projeto para entender **por que** cada peça existe e como as camadas se encaixam. Eles explicam a razão de cada classe, não só o que ela faz.

## Reportar um problema (issue)

Encontrou um bug ou tem uma sugestão? Abra uma **issue** e inclua:

- O que você esperava que acontecesse.
- O que aconteceu de fato.
- Como reproduzir (passos, arquivo de teste usado, etc.), se for um bug.

## Enviar uma alteração (pull request)

1. Faça um **fork** do repositório.
2. Crie uma branch com um nome descritivo:
   ```bash
   git checkout -b feat/epub-importer
   ```
3. Faça suas alterações e escreva/ajuste os testes.
4. Confirme que tudo compila e que os testes passam.
5. Faça o commit com uma mensagem clara:
   ```bash
   git commit -m "Adiciona EpubImporter para arquivos .epub"
   ```
6. Envie a branch e abra um **pull request**, explicando o que mudou e por quê.

## Convenções de código

- **Java 17+**.
- **Nomes** de classes, campos e métodos em **inglês**; **comentários e documentação em português**.
- Cada classe com uma responsabilidade única (baixo acoplamento).
- Novos formatos de arquivo devem implementar a interface `Importer` e ser registrados no `ImporterRegistry` — sem alterar o resto do programa.
- Toda nova funcionalidade deve vir acompanhada de testes (JUnit 5).

## Por onde começar

Se você é novo por aqui, procure as issues marcadas com **`good first issue`** — são tarefas menores e bem delimitadas, ideais para uma primeira contribuição.

Algumas ideias registradas no backlog:
- Novos importadores: `EpubImporter`, `PdfImporter`.
- Refinar a divisão de texto no `TextChunker` (hoje quebra por parágrafo).
- Transcrição de áudio para texto (caminho inverso).

Qualquer dúvida, abra uma issue perguntando. Bora construir juntos!
