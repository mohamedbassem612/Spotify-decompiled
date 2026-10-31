package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fja implements dbr0 {
    public final gvn0 a;

    public fja(gvn0 gvn0Var) {
        this.a = gvn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fja) && this.a == ((fja) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
