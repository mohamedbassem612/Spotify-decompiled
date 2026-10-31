package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class btv0 {
    public final ow50 a;
    public final int b;

    public btv0(ow50 ow50Var, int i) {
        this.a = ow50Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btv0)) {
            return false;
        }
        btv0 btv0Var = (btv0) obj;
        return this.a.equals(btv0Var.a) && this.b == btv0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
