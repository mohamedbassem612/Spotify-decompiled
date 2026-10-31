package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fj0 {
    public final ej0 a;

    public fj0(ej0 ej0Var) {
        this.a = ej0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fj0) && this.a.equals(((fj0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
