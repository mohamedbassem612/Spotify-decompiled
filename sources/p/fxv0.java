package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fxv0 {
    public final vuv0 a;

    public fxv0(vuv0 vuv0Var) {
        this.a = vuv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fxv0) && this.a.equals(((fxv0) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(1) + (this.a.hashCode() * 31);
    }
}
