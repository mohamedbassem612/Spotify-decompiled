package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class isk1 implements qsk1 {
    public final xl61 a;

    public isk1(xl61 xl61Var) {
        this.a = xl61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof isk1) && this.a.equals(((isk1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
