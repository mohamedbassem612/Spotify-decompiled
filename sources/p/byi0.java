package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class byi0 implements Serializable {
    public final String a;
    public final int b;
    public final String c;

    public byi0(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    private Object readResolve() {
        return new cyi0(this.a, this.b, this.c);
    }
}
