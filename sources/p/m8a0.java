package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum m8a0 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(phc.class, phc.b),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    public final Class a;

    m8a0(Class cls, Serializable serializable) {
        this.a = cls;
    }
}
