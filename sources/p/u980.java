package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u980 implements fn51 {
    public final p4f0 a;
    public final p4f0 b;
    public long c;

    public u980(long j, long[] jArr, long[] jArr2) {
        p4f0 p4f0Var;
        p4f0 p4f0Var2;
        dm5.m(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            p4f0Var = new p4f0(length);
            this.a = p4f0Var;
            p4f0Var2 = new p4f0(length);
            this.b = p4f0Var2;
        } else {
            int i = length + 1;
            p4f0Var = new p4f0(i);
            this.a = p4f0Var;
            p4f0Var2 = new p4f0(i);
            this.b = p4f0Var2;
            p4f0Var.a(0L);
            p4f0Var2.a(0L);
        }
        p4f0Var.b(jArr);
        p4f0Var2.b(jArr2);
        this.c = j;
    }

    @Override // p.fn51
    public final en51 b(long j) {
        p4f0 p4f0Var = this.b;
        if (p4f0Var.b == 0) {
            pn51 pn51Var = pn51.c;
            return new en51(pn51Var, pn51Var);
        }
        int iD = zoi1.d(p4f0Var, j);
        long jE = p4f0Var.e(iD);
        p4f0 p4f0Var2 = this.a;
        pn51 pn51Var2 = new pn51(jE, p4f0Var2.e(iD));
        if (jE == j || iD == p4f0Var.b - 1) {
            return new en51(pn51Var2, pn51Var2);
        }
        int i = iD + 1;
        return new en51(pn51Var2, new pn51(p4f0Var.e(i), p4f0Var2.e(i)));
    }

    @Override // p.fn51
    public final boolean d() {
        return this.b.b > 0;
    }

    @Override // p.fn51
    public final long g() {
        return this.c;
    }
}
