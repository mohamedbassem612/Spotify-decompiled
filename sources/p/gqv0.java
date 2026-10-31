package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gqv0 {
    public final hqv0 a;
    public final int b;

    public gqv0(hqv0 hqv0Var, int i) {
        this.a = hqv0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqv0)) {
            return false;
        }
        gqv0 gqv0Var = (gqv0) obj;
        return this.a.equals(gqv0Var.a) && this.b == gqv0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
