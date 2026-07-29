package com.readingaloud.importer;

import com.readingaloud.content.Document;

import java.io.IOException;

public class TxtImporter implements Importer {
    public boolean canHandle;
    private Document read;

    public TxtImporter(boolean canHandle, Document read) {
        this.canHandle = canHandle;
        this.read = read;
    }

    public Document getRead() {
        return read;
    }

    public void setRead(Document read) {
        this.read = read;
    }

    public boolean isCanHandle() {
        return canHandle;
    }

    public void setCanHandle(boolean canHandle) {
        this.canHandle = canHandle;
    }

    @Override
    public boolean canHandle(String fileName) {
        return false;
    }

    @Override
    public Document read(String filePath) throws IOException {
        return null;
    }
}
