package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gvv0 {
    public final ow50 a;
    public final int b;

    public gvv0(ow50 ow50Var, int i) {
        this.a = ow50Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvv0)) {
            return false;
        }
        gvv0 gvv0Var = (gvv0) obj;
        return this.a.equals(gvv0Var.a) && this.b == gvv0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
