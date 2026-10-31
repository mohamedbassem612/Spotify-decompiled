package com.fasterxml.jackson.databind.ser.std;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class UUIDSerializer extends StdScalarSerializer<UUID> {
    static final char[] HEX_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    protected final Boolean _asBinary;

    public UUIDSerializer(Boolean bool) {
        super(UUID.class);
        this._asBinary = bool;
    }

    public UUIDSerializer() {
        this(null);
    }
}
