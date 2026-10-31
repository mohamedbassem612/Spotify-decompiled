package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kpj0 implements mpj0 {
    public final xg60 a;

    public kpj0(xg60 xg60Var) {
        this.a = xg60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kpj0) && this.a.equals(((kpj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
