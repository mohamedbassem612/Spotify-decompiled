package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uf7 implements xf7 {
    public final sfu0 a;

    public uf7(sfu0 sfu0Var) {
        this.a = sfu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uf7) && this.a.equals(((uf7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
