package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yd implements Serializable {
    public final String a;

    public yd(String str) {
        this.a = str;
    }

    private final Object readResolve() {
        return new zd((String) null, this.a);
    }
}
