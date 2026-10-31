package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dke0 extends e9p1 {
    public final jj40 c;

    public dke0(jj40 jj40Var) {
        this.c = jj40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dke0) && this.c.equals(((dke0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
