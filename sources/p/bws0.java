package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bws0 implements ews0 {
    public final gxs0 a;
    public final int b;

    public bws0(gxs0 gxs0Var, int i) {
        this.a = gxs0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bws0)) {
            return false;
        }
        bws0 bws0Var = (bws0) obj;
        return this.a.equals(bws0Var.a) && this.b == bws0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
