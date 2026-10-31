package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zhb1 implements fui1 {
    public final fui1 a;
    public final long b;

    public zhb1(fui1 fui1Var, long j) {
        this.a = fui1Var;
        this.b = j;
    }

    public final boolean b() {
        return this.a.b();
    }

    public final long e(oe5 oe5Var, oe5 oe5Var2, oe5 oe5Var3) {
        return this.a.e(oe5Var, oe5Var2, oe5Var3) + this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zhb1)) {
            return false;
        }
        zhb1 zhb1Var = (zhb1) obj;
        return zhb1Var.b == this.b && u890.j(zhb1Var.a, this.a);
    }

    public final oe5 g(long j, oe5 oe5Var, oe5 oe5Var2, oe5 oe5Var3) {
        long j2 = this.b;
        return j < j2 ? oe5Var3 : this.a.g(j - j2, oe5Var, oe5Var2, oe5Var3);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final oe5 n(long j, oe5 oe5Var, oe5 oe5Var2, oe5 oe5Var3) {
        long j2 = this.b;
        return j < j2 ? oe5Var : this.a.n(j - j2, oe5Var, oe5Var2, oe5Var3);
    }
}
