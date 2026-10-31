package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fmd0 {
    public final tb81 a;

    public fmd0(tb81 tb81Var) {
        this.a = tb81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fmd0) && this.a.equals(((fmd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
