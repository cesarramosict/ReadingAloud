# ReadingAloud

**An app that reads content aloud** — turns texts, books, and articles into audio, for anyone who wants to listen while doing something else.

> **Status:** Phase 1 — core logic in pure Java (no Android yet). Runnable and testable in IntelliJ IDEA as an ordinary Java program.

---

## What it is

ReadingAloud takes a file (`.txt`, and later `.epub`, `.pdf`), extracts the text, organizes it into readable chunks, and "reads it aloud" in the chosen language and voice.

In this first phase, **"speaking" means printing the text to the console**, chunk by chunk. Real speech synthesis (TextToSpeech) arrives in Phase 2, together with the Android layer — with no need to rewrite the current logic. Only the "output engine" gets swapped, not the class design.

## Architecture

The code is organized into three layers with separate responsibilities:

| Layer | Responsibility |
| --- | --- |
| **importer** | Each file format knows how to extract plain text. Built on an interface. |
| **content** | The normalized text, split into readable chunks (`Document` and its types). |
| **reader** | Takes a `Document` and reads it aloud. Knows the voice and the language. |

This separation (low coupling) is what lets you add a new format without touching the rest of the project.

## Technologies

- **Java 17+**
- **JUnit 5** for the tests
- Class, field, and method names in English; comments and documentation in Portuguese.

## Package structure

```
com.readingaloud
com.readingaloud.content     →  Document, Book, TextChunker
com.readingaloud.importer    →  Importer, TxtImporter, ImporterRegistry
com.readingaloud.reader      →  Reader, VoiceGender
com.readingaloud.exception   →  UnsupportedFormatException
com.readingaloud.Main        →  entry point for testing everything together
```

## How to run

**With IntelliJ IDEA (recommended):**

1. Open the project in IntelliJ.
2. Open the `Main` class.
3. Click the ▶ button next to the `main` method.

**From the command line:**

```bash
# from the project root
javac -d out $(find src -name "*.java")
java -cp out com.readingaloud.Main
```

## Roadmap

- **Phase 2 — real voice:** on Android, the `Reader` switches to actual speech synthesis.
- **New formats:** EPUB, PDF, and web articles, each as a new importer that fulfills the `Importer` contract.
- **Reverse path (audio → text):** transcribe audio from videos/music into text, with a focus on accessibility.

## License

Distributed under the MIT license. See [`LICENSE`](LICENSE) for details.

## Author

cesarramosict
