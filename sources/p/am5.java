package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class am5 implements Serializable {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public am5(String str, boolean z, String str2, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    private final Object readResolve() {
        return new bm5(this.a, this.c, this.b, this.d);
    }
}
