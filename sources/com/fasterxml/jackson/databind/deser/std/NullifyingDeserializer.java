package com.fasterxml.jackson.databind.deser.std;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class NullifyingDeserializer extends StdDeserializer<Object> {
    public static final NullifyingDeserializer instance = new NullifyingDeserializer();

    public NullifyingDeserializer() {
        super(Object.class);
    }
}
