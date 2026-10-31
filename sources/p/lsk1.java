package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lsk1 implements qsk1 {
    public final xl61 a;

    public lsk1(xl61 xl61Var) {
        this.a = xl61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lsk1) && this.a.equals(((lsk1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
