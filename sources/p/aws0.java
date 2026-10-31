package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aws0 implements ews0 {
    public final gxs0 a;

    public aws0(gxs0 gxs0Var) {
        this.a = gxs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aws0) && this.a.equals(((aws0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
