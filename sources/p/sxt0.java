package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sxt0 implements zxt0 {
    public final y6b1 a;
    public final y6b1 b;
    public final long c;
    public final Long d;
    public final String e;

    public sxt0(y6b1 y6b1Var, y6b1 y6b1Var2, long j, Long l, String str) {
        this.a = y6b1Var;
        this.b = y6b1Var2;
        this.c = j;
        this.d = l;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxt0)) {
            return false;
        }
        sxt0 sxt0Var = (sxt0) obj;
        return this.a.equals(sxt0Var.a) && this.b.equals(sxt0Var.b) && this.c == sxt0Var.c && u890.j(this.d, sxt0Var.d) && u890.j(this.e, sxt0Var.e);
    }

    public final int hashCode() {
        int iF = cy30.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
        Long l = this.d;
        return this.e.hashCode() + ((iF + (l == null ? 0 : l.hashCode())) * 31);
    }
}
