package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JsonSerializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class SerializableSerializer extends StdSerializer<JsonSerializable> {
    public static final SerializableSerializer instance = new SerializableSerializer();

    public SerializableSerializer() {
        super(JsonSerializable.class);
    }
}
