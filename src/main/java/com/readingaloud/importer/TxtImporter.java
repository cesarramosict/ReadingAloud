package com.readingaloud.importer;

import com.readingaloud.content.Document;

import java.io.IOException;

public class TxtImporter implements Importer {
    boolean canHandle(String fileName) {
        return false;
    }

    Document read(String filePath) {
        return null;
    }


}
