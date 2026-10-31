package com.fasterxml.jackson.databind.deser.std;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class StringDeserializer extends StdScalarDeserializer<String> {
    public static final StringDeserializer instance = new StringDeserializer();

    public StringDeserializer() {
        super(String.class);
    }
}
