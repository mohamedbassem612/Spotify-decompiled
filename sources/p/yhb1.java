package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yhb1 implements fe5 {
    public final fe5 a;
    public final long b;

    public yhb1(fe5 fe5Var, long j) {
        this.a = fe5Var;
        this.b = j;
    }

    public final fui1 a(tzg1 tzg1Var) {
        return new zhb1(this.a.a(tzg1Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yhb1)) {
            return false;
        }
        yhb1 yhb1Var = (yhb1) obj;
        return yhb1Var.b == this.b && u890.j(yhb1Var.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
