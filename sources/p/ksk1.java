package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ksk1 implements qsk1 {
    public final xl61 a;

    public ksk1(xl61 xl61Var) {
        this.a = xl61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ksk1) && this.a.equals(((ksk1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
