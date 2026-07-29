package com.readingaloud.importer;

import com.readingaloud.content.Document;

import java.io.IOException;

public interface Importer {
    boolean canHandle(String fileName);
    Document read(String filePath) throws IOException;



}
