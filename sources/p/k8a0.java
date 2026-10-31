package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public enum k8a0 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(fhc.class, fhc.c),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    public final Class a;

    k8a0(Class cls, Serializable serializable) {
        this.a = cls;
    }
}
