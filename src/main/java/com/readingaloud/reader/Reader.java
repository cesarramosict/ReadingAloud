package com.readingaloud.reader;

import java.util.Locale;

public class Reader {
    private VoiceGender voice;
    private Locale language;

    public Reader(VoiceGender voice, Locale language) {
        this.voice = voice;
        this.language = language;
    }

    public VoiceGender getVoice() {
        return voice;
    }

    public void setVoice(VoiceGender voice) {
        this.voice = voice;
    }

    public Locale getLanguage() {
        return language;
    }

    public void setLanguage(Locale language) {
        this.language = language;
    }


}
