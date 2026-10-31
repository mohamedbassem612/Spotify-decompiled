package p;

import java.math.RoundingMode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bbg {
    public final fc9 a;
    public final gtf1 b;
    public final int c;
    public final int d;
    public final long e;
    public final boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public long m;
    public long[] n;
    public int[] o;

    public bbg(int i, fc9 fc9Var, gtf1 gtf1Var, boolean z) {
        int i2 = fc9Var.d;
        this.a = fc9Var;
        this.f = z;
        int iA = fc9Var.a();
        boolean z2 = true;
        if (iA != 1 && iA != 2) {
            z2 = false;
        }
        dm5.m(z2);
        int i3 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.c = (iA == 2 ? 1667497984 : 1651965952) | i3;
        long j = ((long) fc9Var.b) * 1000000;
        long j2 = fc9Var.c;
        String str = zoi1.a;
        this.e = zoi1.g0(i2, j, j2, RoundingMode.DOWN);
        this.b = gtf1Var;
        this.d = iA == 2 ? i3 | 1650720768 : -1;
        this.m = -1L;
        this.n = new long[512];
        this.o = new int[512];
        this.g = i2;
    }

    public final pn51 a(int i) {
        return new pn51((this.e / ((long) this.g)) * ((long) this.o[i]), this.n[i]);
    }

    public final en51 b(long j) {
        if (this.l == 0) {
            pn51 pn51Var = new pn51(0L, this.m);
            return new en51(pn51Var, pn51Var);
        }
        int i = (int) (j / (this.e / ((long) this.g)));
        int iE = zoi1.e(this.o, i, true, true);
        if (this.o[iE] == i) {
            pn51 pn51VarA = a(iE);
            return new en51(pn51VarA, pn51VarA);
        }
        pn51 pn51VarA2 = a(iE);
        int i2 = iE + 1;
        return i2 < this.n.length ? new en51(pn51VarA2, a(i2)) : new en51(pn51VarA2, pn51VarA2);
    }
}
