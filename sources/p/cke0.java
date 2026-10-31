package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cke0 extends e9p1 {
    public final jj40 c;

    public cke0(jj40 jj40Var) {
        this.c = jj40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cke0) && this.c.equals(((cke0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
