package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonInclude$Include;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class ReferenceTypeSerializer<T> extends StdSerializer<T> {
    public static final Object MARKER_FOR_EMPTY = JsonInclude$Include.NON_EMPTY;
}
