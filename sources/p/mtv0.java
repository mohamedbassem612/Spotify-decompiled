package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mtv0 {
    public final ktv0 a;
    public final int b;

    public mtv0(ktv0 ktv0Var, int i) {
        this.a = ktv0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mtv0)) {
            return false;
        }
        mtv0 mtv0Var = (mtv0) obj;
        return u890.j(this.a, mtv0Var.a) && this.b == mtv0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
